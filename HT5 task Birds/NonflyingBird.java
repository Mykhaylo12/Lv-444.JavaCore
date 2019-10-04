
public class NonflyingBird extends Bird {

	public NonflyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	public String fly() {
		return "I believe I can fly, but I can't...";
	}

}
