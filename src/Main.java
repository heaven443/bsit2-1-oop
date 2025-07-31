class Main {

    // Student Information
    String studentId = "";
    String firstName = "";
    String lastName = "";
    String course = "";
    String section = "";

    // Student Scores
    int midtermExamScore = 0;
    int finalExamScore = 0;
    int projectScore = 0;
    int attendancePercentage = 0;

    public static void main(String[] args) {
        Main student = new Main();

        // Student Information
        student.StudentInfo("W20101200", "Test", "Subject", "Testing Canditate", "TS-20");
        student.StudentScore(80, 90, 85, 95);

        // Displaying Information and Scores
        student.displayStudentInfo();
        student.displayStudentScore();
    }

// Student Information
    // ID, First Name, Last Name, Course, Section
    // Sets the student information

    public void StudentInfo(String stdIDlocal, String fnLocal, String lnLocal, String crseLocal, String secLocal) {

        // Table of Student Information
        // ID, First Name, Last Name, Course, Section

        studentId = stdIDlocal;
        firstName = fnLocal;
        lastName = lnLocal;
        course = crseLocal;
        section = secLocal;

    }

    public void displayStudentInfo() {

        // Sets to display the Information prodvided

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + firstName + ", " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
    }


// Student Scores
    // Midterm Exam Score, Final Exam Score, Project Score, Attendance Percentage
    // and whether to Fail or Pass the student based on the average score

    public void StudentScore(int midtermScore, int finalScore, int projectsScore, int attendancerate) {

        // Table of Student Scores
        // Midterm Exam Score, Final Exam Score, Project Score, Attendance Percentage

        midtermExamScore = midtermScore;
        finalExamScore = finalScore;
        projectScore = projectsScore;
        attendancePercentage = attendancerate;

    }

    public void displayStudentScore() {

        // Sets to display the Scores provided

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermExamScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Percentage: " + attendancePercentage);

        double averageScore = (midtermExamScore + finalExamScore + projectScore + attendancePercentage) / 4.0;
        System.out.printf("Average Score: %.2f\n", averageScore);

        if (averageScore < 75) {
            System.out.println("Remarks: FAILED");
        } else {
            System.out.println("Remarks: PASSED");
        }
    }
}