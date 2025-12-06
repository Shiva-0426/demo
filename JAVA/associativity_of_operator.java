public class associativity_of_operator {
    public static void main(String[] args) {
        int a =6*5-34/2;
        int b =6/5-34*2;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        // According to operator precedence and associativity:
        // 1. Multiplication (*) and Division (/) have higher precedence than Subtraction (-).
        // 2. Both Multiplication and Division have the same precedence, so we evaluate them from left to right (left-to-right associativity).
        // Step 1: Evaluate 6 * 5 = 30    
        // Step 2: Evaluate 34 / 2 = 17
        // Step 3: Now perform the subtraction: 30 - 17 = 13
            
        
    }
}
/* 
================= ASSOCIATIVITY SUMMARY =================

Most operators in Java are evaluated **left to right**.

Left-to-Right Associativity:
---------------------------
*   /   %        (Multiplicative)
+   -            (Additive)
<<  >>  >>>      (Shift)
<  <=  >  >=     (Relational)
==  !=           (Equality)
&                (Bitwise AND)
^                (Bitwise XOR)
|                (Bitwise OR)
&&               (Logical AND)
||               (Logical OR)
=  +=  -= ...    (Assignment*) → Actually right-to-left (exception noted)

Right-to-Left Associativity:
----------------------------
++   --          (Unary)
!    ~           (Logical/Bitwise NOT)
+   -            (Unary plus/minus)
(type)           (Casting)
?:               (Ternary Operator)
=  +=  -= ...    (Assignment Operators)

Note:
- **Left-to-right** means evaluate from the left side first.
- **Right-to-left** means evaluate from the right side first.

=========================================================
*/
