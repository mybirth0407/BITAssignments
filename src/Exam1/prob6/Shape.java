package exam1.prob6;

public abstract class Shape {
    int countSides;

    public int getCountSides() {
        return countSides;
    }

    abstract double getArea();
    abstract double getPerimeter();
}
