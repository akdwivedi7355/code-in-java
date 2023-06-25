public class A22_operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int modulus = a % b;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);
        
        // Assignment Operators
        int x = 10;
        x += 5; // equivalent to x = x + 5;
        System.out.println("Updated x: " + x);
        
        // Increment and Decrement Operators
        int i = 5;
        i++; // equivalent to i = i + 1;
        System.out.println("After increment: " + i);
        
        int j = 10;
        j--; // equivalent to j = j - 1;
        System.out.println("After decrement: " + j);
        
        // Relational Operators
        int num1 = 10;
        int num2 = 15;
        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != num2);
        boolean isGreater = (num1 > num2);
        boolean isLess = (num1 < num2);
        boolean isGreaterOrEqual = (num1 >= num2);
        boolean isLessOrEqual = (num1 <= num2);
        
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less or Equal: " + isLessOrEqual);
        
        // Logical Operators
        boolean p = true;
        boolean q = false;
        boolean logicalAnd = p && q;
        boolean logicalOr = p || q;
        boolean logicalNotP = !p;
        boolean logicalNotQ = !q;
        
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT P: " + logicalNotP);
        System.out.println("Logical NOT Q: " + logicalNotQ);
        
        // Conditional Operator (Ternary Operator)
        int num3 = 20;
        int num4 = 30;
        int max = (num3 > num4) ? num3 : num4;
        System.out.println("Maximum: " + max);
        
        // Bitwise Operators
        int binaryNum1 = 10; // 1010 in binary
        int binaryNum2 = 5;  // 0101 in binary
        int bitwiseAnd = binaryNum1 & binaryNum2;  // 0000
        int bitwiseOr = binaryNum1 | binaryNum2;   // 1111
        int bitwiseXor = binaryNum1 ^ binaryNum2;  // 1111
        int bitwiseComplement = ~binaryNum1;       // 0101
        
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement: " + bitwiseComplement);
        
        // Shift Operators
        int number = 8;  // 1000 in binary
        int leftShift = number << 2;  // 100000 in binary (32 in decimal)
        int rightShift = number >> 2;  // 10 in binary (2 in decimal)
        
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
        
        // Conditional Operators
        int age = 10;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result: " + result);
    }
}

       
