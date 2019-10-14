package hm6;

public class Eagle extends Flying {

	@Override
	void fly() {
		System.out.println("I flying)");
	}

	@Override
	public String toString() {
		return "Eagle [Flying bird,feathers=" + feathers + ", layE=" + layE + "]";
	}

}
