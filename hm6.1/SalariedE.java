package hm;

public class SalariedE extends Emplo {

	private int rate = 40;
	private int hours;
	private int socialNumber;

	public SalariedE(int hours, int socialNumber, int EmploID) {
		this.EmploID = EmploID;
		this.hours = hours;
		this.socialNumber = socialNumber;
	}

	@Override
	public int calculate() {
		int salary = rate * hours;
		return salary;
	}

	@Override
	public String toString() {
		return "SalariedE [rate=" + rate + ", hours=" + hours + ", socialNumber=" + socialNumber + ", EmploID="
				+ EmploID + "]";
	}

}
