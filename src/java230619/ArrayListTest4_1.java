import java.util.ArrayList;

public class ArrayListTest4_1 {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<String>();
        word.add("Apple");
        word.add("Banana");
        word.add("Orange");
        word.add("Happy");
        word.add("Sad");

        findLongest(word);
    }

    static void findLongest(ArrayList<String> words) {
        ArrayList<String> longWords = new ArrayList<String>();
        int max = 0;

        for (String word : words) {
            int length = word.length();
            if (length > max) {
                max = length;
            }
        }

        for (String word : words) {
            if (word.length() == max) {
                longWords.add(word);
            }
        }

        System.out.println(longWords);
    }
}
