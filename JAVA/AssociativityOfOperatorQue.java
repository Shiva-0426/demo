
import java.util.Scanner;

public class AssociativityOfOperatorQue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         Q1. What will be the result of the following expression?
             a = 7/4 * 9/2;
      Solution :
                7/4= 1.75
            so 1.75*9=15.75
         Q2. Write a Java program to encrypt a grade by adding 8 to it.
             Decrypt it to show the correct grade.

         Q3. Use comparison operators to find out whether a given number 
             is greater than the user-entered number or not.

         Q4. Write the following expression in a Java program:
             (v^2 - u^2) / (2as)

         Q5. Find the value of the following expression:
             int x = 7;
             int a = 7 * 49 / 7 + 35 / 7;  
             // Find value of a
         */
        //    Solution Q1.
         double a = 7.0 / 4.0 * 9.0 / 2.0;
         float b =  7/4 * 9/2;
       
        System.out.println("Result of the expression 7/4 * 9/2: " + a);
        System.out.println("Result of the expression 7/4 * 9/2: " + b);

        //    Solution Q2.
        char grade = 'B';
        grade = (char) (grade + 8); // Encrypting the grade
        System.out.println("Encrypted grade: " + grade);
        grade = (char) (grade - 8); // Decrypting the grade
        System.out.println("Decrypted grade: " + grade);

        //    Solution Q3.
        System.out.println("Enter a given number:");
        int givenNumber = sc.nextInt();
        System.out.println("Enter a user-entered number:");
        int userEnteredNumber = sc.nextInt();
        if (givenNumber > userEnteredNumber) {
            System.out.println("The given number is greater than the user-entered number.");
        } else if (givenNumber < userEnteredNumber) {
            System.out.println("The given number is less than the user-entered number.");
        } else {
            System.out.println("The given number is equal to the user-entered number.");
        }
        //    Solution Q4.
        System.out.println("(v*v - u*u) / (2*a*s)");

        //    Solution Q5
        // Evaluate step by step for clarity:
        // 7 * 49 = 343
        // 343 / 7 = 49
        // 35 / 7 = 5
        // 49 + 5 = 54
        int p = 7 * 49 / 7 + 35 / 7;
        System.out.println("Value of p: " + p);
    }

}
