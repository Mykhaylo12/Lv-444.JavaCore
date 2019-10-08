package hw5.task2;

public class ContractEmployee extends Employee implements Calculate {
    private String federalTaxIdMember;
    private final double hourlyRate;
    private int numberOfHoursWorked;

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double getSalary() {
        return calculatePay();
    }

    @Override
    public double calculatePay() {
        return getNumberOfHoursWorked()*hourlyRate;
    }
}
