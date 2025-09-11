public class Employee {

    protected String name;
    protected int employeeId;
    protected double baseSalary;
    protected String department;

    public Employee(String name, String department, int employeeId, double baseSalary){
        this.name = name;
        this.department = department;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;

        System.out.println("Employee " + name + " has been hired in " + department + " Department.");

    }

    public void displayInfo() {

        System.out.println("\n--- Employee Details ---");

        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Base Salary : $" + calculateSalary());
        System.out.println("Department : " + department);

    }

    public double calculateSalary() {

        return baseSalary;
    }

    public void work(){
        System.out.println(name + " is working on general tasks.");
    }

}
