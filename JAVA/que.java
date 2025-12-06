
import java.util.Scanner;

public class que {

    // java program that calculates the board exam percentage for a student, 
    // based on marks obtained in five subjects.
    public static void main(String[] args) {
        // Marks obtained in five subjects
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        float subject1 = sc.nextFloat();

        System.out.print("Enter marks for subject 2: ");
        float subject2 = sc.nextFloat();

        System.out.print("Enter marks for subject 3: ");
        float subject3 = sc.nextFloat();

        System.out.print("Enter marks for subject 4: ");
        float subject4 = sc.nextFloat();

        System.out.print("Enter marks for subject 5: ");
        float subject5 = sc.nextFloat();

        if (subject1 < 0 || subject1 > 100
         || subject2 < 0 || subject2 > 100
         || subject3 < 0 || subject3 > 100
         || subject4 < 0 || subject4 > 100
         || subject5 < 0 || subject5 > 100) 
        {
            System.out.println("❌ Invalid marks! Marks must be between 0 and 100.");
            sc.close();
            return;
        }

        // Assuming each subject is out of 100 marks
        // Total marks possible
        float totalMarks = 500.0f;
        // Calculate total obtained marks
        float obtainedMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        // Calculate percentage
        float percentage = (obtainedMarks / totalMarks) * 100;
        // Display the percentage
        // %.2f formats the output to 2 decimal places
        System.out.printf("The board exam percentage is: %.2f%%\n", percentage);
        sc.close(); // Close the scanner to prevent resource leaks

    }

}
// ============================================================
// Usinng Array Method  
