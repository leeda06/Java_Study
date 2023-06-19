import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<String>();
        word.add("Apple");
        word.add("Banana");
        word.add("Orange");
        word.add("Happy");
        word.add("Sad");

        findLongest(word);
    }
    static String findLongest (ArrayList<String>words){
        String max = "";
        for(int i = 0; i < words.size(); i++){
            if(max.length() < words.get(i).length()){
                max = words.get(i);
            }
        }
        System.out.println(max);
        return max;
    }
}

