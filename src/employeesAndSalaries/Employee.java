package employeesAndSalaries;

public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
