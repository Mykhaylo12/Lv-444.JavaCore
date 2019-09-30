package Hm4;

public class Dog {
public static int ò=0;
private int age ;
private Breed breed;
public static String names[]=new String[3];
Breed br = Breed.Akita;
public Dog(String name, int age, String breed) {
	
	switch(breed.toLowerCase()) {
	case"akita":
		this.breed=Breed.Akita;break;
	case"bulldog":
		this.breed=Breed.Bulldog;break;
	case"beagle":
		this.breed=Breed.Beagle;break;
	case"chowchow":
		this.breed=Breed.ChowChow;break;
	case"chug":
		this.breed=Breed.Chug;break;
	case"labrador":
		this.breed=Breed.Labrador;break;
		
		}
	names[ò] = name.toLowerCase();
	this.age = age;
	ò++;
}
		public  void check () {
			for(int i = 0; i < names.length;i++) {
				for(int j = i+1;j<names.length;j++) {
					if(names[i].equals(names[j])) {
						System.out.println("dog"+i+" and dog"+j+" have same name");
					}
					else {
						System.out.println("dog"+i+" and dog"+j+" don't have same name");
					}
				}
			}	
}

		
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Breed getBreed() {
	return breed;
}

}


