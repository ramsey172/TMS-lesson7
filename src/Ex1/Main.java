package Ex1;

public class Main {
    public static void main(String[] args) {
        Figure triangle1 = new Triangle(3, 4);
        Figure triangle2 = new Triangle(2, 2);
        Figure circle1 = new Circle(5);
        Figure circle2 = new Circle(7);
        Figure rectangle1 = new Rectangle(2, 4);

        Figure[] figures = new Figure[]{triangle1, triangle2, circle1, circle2, rectangle1};
        double perimeterSum = 0;
        for (Figure figure: figures) {
            perimeterSum += figure.getPerimeter();
        }
        System.out.println("Сумма периметров фигур массива - "+perimeterSum);
    }
}
