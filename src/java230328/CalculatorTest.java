package java230328;
interface Calculator{
    default void add(int a, int b) {
        System.out.println(a + b);
    }
    default void subtract(int a, int b) {
        System.out.println(a - b);
    }
    void multiply(int a, int b);
}
class FullCalculator implements Calculator{
    @Override
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }
}
public class CalculatorTest {
    public static void main(String [] args){
        FullCalculator fullcal = new FullCalculator();

        fullcal.add(1, 2);
        fullcal.subtract(1, 2);
        fullcal.multiply(1, 2);
    }
}
