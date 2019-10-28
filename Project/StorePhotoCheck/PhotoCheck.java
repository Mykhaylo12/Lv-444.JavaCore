package com.softserve.lukas20191022;

import java.time.LocalDate;



public class PhotoCheck {
	LocalDate photodate;
	String absolutepath="";
	String name="";
	int article;
	
	public PhotoCheck() {
		// TODO Auto-generated constructor stub
		
	}

	public PhotoCheck(LocalDate photodate, String absolutepath, String name,
			int article) {
		this.photodate = photodate;
		this.absolutepath = absolutepath;
		this.name = name;
		this.article = article;
	}

	public LocalDate getPhotodate() {
		return photodate;
	}

	public void setPhotodate(LocalDate photodate) {
		this.photodate = photodate;
	}

	public String getAbsolutepath() {
		return absolutepath;
	}

	public void setAbsolutepath(String absolutepath) {
		this.absolutepath = absolutepath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArticle() {
		return article;
	}

	public void setArticle(int article) {
		this.article = article;
	}

	

	@Override
	public String toString() {
		return "PhotoCheck [article=" + article + ", photodate=" + photodate
				+ ", name=" + name + ", absolutepath=" + absolutepath + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((photodate == null) ? 0 : photodate.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhotoCheck other = (PhotoCheck) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (photodate == null) {
			if (other.photodate != null)
				return false;
		} else if (!photodate.equals(other.photodate))
			return false;
		return true;
	}
	
	
}
