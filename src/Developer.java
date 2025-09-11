public class Developer extends Employee{
    private String programmingLanguage;
    private int projectsCompleted;

    public Developer(String name, String department, int employeeId, double baseSalary, String programmingLanguage, int projectsCompleted) {
        super(name, department, employeeId, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;

        System.out.println(name + " joined as a " + programmingLanguage + " Developer.");

    }

    @Override
    public double calculateSalary(){

        return baseSalary + (projectsCompleted * 1000);
    }

    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("Projects Completed : " + projectsCompleted);
    }
}
