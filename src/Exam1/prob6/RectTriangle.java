package exam1.prob6;

public class RectTriangle extends Shape {
    private double width;
    private double height;

    RectTriangle(double width, double height) {
        this.countSides = 3;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height / 2;
    }

    public double getPerimeter() {
        double ret = (width + height +
            Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
        return ret;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
