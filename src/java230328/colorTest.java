package java230328;

interface Color {
    String RED = "RED";
    String GREEN = "GREEN";
}
interface Mynumber {
    int LUCKY_NUMBER = 777;
}
public class colorTest {
    public static void main (String [] args){
        System.out.println(Color.RED);
        System.out.println(Color.GREEN);

        System.out.println(Mynumber.LUCKY_NUMBER);
    }
}
