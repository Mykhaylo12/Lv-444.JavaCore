package com.softserve.lukas20191022;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// task 1: Fill photocheckset array according to filter .txt(Class FileFilter, Class TxtFileFilter)
// task 2: Fill equipment array from sqlite base according to article number.
// task 3: Fill sales array from sqlite base according to maxdade.
// task 4: Sales array is filtered by contragent for corresponding article.
// task 5: Count Eqiupments by criteria (Sample equipmentType, Sorted).

public class Appl {
	private static String input(BufferedReader br, String message)
			throws IOException {
		String inLine = null;
		// System.out.println("Input Article (Number 3 or 4 digits.)");
		System.out.println(message);
		try {
			inLine = br.readLine();
			if (!inLine.isEmpty()) {
				return inLine;
			} else {
				System.out.println("You nothing input.");
				input(br, "Every one please");
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {

		}
		return "";

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//final String STORE_PHOTOCHECK_DIR = "D:\\Lib\\Docs_from_Internet\\JAVA\\JAVA_core\\StorePhotoCheck";
		//final int ALL_EQUIPMENT = -1;
		
		Config config = new Config();
		File dir = new File(config.getSTORE_PHOTOCHECK_DIR());
		List<PhotoCheck> photocheckset = new ArrayList<PhotoCheck>();
		List<Equipment> currentEquipment = new ArrayList<Equipment>();
		List<Equipment> allEquipment = new ArrayList<Equipment>();
		List<Sales> currentSales = new ArrayList<Sales>();


		
		Connection co = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

		int inArticle = 0;

		int idContr;

		LocalDate maxDate = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Task 1
		System.out.println("Task 1----------------");
		PhotoCheckInFields photocheckinfield = new PhotoCheckInFields();
		photocheckinfield.fetchChild(dir, photocheckset);

		// For test
		Iterator<PhotoCheck> it1 = photocheckset.iterator();
		while (it1.hasNext()) {
			System.out.println((PhotoCheck) it1.next());
		}

		// Task 2
		// Need check for format /d{3,4}?
		System.out.println("Task 2----------------");

		while (inArticle == 0) {
			inArticle = Integer.parseInt(input(br,
					"Input Article (Number 3 or 4 digits."));
		}

		// Task 3
		// Need check for format maxdate
		System.out.println("Task 3----------------");
		while (maxDate == null) {
			maxDate = LocalDate.parse(
					input(br, "Input Date in format YYYMMDD"), formatter);
		}
		if (br != null) {
			br.close();
		}

		// Database init. NEED to bring into a separate class
		try {

			Class.forName("org.sqlite.JDBC");
			co = DriverManager.getConnection(

			"jdbc:sqlite:D:\\Sqlite\\sales1022.db");

			System.out.println("Connected");

			// FOR TEST
			// /////////
			// Statement statement = co.createStatement();
			// ResultSet set =
			// statement.executeQuery("SELECT id_Contr,id_Nom, Article, Serial, Type, Type_Parent, Region, Agent, ID_Type FROM tblEquipment, tblEquipmentType WHERE (tblEquipment.Type=tblEquipmentType.Equipment_type) AND (Article='1442');");
			// //ResultSet set =
			// statement.executeQuery("SELECT id_Contr FROM tblEquipment");
			// //System.out.println(set.toString());
			//
			// //set.beforeFirst();
			// while(set.next())
			// {
			//
			//
			// // you can also use set.getString(columnindex);
			//
			// Equipment equipment = new Equipment();
			// equipment.setArticle(set.getInt("Article"));
			// equipment.setID(set.getInt("Id_Nom"));
			// equipment.setEquipmentype(new
			// EquipmentType(set.getInt("ID_Type"),set.getString("Type")));
			// equipment.setEquipmentTypeParent(set.getString("Type_Parent"));
			// equipment.setId_Agent(set.getInt("Agent"));
			// equipment.setId_Contragen(set.getInt("id_Contr"));
			// equipment.setSerial(set.getString("Serial"));
			// equipment.setId_Region(set.getInt("Region"));
			//
			//
			// currentEquipment.add(equipment);
			// }
			// For test
			// currentEquipment = (Equipment.getEquipments(1442));

			currentEquipment = (Equipment.getEquipments1(inArticle, co));

			// FOR TEST
			// /////////
			Iterator<Equipment> it = currentEquipment.iterator();
			if (!it.hasNext()) {
				System.out.println("Equipment with article " + inArticle
						+ " is not found.");
			}
			while (it.hasNext()) {
				System.out.println((Equipment) it.next());
			}

			idContr = currentEquipment.get(0).getId_Contragen();
			System.out.println("Contragent ID Number: ");
			System.out.println(idContr);

			currentSales = (Sales.getSales(maxDate, co));

			// Task 4 Java 8 filter
			Stream<Sales> streamSales = currentSales.stream();
			streamSales.filter(s -> s.getId_Contragent() == idContr).forEach(
					s -> System.out.println(s.toString()));

			// Task 5
			
			System.out.println("AHT RIO S100");
			allEquipment = (Equipment.getEquipments1(config.getALL_EQUIPMENT(), co));
			Stream <Equipment> streamAllEquipments = allEquipment.stream();
			//NEED add sorted i count by criteria (id Agent, Id region) 

//			streamAllEquipments.filter(s -> s.getEquipmentype().getEquipmentType().equals("AHT RIO S100"))
//			.sorted(Comparator.comparing(Equipment.compareByRegion(a, b)).collect(Collectors.toList())
//					.forEach(s -> System.out.println(s.toString())));			
			streamAllEquipments.filter(s -> s.getEquipmentype().getEquipmentType().equals("AHT RIO S100"))
					.forEach(s -> System.out.println(s.toString()));			

			
			//
			// FOR TEST
			// /////////
//			Iterator<Sales> it2 = currentSales.iterator();
//			if (!it2.hasNext()) {
//				System.out.println("Sales <= " + maxDate + " is not found.");
//			}
//			while (it2.hasNext()) {
//				//FOR TEST
//				//////////
//				System.out.println((Sales) it2.next());
//			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				co.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//FOR TEST
		//////////
		// System.out.println("File[] listFiles():\n");
		//
		//
		//
		// File[] children = dir.listFiles();
		//
		// for (File file : children) {
		// System.out.println(file.getAbsolutePath());
		// }
		//
		// System.out.println("\n-----------------------");
		//
		// System.out.println("String[] list():\n");
		//
		// String[] paths = dir.list();
		//
		// for (String path : paths) {
		// System.out.println(path);
		// }
	}

}
