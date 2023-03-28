//package minTeacher;
//abstract class Shape {
//    int a;
//    int b;
//    abstract void draw();   //추상메서드
//}
//
//class Tri extends Shape{
//    int c;
//    int d;
//    void draw(){
//        System.out.println("삼각형 그리기 ");
//    }
//}
//class Circle extends Shape{
//    int e;
//    void draw(){
//        System.out.println("원 그리기 ");
//    }
//}
//public class sTest{
//    public static void main(String args[]){
//        Tri t = new Tri();
//
//        System.out.println(t.a);//0
//
//        Shape c1 = new Circle();
//        c1.e = 5;
//        c1.draw();
//
//        Shape[] sh=new Shape[5];
//
//        for(int i=0; i<5; i++){
//            if(i == 1) {
//                Shape[i] = new Tri();   //업캐스팅
//            }else {
//                Shape[i] = new Circle();
//            }
//        }
//        for(int i=0; i<5; i++){
//            Shape [i].draw();
//        }
//}