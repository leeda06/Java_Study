import java.util.ArrayList;

public class ArrayListTest5_1 {
    public static <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> mergedList = new ArrayList<>();

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        return mergedList;
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Programming");

        ArrayList<String> mergedList = merge(list1, list2);

        System.out.println(mergedList);
    }
}
