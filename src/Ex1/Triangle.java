package Ex1;

public class Triangle extends Figure {

    private int cathetus1;
    private int cathetus2;
    private double hypotenuse;

    Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        this.hypotenuse = Math.pow((Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2)), 0.5);
        calculateSquare();
        calculatePerimeter();
    }

    @Override
    public void calculateSquare() {
        square = cathetus1 * cathetus2 / 2.0;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = (cathetus1 + cathetus2 + hypotenuse) * 1.0;
    }


}
