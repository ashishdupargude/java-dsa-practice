
public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater: " + (a > b));
        System.out.println("Less: " + (a < b));

        // Logical Operators
        System.out.println("AND: " + (a > 5 && b < 10));
        System.out.println("OR: " + (a > 15 || b < 10));
        System.out.println("NOT: " + !(a > b));

        // Unary Operators
        int c = 10;
        System.out.println("Post Increment: " + c++);
        System.out.println("Pre Increment: " + (++c));

        // Assignment Operators
        int d = 10;
        d += 5;
        System.out.println("Assignment: " + d);
    }
}
