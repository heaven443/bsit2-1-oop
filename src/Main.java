class Student {

    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0;
    double grade2 = 0;
    double grade3 = 0;
    double average = 0;
    String Status = "N/A";
    int Passing = 1;
    int studentCount = 0;

    public Student() {

    }

    public void addStudentInfo(String getName, int getAge, String getCourse, double getFirstGrade, double getSecondGrade, double getThirdGrade) {
        name = getName;
        age = getAge;
        course = getCourse;
        grade1 = getFirstGrade;
        grade2 = getSecondGrade;
        grade3 = getThirdGrade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + (grade1) + ", " + (grade2) + ", " + (grade3));
    }

    public void getAverage() {
        average = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("Average: " + (average));
    }

    public void getLetterGrade() {

        if (average >= 90) {
            System.out.println("Letter Grade: A");
        } else if (average >= 80) {
            System.out.println("Letter Grade: B");
        } else if (average >= 70) {
            System.out.println("Letter Grade: C");
        } else if (average >= 60) {
            System.out.println("Letter Grade: D");
        } else if (average < 60) {
            System.out.println("Letter Grade: F");
        }
    }

    public void isPassing() {

        if (average >= 70) {
            Status = "PASSED";
            Passing = Passing + 1;
        } else {
            Status = "FAILED";
        }

        studentCount = studentCount + 1;
        System.out.println("Status: " + Status);
    }
}

    class Main {
        public static void main(String[] args) {

        Student firstStudent = new Student();
            firstStudent.addStudentInfo("Alice", 20, "BSIT", 85.0, 90.0, 88.0);

        Student secondStudent = new Student();
            secondStudent.addStudentInfo("Bobbert", 19, "BSCS", 92.0, 85.0, 89.0 );

        Student thirdStudent = new Student();
            thirdStudent.addStudentInfo("Joey", 23, "BSIT", 65.0, 70.0, 68.0 );

        System.out.println("\nStudent Information: ");

        firstStudent.displayInfo();
        firstStudent.getAverage();
        firstStudent.getLetterGrade();
        firstStudent.isPassing();
            System.out.println('\n');

        secondStudent.displayInfo();
        secondStudent.getAverage();
        secondStudent.getLetterGrade();
        secondStudent.isPassing();
            System.out.println('\n');

        thirdStudent.displayInfo();
        thirdStudent.getAverage();
        thirdStudent.getLetterGrade();
        thirdStudent.isPassing();
            System.out.println('\n');

        }
    }
