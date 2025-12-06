public class varible {

    // Instance variables (non-static)
    // These belong to the object, not the class
    int a = 100;
    int b = 200;

    // Default constructor
    public varible() {
        // Constructor is empty but gets called when object is created
    }

    public static void main(String[] args) {

        // Creating an object of class 'varible'
        // Needed to access non-static (instance) variables 'a' and 'b'
        varible obj = new varible();

        // Local variables (inside method)
        byte x = 10;
        byte y = 20;

        // Addition of two byte values
        // Note: Expression result is automatically promoted to int
        System.out.println(x + y);       // Output: 30
        System.out.println(x + y);       // Output: 30 again

        // Printing using System.err (error output stream)
        System.err.println("hello");     // Printed in red in console (error stream)

        // Accessing instance variables using object reference
        System.out.println(obj.a + obj.b); // Output: 300

        // print() does not add a new line
        System.out.print(x + y);        // Prints: 30
        System.out.print(obj.a + obj.b); // Prints: 300 right next to previous output
    }
}
