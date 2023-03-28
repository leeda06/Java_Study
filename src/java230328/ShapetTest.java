package java230328;
interface Shape{
    double area(double r);
    double perimeter(double r);

}
class Circle implements Shape{
    private double r;
    public Circle(double r){
        this.r = r;
    }
}
class Rectangle implements Shape{
    @Override
    public double area(double r) {
        return (r * r);
    }

    @Override
    public double perimeter(double r) {
        return (Math.PI * 2 * r);
    }
}
public class ShapetTest {
}
