package Practice4.prob5;

public class Rectangle extends Shape implements Resizable {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.countSides = 4;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return ((2 * width) + (2 * height));
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void resize(double rate) {
        width *= rate;
        height *= rate;
    }
}