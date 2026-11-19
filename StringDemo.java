
public class StringDemo {

    public static void main(String[] args) {

        String name = "Ashish Dupargude";

        // String length
        System.out.println("Length: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Character at index
        System.out.println("Character: " + name.charAt(0));

        // Substring
        System.out.println("Substring: " + name.substring(0, 6));

        // Check contains
        System.out.println("Contains: " + name.contains("Ashish"));

        // Replace
        System.out.println("Replace: " + name.replace("Ashish", "Hello"));

        // Equality
        System.out.println("Equals: " + name.equals("Ashish Dupargude"));
    }
}

