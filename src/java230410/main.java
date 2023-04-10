package java230410;
// import java.lang.*;

// import kr.hs.emirim.MyClass;
// import kr.hs.emirim.MyInterface;
// import kr.hs.emirim.*;
// import kr.*;

// import kr.MyClass;
// import kr.hs.MyClass;
// import kr.hs.emirim.MyClass;

// class MyInterfaceImpl implements MyInterface {}

import java.util.Objects;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        Point p = (Point) obj;
//        return this.x == p.x && this.y == p.y;
//    }
}

public class main {
    static public void method(Object o) {
        System.out.println(o.getClass());
    }
    public static void main(String[] args) {
        method(100);

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(1, 2);

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        Integer[] arr = null;

        // Float f = Float.valueOf(314);


        // Boolean bool = new Boolean(true);

//        System.out.println(p1.getClass().getName());
//        System.out.println(p1.hashCode());
//        System.out.println(p1.toString());
//        System.out.println(p1);



//        MyClass mc = new MyClass();
//        kr.hs.MyClass mc2 = new kr.hs.MyClass();
//        kr.MyClass mc3 = new kr.MyClass();
//        kr.hs.emirim.MyClass mc4 = new kr.hs.emirim.MyClass();
//        java.lang.String s = new java.lang.String("Hello");
    }
}









