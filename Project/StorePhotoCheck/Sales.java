package com.softserve.lukas20191022;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class Sales {
	private int ID_Sale;
	private int id_Contragent;
	private int id_Good;
	private LocalDate Date;
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public Sales() {

	}

	public Sales(int iD_Sale, int id_Contragent, int id_Good, LocalDate date) {

		ID_Sale = iD_Sale;
		this.id_Contragent = id_Contragent;
		this.id_Good = id_Good;
		Date = date;
	}

	@Override
	public String toString() {
		return "Sales [ID_Sale=" + ID_Sale + ", id_Contragent=" + id_Contragent
				+ ", id_Good=" + id_Good + ", Date=" + Date + "]";
	}

	public int getID_Sale() {
		return ID_Sale;
	}

	public void setID_Sale(int iD_Sale) {
		ID_Sale = iD_Sale;
	}

	public int getId_Contragent() {
		return id_Contragent;
	}

	public void setId_Contragent(int id_Contragent) {
		this.id_Contragent = id_Contragent;
	}

	public int getId_Good() {
		return id_Good;
	}

	public void setId_Good(int id_Good) {
		this.id_Good = id_Good;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public static List<Sales> getSales(LocalDate maxdate,
			Connection connection) throws SQLException {
		List<Sales> result = new ArrayList<Sales>();

		Statement statement = connection.createStatement();
//		ResultSet set = statement
//				.executeQuery("SELECT id_Sale ,id_Contr, id_Nom, "
//						+ " MAX(DATE(substr(tblSales.Date,7,4)||'-'||substr(tblSales.Date,4,2)||'-'||substr(tblSales.Date,1,2))) as DATE1"
//						+ " FROM tblSales "
//						+ " WHERE "
//						+ " DATE(substr(tblSales.Date,7,4)||'-'||substr(tblSales.Date,4,2)||'-'||substr(tblSales.Date,1,2)) <= DATE('2019-07-06')"
//						+ " GROUP BY id_Contr, id_Nom ORDER BY id_Contr, id_Nom"
//						+ " ;");
		System.out.println(java.sql.Date.valueOf(maxdate));
		ResultSet set = statement
				.executeQuery("SELECT id_Sale ,id_Contr, id_Nom, "
						+ " MAX(DATE(substr(tblSales.Date,7,4)||'-'||substr(tblSales.Date,4,2)||'-'||substr(tblSales.Date,1,2))) as DATE1"
						+ " FROM tblSales "
						+ " WHERE "
						+ " DATE(substr(tblSales.Date,7,4)||'-'||substr(tblSales.Date,4,2)||'-'||substr(tblSales.Date,1,2)) <= DATE('"
						+  java.sql.Date.valueOf(maxdate)+"')"
						+ " GROUP BY id_Contr, id_Nom ORDER BY id_Contr, id_Nom"
						+ " ;");

		
		// set.beforeFirst();
		while (set.next()) {

			// you can also use set.getString(columnindex);

			Sales sale = new Sales();
			sale.setDate(LocalDate.parse(set.getString("DATE1"),formatter));
			//sale.setDate(set.getDate("DATE1"));
			
			sale.setId_Contragent(set.getInt("Id_Contr"));
			
			// Field reflection ERROR id_Contragent must be static?
//			Field idContr = Sales.class.getDeclaredField(id_Contragent);
//			Sales sale1 = new Sales();
//			idContr.set(sale1,1111);
			
			sale.setId_Good(set.getInt("Id_Nom"));
			sale.setID_Sale(set.getInt("Id_Sale"));

			result.add(sale);
		}

		return result;
	}
}
