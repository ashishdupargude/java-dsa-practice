import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";
        StringBuilder result = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After removing duplicates: " + result);
    }
}