package hm6;

public class Swallow extends Flying {

	@Override
	void fly() {
	System.out.println("I flying)");
	}

	@Override
	public String toString() {
		return "Swallow [Flying bird,feathers=" + feathers + ", layE=" + layE + "]";
	}

}
