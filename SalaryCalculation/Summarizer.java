
public class Summarizer {

	private double totalSum = 0;

	public double getTotalSum(Employee[] employees) {
		for (int i = 0; employees.length > i; i++) {
			totalSum = totalSum + employees[i].getBonuses();
		}
		return totalSum;
	}

}
