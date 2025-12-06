
public class operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // ============================================================
        //                     Arithmetic Operators
        // ============================================================
        System.out.println("a + b = " + (a + b)); // Addition: 10 + 20 = 30
        System.out.println("a - b = " + (a - b)); // Subtraction: 10 - 20 = -10
        System.out.println("a * b = " + (a * b)); // Multiplication: 200
        System.out.println("a / b = " + (a / b)); // Division: 10/20 = 0 (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder): 10 % 20 = 10

        // ============================================================
        //                     Relational Operators
        // ============================================================
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        // ============================================================
        //                     Logical Operators
        // ============================================================
        System.out.println("(a < b) && (a > 5): " + ((a < b) && (a > 5)));
        // true AND true → true

        System.out.println("(a < b) || (a > 15): " + ((a < b) || (a > 15)));
        // true OR false → true

        System.out.println("!(a < b): " + (!(a < b)));
        // NOT(true) → false

        // ============================================================
        //                   Assignment Operators
        // ============================================================
        int c = a;  // Simple assignment: c = 10
        c += b;     // c = c + b → 10 + 20 = 30
        System.out.println("c after c += b: " + c);

        // ============================================================
        //              Increment & Decrement Operators
        // ============================================================
        System.out.println("a before increment: " + a);
        System.out.println("a after increment (++a): " + (++a));
        // Pre-increment: increase first, then print → 11

        System.out.println("b before decrement: " + b);
        System.out.println("b after decrement (--b): " + (--b));
        // Pre-decrement: decrease first, then print → 19

        // ============================================================
        //                     Bitwise Operators
        // ============================================================
        // Bitwise operations are done at the binary level
        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR
        System.out.println("~a = " + (~a));       // Bitwise NOT (complement)

        System.out.println("a << 2 = " + (a << 2)); // Left shift (multiply by 2^n)
        System.out.println("a >> 2 = " + (a >> 2)); // Right shift (divide by 2^n)

    }
}
/*
============================================================
                SUMMARY OF OPERATORS IN JAVA
============================================================

1️⃣ Arithmetic Operators
------------------------
+   Addition           → a + b = 30
-   Subtraction        → a - b = -10
*   Multiplication     → a * b = 200
/   Division           → a / b = 0   (integer division)
/   Modulus            → a % b = 10  (remainder)

2️⃣ Relational Operators
------------------------
==  Equal to           → a == b → false
!=  Not equal to       → a != b → true
>   Greater than       → a > b → false
<   Less than          → a < b → true
>=  Greater or equal   → a >= b → false
<=  Less or equal      → a <= b → true

3️⃣ Logical Operators
---------------------
&&  Logical AND        → true only if both are true
||  Logical OR         → true if any one is true
!   Logical NOT        → reverses boolean value

Examples:
(a < b) && (a > 5)  → true
(a < b) || (a > 15) → true
!(a < b)            → false

4️⃣ Assignment Operators
------------------------
=   Simple assign      → c = a  (c becomes 10)
+=  Add & assign       → c += b → 30

5️⃣ Increment/Decrement Operators
---------------------------------
++a  Pre-increment     → increases a first, then prints
--b  Pre-decrement     → decreases b first, then prints

6️⃣ Bitwise Operators
---------------------
&    Bitwise AND       → compares bits
|    Bitwise OR        → compares bits
^    Bitwise XOR       → 1 when bits differ
~    Bitwise NOT       → flips all bits

<<   Left shift        → multiply by 2^n (a << 2 = 40)
>>   Right shift       → divide by 2^n   (a >> 2 = 2)

============================================================
 */
