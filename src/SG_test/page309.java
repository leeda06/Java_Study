package SG_test;
class Pen{
    private int amount; // 남은 량
    public int getAmount() { return amount; }
    public void setAmount (int amount) { this.amount = amount; }
}
class SharpPencil { // 샤프펜슬
    private int width; // 펜의 굵기
}

class Ballpen  extends Pen{ // 볼펜
    private String color; // 볼펜의 색
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

class FountainPen extends Ballpen{ // 만년필
    public void refill (int n) { setAmount(n); }
}
public class page309 {
}
