package Ex1;

public abstract class Figure {
    protected double square;
    protected double perimeter;

    public abstract void calculateSquare();

    public abstract void calculatePerimeter();

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
