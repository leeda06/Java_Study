package java230411;
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

        String s = "Hello";
        s = s + "Java";     //  "Hello"가 "HelloJava"로 변한것이아니라
        System.out.println(s);//"Hello"에 "Java"가 붙은거임

        String java="Java";
        String java2="Java";
        String cpp="C++";
        String c = "c";
        String z = "z";

        int res1 = java.compareTo(java2);
        System.out.println(res1);
        int res2 = java.compareTo(c);
        System.out.println(res2);
        int res3 = java.compareTo(z);
        System.out.println(res3);

        System.out.println("Javb".compareTo("Javc"));
        System.out.println("Javb".compareTo("Java"));

        System.out.println("나".compareTo("다")); //  음수 (나가 다보다 앞에 있음)
        System.out.println("나".compareTo("가")); //  양수 (나가 가보다 뒤에있음)
        System.out.println("나".compareTo("가"));

        System.out.println("가나다".codePointAt(0));
        System.out.println("가나다".codePointAt(1));
        System.out.println("가나다".codePointAt(2));

        System.out.println("나".compareTo("가"));

        System.out.println("abcdef".substring(0));
        System.out.println("abcdef".substring(2));
        System.out.println("abcdef".substring(100));

        System.out.println("b".compareTo("c"));
        System.out.println("b".compareTo("a"));


    }
}