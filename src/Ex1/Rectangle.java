package Ex1;

public class Rectangle extends Figure {

    private int side1;
    private int side2;

    Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
        calculateSquare();
        calculatePerimeter();
    }

    @Override
    public void calculateSquare() {
        square = side1 * side2 * 1.0;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = (side1 + side2) * 2.0;
    }


}
