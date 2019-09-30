
public class AgeFinder {

	public String getMaxAge(Dog[] dogs) {
		int MaxAge = dogs[0].getAge();
		int indexOfMaxValue = 0;
		for (int i = 1; i < dogs.length; i++) {
			if (dogs[i].getAge() > MaxAge) {
				indexOfMaxValue = i;
			}
		}
		return dogs[indexOfMaxValue].getName() + " " + dogs[indexOfMaxValue].getBreed();
	}

}
