public class petservice {
    private static final double BASE_FEE = 50.0;
    private static final double VACCINATION_FEE = 25.0;
    private static final double GROOMING_FEE = 30.0;

    public double calculateFee() {
        return BASE_FEE;
    }

    public static double calculate(boolean withVaccination) {
        return BASE_FEE + VACCINATION_FEE;
    }

    public static double calculate(boolean withVaccination, boolean withGrooming) {
        return BASE_FEE + VACCINATION_FEE + GROOMING_FEE;
    }

    public static double calculateFee(String emergencyType) {
        return 200;
    }

    public static void main(String[] args) {

        System.out.println("Basic Checkup : $" + BASE_FEE);
        System.out.println("Checkup with vaccination: $" + calculate(true));
        System.out.println("Full Service: $" + calculate(true, true));
        System.out.println("Emergency: $" + calculateFee(""));
    }
}
