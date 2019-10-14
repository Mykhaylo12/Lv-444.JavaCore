package hm;

public class ContractE extends Emplo {
	public ContractE(int federalM, int salary, int EmploID) {
		this.EmploID = EmploID;
		this.federalM = federalM;
		this.salary = salary;
	}

	private int federalM;
	private int salary;

	@Override
	public int calculate() {
		return salary;
	}

	@Override
	public String toString() {
		return "ContractE [federalM=" + federalM +  ", EmploID=" + EmploID + "]";
	}

}
