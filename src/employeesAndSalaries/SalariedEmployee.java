package employeesAndSalaries;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
