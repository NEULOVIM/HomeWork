package Task1;


public class Circle extends Figures {
    private final double radius;

    public  Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * (radius * 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

