import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest6 {
    public static List<Integer> randomSeats(int totalSeats) {
        List<Integer> seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(i);
        }
        Collections.shuffle(seats);
        return seats;
    }

    public static void main(String[] args) {
        int totalSeats = 16;
        List<Integer> randomizedSeats = randomSeats(totalSeats);
        System.out.println(randomizedSeats);
    }
}

