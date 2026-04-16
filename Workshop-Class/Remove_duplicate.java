import java.util.ArrayList;
import java.util.HashSet;

public class Remove_duplicate {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(40);

        System.out.println("Original ArrayList: " + list);

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("After Removing Duplicates: " + set);
    }
}