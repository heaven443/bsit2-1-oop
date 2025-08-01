// Importing the Scanner to read the users input.
import java.util.Scanner;

public class numloop {

    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner numScan = new Scanner(System.in);
            // then create a int object
            int totNum = 0;

        // Doing a for loop to repeatedly ask the user for numbers until the
        // limit of 5 is reached
        for (int i = 1; i <= 5; i++) {
               // Every time the loop runs the "i" variable will be up by 1
            System.out.print("Enter number " + i + ": ");
            // every number that is entered will be added to the total sum of the number
            int num = numScan.nextInt();
            totNum += num;
        }
            // once the loop has finished it will print out the total number
        System.out.println("Total Number: " + totNum);
        numScan.close();
    }
}
