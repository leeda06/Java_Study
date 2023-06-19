import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest6_1 {
    public static List<List<Integer>> createSeatingChart(int totalSeats, int[] number) {
        List<Integer> seats = new ArrayList<>();
        for (int i = 0; i < totalSeats; i++) {
            seats.add(number[i]);
        }
        Collections.shuffle(seats);

        List<List<Integer>> seatingChart = new ArrayList<>();
        int[] rowSizes = {2, 4, 5, 5};
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
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        List<List<Integer>> seatingChart = createSeatingChart(totalSeats, number);

        for (List<Integer> row : seatingChart) {
            System.out.println(row);
        }
    }
}
