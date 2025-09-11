public class main {
    public static void main(String[] args) {

        System.out.println("=== Employee Management System ===");
        System.out.println(" ");

        Manager manager = new Manager("Alice Smith", "Engineering", 2001, 80000, 15000, 8);
        Developer developer = new Developer("Bob Johnson", "Engineering", 2002, 70000 , "Java", 5);
        Intern intern = new Intern("Charlie Brown", "Engineering", 2003, 30000, "Tech University", true);

        manager.displayInfo();
        manager.work();
        System.out.println("Monthly Salary : $" + manager.calculateSalary());

        developer.displayInfo();
        developer.work();
        System.out.println("Monthly Salary : $" + developer.calculateSalary());

        intern.displayInfo();
        intern.work();
        System.out.println("Monthly Salary : $" + intern.calculateSalary());
    }
}
