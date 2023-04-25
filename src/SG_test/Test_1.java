package SG_test;


class A {
    void draw(){
        System.out.println("A");
    }
}
class B extends A {
    void draw(){
        System.out.println("B");
    }}
class C extends B {
    void draw(){
        System.out.println("C");
    }
}
class D extends C {
    void draw(){
        System.out.println("D");
    }
}
public class Test_1 {
    public static void main(String[] args) {
        A x = new D();
        System.out.println(x instanceof B);
        System.out.println(x instanceof C);
    }
}
