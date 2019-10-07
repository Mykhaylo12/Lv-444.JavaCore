
public abstract class Bird {

	public String feathers;
	public int layEggs;

	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public abstract String fly();

	public String toString() {
		return "I have " + feathers + " feathers and I lay " + layEggs + " eggs ";
	}
}
