public class getting_input_from_user {

    public static void main(String[] args) {

        // ============================================================
        //              GETTING INPUT FROM USER IN JAVA
        // ============================================================
        // ➤ Java provides the Scanner class to read input from the keyboard.
        // ➤ It is part of the java.util package.
        // ➤ Scanner can read: strings, integers, floats, booleans, etc.

        // Example import (normally written at the top of the file):
        // import java.util.Scanner;

        // Creating a Scanner object to read input from System.in (keyboard)
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // ---------------------- Reading a String ----------------------

        System.out.print("Enter your name: ");   // Prompt the user

        // nextLine() → reads a full line of text including spaces
        String name = scanner.nextLine();


        // ---------------------- Reading an Integer ----------------------

        System.out.print("Enter your age: ");

        // hasNextInt() → checks if the next input is an integer
        // Returns:
        // true  → if the user enters a valid integer
        // false → if input is NOT an integer
        boolean b1 = scanner.hasNextInt();
        System.out.println(b1);   // Prints true/false based on user input

        // nextInt() → reads an integer value from the user
        int age = scanner.nextInt();


        // ---------------------- Displaying the Output ----------------------

        System.out.println("Hello, " + name + "! You are " + age + " years old.");


        // ---------------------- Closing Scanner ----------------------
        // Prevents resource leakage (good practice)
        scanner.close();
    }
}

// ============================================================
// 📌 next() → reads a single word only
// 📌 nextLine() → reads full line (string with spaces)
// 📌 nextInt() → reads only integers
// 📌 nextDouble() → reads decimal numbers
// 📌 System.in → input device (keyboard)
// 📌 System.out → output device (screen)
// 📌 scanner.close() → frees system resources, good practice
//