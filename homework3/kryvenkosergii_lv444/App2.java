package homework3.kryvenkosergii_lv444;

public class App2 {
	static String nameOldestDog = null;
	static String breedOldestDog = null;
	static int ageOldestDog = 0;

	protected static void check(String name1, String breed1, int age1, String name2, String breed2, int age2,
			String name3, String breed3, int age3) {

		// Checking the oldest dog
		if (age1 > age2 && age1 > age3) {
			nameOldestDog = name1;
			ageOldestDog = age1;
			breedOldestDog = breed1;
			System.out.printf("The oldest dog it's %s with breed %s and its age is %d\n", name1, breed1, age1);
		} else if (age2 > age1 && age2 > age3) {
			nameOldestDog = name2;
			ageOldestDog = age2;
			breedOldestDog = breed2;
			System.out.printf("The oldest dog it's %s with breed %s and its age is %d\n", name2, breed2, age2);
		} else if (age3 > age1 && age3 > age2) {
			nameOldestDog = name3;
			ageOldestDog = age3;
			breedOldestDog = breed3;
			System.out.printf("The oldest dog it's %s with breed %s and its age is %d\n", name3, breed3, age3);
		}

	}

	public static void main(String[] args) {

		Dog dog1 = new Dog("Charly", Breed.Boxer.getNameBreed(), 4);
		Dog dog2 = new Dog("Frank", Breed.GermanShepherdDog.getNameBreed(), 8);
		Dog dog3 = new Dog("Melony", Breed.Rottweiler.getNameBreed(), 5);

		check(dog1.getName(), dog1.getBreed(), dog1.getAge(), dog2.getName(), dog2.getBreed(), dog2.getAge(),
				dog3.getName(), dog3.getBreed(), dog3.getAge());

	}

}
