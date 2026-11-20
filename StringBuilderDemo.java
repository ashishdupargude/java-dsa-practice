
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ashish");

        // Append
        sb.append(" Dupargude");
        System.out.println(sb);

        // Insert
        sb.insert(6, " M");
        System.out.println(sb);

        // Replace
        sb.replace(7, 12, "Developer");
        System.out.println(sb);

        // Delete
        sb.delete(6, 16);
        System.out.println(sb);

        // Reverse
        sb.reverse();
        System.out.println(sb);
    }
}
