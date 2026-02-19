import java.util.Scanner;

public class SplitWithoutSplit {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        int[] spaces = new int[wordCount + 1];
        int index = 0;

        spaces[index++] = -1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces[index++] = i;
            }
        }
        spaces[index] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String temp = "";
            for (int j = spaces[i] + 1; j < spaces[i + 1]; j++) {
                temp += text.charAt(j);
            }
            words[i] = temp;
        }

        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = splitText(text);
        String[] builtIn = text.split(" ");

        boolean result = compareArrays(custom, builtIn);

        System.out.println("Arrays Equal: " + result);

        sc.close();
    }
}
