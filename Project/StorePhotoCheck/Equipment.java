package com.softserve.lukas20191022;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipment implements Comparable<Equipment> {
	private int Article;
	private String Serial;
	private EquipmentType equipmentype;
	private String EquipmentTypeParent;
	private int id_Region;
	private int id_Agent;
	private int id_Contragen;
	private int ID;

	public Equipment() {

	};

	public Equipment(int article, String serial, EquipmentType equipmentype,
			String equipmentTypeParent, int id_Region, int id_Agent,
			int id_Contragen, int iD) {
		super();
		Article = article;
		Serial = serial;
		this.equipmentype = equipmentype;
		EquipmentTypeParent = equipmentTypeParent;
		this.id_Region = id_Region;
		this.id_Agent = id_Agent;
		this.id_Contragen = id_Contragen;
		ID = iD;
	}

	@Override
	public String toString() {
		return "Equipment [Article=" + Article + ", Serial=" + Serial
				+ ", equipmentype=" + equipmentype + ", EquipmentTypeParent="
				+ EquipmentTypeParent + ", id_Region=" + id_Region
				+ ", id_Agent=" + id_Agent + ", id_Contragen=" + id_Contragen
				+ ", ID=" + ID + "]";
	}

	public int getArticle() {
		return Article;
	}

	public void setArticle(int article) {
		Article = article;
	}

	public String getSerial() {
		return Serial;
	}

	public void setSerial(String serial) {
		Serial = serial;
	}

	public EquipmentType getEquipmentype() {
		return equipmentype;
	}

	public void setEquipmentype(EquipmentType equipmentype) {
		this.equipmentype = equipmentype;
	}

	public String getEquipmentTypeParent() {
		return EquipmentTypeParent;
	}

	public void setEquipmentTypeParent(String equipmentTypeParent) {
		EquipmentTypeParent = equipmentTypeParent;
	}

	public int getId_Region() {
		return id_Region;
	}

	public void setId_Region(int id_Region) {
		this.id_Region = id_Region;
	}

	public int getId_Agent() {
		return id_Agent;
	}

	public void setId_Agent(int id_Agent) {
		this.id_Agent = id_Agent;
	}

	public int getId_Contragen() {
		return id_Contragen;
	}

	public void setId_Contragen(int id_Contragen) {
		this.id_Contragen = id_Contragen;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
////For test
//	public static List<Equipment> getEquipments(int article)
//			throws SQLException {
//		List<Equipment> result = new ArrayList<Equipment>();
//		Connection connection = null;
//
//		try {
//			Class.forName("org.sqlite.JDBC");
//			connection = DriverManager.getConnection(
//
//			"jdbc:sqlite:D:\\Sqlite\\sales1022.db");
//
//			System.out.println("Connected");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		Statement statement = connection.createStatement();
//		ResultSet set = statement
//				.executeQuery("SELECT id_Contr,id_Nom, Article, Serial, Type, Type_Parent, Region, Agent,"
//						+ " ID_Type FROM tblEquipment,"
//						+ " tblEquipmentType WHERE (tblEquipment.Type=tblEquipmentType.Equipment_type) AND (Article='"
//						+ article + "')");
//
//		 //set.beforeFirst();
//		while (set.next()) {
//
//			// you can also use set.getString(columnindex);
//
//			Equipment equipment = new Equipment();
//			equipment.setArticle(set.getInt("Article"));
//			equipment.setID(set.getInt("Id_Nom"));
//			equipment.setEquipmentype(new EquipmentType(set.getInt("ID_Type"),
//					set.getString("Type")));
//			equipment.setEquipmentTypeParent(set.getString("Type_Parent"));
//			equipment.setId_Agent(set.getInt("Agent"));
//			equipment.setId_Contragen(set.getInt("id_Contr"));
//			equipment.setSerial(set.getString("Serial"));
//			equipment.setId_Region(set.getInt("Region"));
//
//			result.add(equipment);
//		}
//
////		Iterator<Equipment> it = result.iterator();
////		while (it.hasNext()) {
////			System.out.println((Equipment) it.next());
////		}
//
//		connection.close();
//		return result;
//	}

	
	public static List<Equipment> getEquipments1(int article,Connection connection)
			throws SQLException {
		List<Equipment> result = new ArrayList<Equipment>();
		Config config = new Config();
		String querytext=null;
		querytext="SELECT id_Contr,id_Nom, Article, Serial, Type, Type_Parent, Region, Agent,"
						+ " ID_Type FROM tblEquipment,"
						+ " tblEquipmentType WHERE (tblEquipment.Type=tblEquipmentType.Equipment_type) ";
		
		if(article!=config.getALL_EQUIPMENT()){
			
			querytext=querytext.concat(" AND (Article='" + article + "')");
		}
		Statement statement = connection.createStatement();
//		ResultSet set = statement
//				.executeQuery("SELECT id_Contr,id_Nom, Article, Serial, Type, Type_Parent, Region, Agent,"
//						+ " ID_Type FROM tblEquipment,"
//						+ " tblEquipmentType WHERE (tblEquipment.Type=tblEquipmentType.Equipment_type) AND (Article='"
//						+ article + "')");
		ResultSet set = statement.executeQuery(querytext);
		 //set.beforeFirst();
		while (set.next()) {

			// you can also use set.getString(columnindex);

			Equipment equipment = new Equipment();
			
			equipment.setArticle(set.getInt("Article"));
			equipment.setID(set.getInt("Id_Nom"));
			equipment.setEquipmentype(new EquipmentType(set.getInt("ID_Type"),
					set.getString("Type")));
			equipment.setEquipmentTypeParent(set.getString("Type_Parent"));
			equipment.setId_Agent(set.getInt("Agent"));
			equipment.setId_Contragen(set.getInt("id_Contr"));
			equipment.setSerial(set.getString("Serial"));
			equipment.setId_Region(set.getInt("Region"));

			result.add(equipment);
		}


		return result;
	}
    
	public static int compareByRegion(Equipment a, Equipment b) {
        return a.id_Region.compareTo(b.id_Region);    
        }
    
    public static int compareByAgent(Equipment a, Equipment b) {
        return a.id_Agent.compareTo(b.id_Agent);
        }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Article;
		result = prime
				* result
				+ ((EquipmentTypeParent == null) ? 0 : EquipmentTypeParent
						.hashCode());
		result = prime * result + ID;
		result = prime * result + ((Serial == null) ? 0 : Serial.hashCode());
		result = prime * result
				+ ((equipmentype == null) ? 0 : equipmentype.hashCode());
		result = prime * result + id_Agent;
		result = prime * result + id_Contragen;
		result = prime * result + id_Region;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (Article != other.Article)
			return false;
		if (EquipmentTypeParent == null) {
			if (other.EquipmentTypeParent != null)
				return false;
		} else if (!EquipmentTypeParent.equals(other.EquipmentTypeParent))
			return false;
		if (ID != other.ID)
			return false;
		if (Serial == null) {
			if (other.Serial != null)
				return false;
		} else if (!Serial.equals(other.Serial))
			return false;
		if (equipmentype == null) {
			if (other.equipmentype != null)
				return false;
		} else if (!equipmentype.equals(other.equipmentype))
			return false;
		if (id_Agent != other.id_Agent)
			return false;
		if (id_Contragen != other.id_Contragen)
			return false;
		if (id_Region != other.id_Region)
			return false;
		return true;
	}
//	@Override
//	public int compareTo(Equipment ob) {
//		return Serial.compareTo(ob.getSerial());
//	}
}
