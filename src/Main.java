class Student {

    // Data Types Listings
    public double average = 0;
    public double[] grades = {};
    public String letterGrade = "";

    // Calculating the Average Grades using a "for loop"
    public double calculateAverage(double... grades){
        // Temporary Data type for adding the sum of the grades
        double adding = 0;

        // Adding the sum of the given grades
        for (double calculate : grades){
            adding += calculate;
        }

        // Returns the grades while dividing the length of it ie. "sum / grades.length("example. 5")"
        return average = (double) adding / grades.length;
    }

    // Getting the letter Grade using the Average Score from "calculateAverage"
    public String getLetterGrade(double average){

        // Checks if the average grades are applicable on the conditions given
        if (average >= 100){
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            // if none are found, then it will just result as an F
            letterGrade = "F";
        }

        // when finished it will just return the letter grade and can be accessed using "objectname.letterGrade"
        return letterGrade;
    }

    // Displays the result WITHOUT the letterGrade using Overloading
    public void displayResult(String studentName, double average) {
        System.out.println("Name : " + studentName + ", " + "Average : " + average);
    }

    // Displays the result WITH the letterGrade using Overloading
    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.println("Name : " + studentName + ", " + "Average : " + average + ", " + "Grade : "+ letterGrade);
    }
}

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.calculateAverage( 85.5, 92.0, 78.5, 90.0); // Give the Grades
        student1.getLetterGrade(student1.average); // Calculate the average using the "calculateAverage" Class
        student1.displayResult("John Smith", student1.average); // Displaying WITHOUT the letterGrade using Overloading
        student1.displayResult("John Smith", student1.average, student1.letterGrade); // Displaying WITH the letterGrade using Overloading

    }
}
