import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 5; i++){
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("element: " + list.get(i));
        }
    }
}
