package com.softseve.lukas5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

	public static void main(String[] args) throws IOException {
		// MUST DO
		// Necessary ADD check if two dog have same Age.
		//
		boolean bdogSameName =false;
		Dog dogAgeMax = new Dog();
		String ssameName = null;
		final int DOG_COUNT =3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		Dog dog[] = new Dog[DOG_COUNT];
		System.out.println("Input name, age, breed {0,1,2] for each dog.");		
		for (int i = 0; i < dog.length; i++) {
			System.out.println("Input for dog." + (i+1));			
			dog[i] = new Dog(br.readLine(),Integer.parseInt(br.readLine()),Dog.Breed.values()[Integer.parseInt(br.readLine())]);			
		}
//		Dog dog1 = new Dog(br.readLine(),Integer.parseInt(br.readLine()),Dog.Breed.BreedA);
//		Dog dog2 = new Dog(br.readLine(),Integer.parseInt(br.readLine()),Dog.Breed.BreedB);
//		Dog dog3 = new Dog(br.readLine(),Integer.parseInt(br.readLine()),Dog.Breed.BreedB);
		
		//Check dog name for equals.
		for (Dog dog2 : dog) {
			String tempName=dog2.getSdogName();
			int tempAge=dog2.getIdogAge();
			dogAgeMax = dog2;
			for (Dog dog3 : dog) {
				//Check dog age for Max
				if (dog3.getIdogAge()>tempAge){
					
					dogAgeMax=dog3;
				}
				// Check dog name equal but dog different
				if (dog3.getSdogName().equalsIgnoreCase(tempName) && !dog3.equals(dog2)) {
					ssameName = dog3.getSdogName();
					bdogSameName=true;
				}
			}
		}
	if (bdogSameName){
		System.out.println("Not only one of dogs have name: " + ssameName);
	}
	else{
		System.out.println("All dogs have diffrent names.");		
	}
	System.out.println("The oldest dog is - Name: "+ dogAgeMax.getSdogName()+", Breed: "+ dogAgeMax.getDogBreed() +", Age: "+ dogAgeMax.getIdogAge());
	}

}
