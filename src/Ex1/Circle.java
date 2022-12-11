package Ex1;

public class Circle extends Figure {

    private int radius;
    private final double PI = 3.14;

    Circle(int radius) {
        this.radius = radius;
        calculateSquare();
        calculatePerimeter();
    }

    @Override
    public void calculateSquare() {
        square = PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * PI * radius;
    }


}
