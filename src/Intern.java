public class Intern extends Employee {
    private String university;
    private boolean isFullTime;

    public Intern(String name, String department, int employeeId, double baseSalary, String university, boolean isFullTime) {
        super(name, department, employeeId, baseSalary);
        this.university = university;
        this.isFullTime = isFullTime;

        System.out.println("Intern " + name + " From " + university + " has Started.");

    }

    @Override
    public double calculateSalary() {

        return baseSalary * 0.5;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("University : " + university);
        System.out.println("Full Time : " + isFullTime);
    }

    public void work() {

        System.out.println(name + " is learning and assisting with tasks");
    }

}
