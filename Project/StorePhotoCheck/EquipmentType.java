package com.softserve.lukas20191022;

public class EquipmentType {
	private int ID;
	private String equipmentType;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	public EquipmentType(int iD, String equipmentType) {

		ID = iD;
		this.equipmentType = equipmentType;
	}
	@Override
	public String toString() {
		return "EquipmentType [ID=" + ID + ", equipmentType=" + equipmentType
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result
				+ ((equipmentType == null) ? 0 : equipmentType.hashCode());
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
		EquipmentType other = (EquipmentType) obj;
		if (ID != other.ID)
			return false;
		if (equipmentType == null) {
			if (other.equipmentType != null)
				return false;
		} else if (!equipmentType.equals(other.equipmentType))
			return false;
		return true;
	}
	
	
	
	
}
