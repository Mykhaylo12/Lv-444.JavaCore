
public class BirdFlock {

	public static void main(String[] args) {

		Bird[] birds = new Bird[4];
		birds[0] = new Eagle("brown and white", 2);
		birds[1] = new Swallow("black", 3);
		birds[2] = new Kiwi("brown", 2);
		birds[3] = new Penguin("black and white", 2);

		for (int i = 0; birds.length > i; i++) {
			System.out.println("I am " + birds[i].getClass().getName() + " " + birds[i] + "and " + birds[i].fly());
		}
	}
}
