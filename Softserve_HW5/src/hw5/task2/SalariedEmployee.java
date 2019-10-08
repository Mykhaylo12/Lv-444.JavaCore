package hw5.task2;

public class SalariedEmployee extends Employee implements Calculate {
    private String socialSecurityNumber;
    private double fixedMonthlyPay;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPay) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPay = fixedMonthlyPay;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public double calculatePay() {
        return fixedMonthlyPay;
    }

    public double getSalary(){
        return calculatePay();
    }
}
