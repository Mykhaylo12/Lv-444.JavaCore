package com.softseve.lukas5;

public class Dog {

	private String sdogName;
	private int idogAge;
	
	public static enum Breed { 
		BreedA, 
		BreedB, 
		BreedC;

	}
	private Breed dogBreed;
	
	public Dog(){};
	public String getSdogName() {
		return sdogName;
	}

	public void setSdogName(String sdogName) {
		this.sdogName = sdogName;
	}

	public int getIdogAge() {
		return idogAge;
	}

	public void setIdogAge(int idogAge) {
		this.idogAge = idogAge;
	}

	public Breed getDogBreed() {
		return dogBreed;
	}



	public Dog (String sdogName,int idogAge, Breed dogBreed){
		this.sdogName=sdogName;
		this.idogAge=idogAge;
		this.dogBreed=dogBreed;
		
		
	};  
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dogBreed == null) ? 0 : dogBreed.hashCode());
		result = prime * result + idogAge;
		result = prime * result
				+ ((sdogName == null) ? 0 : sdogName.hashCode());
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
		Dog other = (Dog) obj;
		if (dogBreed != other.dogBreed)
			return false;
		if (idogAge != other.idogAge)
			return false;
		if (sdogName == null) {
			if (other.sdogName != null)
				return false;
		} else if (!sdogName.equals(other.sdogName))
			return false;
		return true;
	}

	
}
