public class literal {

    public static void main(String[] args) {

        // ============================================================
        //                 INTEGER LITERALS (Base Values)
        // ============================================================

        // Decimal literal: normal base-10 number system (0–9)
        int decimalLiteral = 100;

        // Octal literal: starts with 0, base-8 number system (0–7)
        // 0144 (octal) = 100 (decimal)
        int octalLiteral = 0144;

        // Hexadecimal literal: starts with 0x or 0X, base-16 (0–9, A–F)
        // 0x64 = 100 (decimal)
        int hexLiteral = 0x64;

        // Binary literal: starts with 0b or 0B, base-2 (0 and 1)
        // 0b1100100 = 100 (decimal)
        int binaryLiteral = 0b1100100;


        // ============================================================
        //               PRIMITIVE DATA TYPES WITH LITERALS
        // ============================================================

        // byte: 1 byte, range -128 to 127
        // Literal: small integer (fits in byte range)
        byte b = 10;

        // short: 2 bytes, range -32768 to 32767
        // Literal: normal decimal value
        short s = 20;

        // long: 8 bytes, used for large integers
        // Must end with L or l
        long l = 1000L;

        // char: 2 bytes, stores a single Unicode character
        // Literal: enclosed in single quotes
        char ch = 'A';

        // float: 4 bytes, single precision
        // Must end with f or F (because default is double)
        float f = 10.5f;

        // double: 8 bytes, double precision
        // Default type for decimal values
        double d = 99.99;


        // ============================================================
        //               CHARACTER & STRING LITERALS
        // ============================================================

        // Character literal: a single character
        char charLiteral = 'A';

        // String literal: sequence of characters in double quotes
        String stringLiteral = "Hello";


        // ============================================================
        //                    BOOLEAN LITERALS
        // ============================================================

        // Boolean literals: only true or false
        boolean booleanLiteralTrue = true;
        boolean booleanLiteralFalse = false;


        // ============================================================
        //                   PRINTING ALL LITERALS
        // ============================================================

        System.out.println("Decimal Literal: " + decimalLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hexadecimal Literal: " + hexLiteral);
        System.out.println("Binary Literal: " + binaryLiteral);
        System.out.println("Byte Literal: " + b);
        System.out.println("Short Literal: " + s);
        System.out.println("Long Literal: " + l);
        System.out.println("Char Literal: " + ch);
        System.out.println("Float Literal: " + f);
        System.out.println("Double Literal: " + d);
        System.out.println("Character Literal: " + charLiteral);
        System.out.println("String Literal: " + stringLiteral);
        System.out.println("Boolean Literal (true): " + booleanLiteralTrue);
        System.out.println("Boolean Literal (false): " + booleanLiteralFalse);
    }
}
