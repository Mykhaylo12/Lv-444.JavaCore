package hm6;

public class Kiwi extends Nonflying{

	@Override
	void fly() {
System.out.println("i can't fly(");
	}

	@Override
	public String toString() {
		return "Kiwi [ Nonflying bird,feathers=" + feathers + ", layE=" + layE + "]";
	}

}
