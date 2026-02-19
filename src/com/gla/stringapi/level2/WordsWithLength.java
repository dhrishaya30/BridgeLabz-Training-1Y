import java.util.Scanner;

public class WordsWithLength {

    public static String[] splitText(String text) {
        int length = text.length();
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        int[] spaces = new int[wordCount + 1];
        int index = 0;

        spaces[index++] = -1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaces[index++] = i;
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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordsWithLength(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
        }

        sc.close();
    }
}
