
public class BitManipulation {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // Bitwise Operators
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("NOT: " + (~a));

        // Shift Operators
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
        System.out.println("Unsigned Right Shift: " + (a >>> 1));
    }
}
