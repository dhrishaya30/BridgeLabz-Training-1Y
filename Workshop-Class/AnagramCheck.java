

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "elbow";
        String str2 = "below";

        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are Not Anagrams");
    }
}