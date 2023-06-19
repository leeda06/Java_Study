import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest6_2 {
    public static List<List<Integer>> createSeatingChart(int totalSeats, int[] rowSizes) {
        List<Integer> seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(i);
        }
        Collections.shuffle(seats);

        List<List<Integer>> seatingChart = new ArrayList<>();
        int rowIndex = 0;
        for (int rowSize : rowSizes) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < rowSize; i++) {
                int seat = seats.get(rowIndex++);
                row.add(seat);
            }
            seatingChart.add(row);
        }

        return seatingChart;
    }

    public static void main(String[] args) {
        int totalSeats = 16;
        int[] rowSizes = {2, 4, 5, 5};
        List<List<Integer>> seatingChart = createSeatingChart(totalSeats, rowSizes);

        System.out.println(seatingChart);
//        for (List<Integer> row : seatingChart) {
//            System.out.println(row);
//        }
    }
}
