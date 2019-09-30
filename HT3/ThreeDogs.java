
public class ThreeDogs {

	public static void main(String[] args) {

		Dog firstDog = new Dog("Lessie", String.valueOf(DogBreeds.BOXER), 5);
		Dog secondDog = new Dog("Coco", String.valueOf(DogBreeds.COLLIE), 1);
		Dog thirdDog = new Dog("Coco", String.valueOf(DogBreeds.TERRIER), 6);

		Dog[] dogs = { firstDog, secondDog, thirdDog };

		AgeFinder a = new AgeFinder();

		System.out.println(a.getMaxAge(dogs));

		System.out.println(firstDog.equals(secondDog));
		System.out.println(secondDog.equals(thirdDog));
		System.out.println(thirdDog.equals(firstDog));

	}

}
