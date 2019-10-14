package hm6;

public class Penguin extends Nonflying {

	@Override
	void fly() {
		System.out.println("I can't fly(");
	}

	@Override
	public String toString() {
		return "Penguin [Nonflying bird,feathers=" + feathers + ", layE=" + layE + "]";
	}

}
