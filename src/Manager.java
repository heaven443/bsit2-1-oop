public class Manager extends Employee {
    private double bonus;
    private int teamSize;

    public Manager(String name, String department, int employeeId, double baseSalary, double bonus, int teamSize) {
        super(name, department, employeeId, baseSalary);
        this.bonus = bonus;
        this.teamSize = teamSize;

        System.out.println(name + " Has been promoted to Manager.");
    }

    @Override
    public double calculateSalary() {

        return baseSalary + bonus;
    }

    public void work() {
        super.work();
        System.out.println(name + " is managing a team of " + teamSize + " Employees.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus : $" + bonus);
        System.out.println("Team Size : " + teamSize);
    }


}
