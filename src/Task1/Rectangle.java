package Task1;

public class Rectangle extends Figures {
    private final double length;
    private final double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return (length * width);
    }

    @Override
    public double calculatePerimeter() {
        return  (width + width) + (length + length);
    }
}
