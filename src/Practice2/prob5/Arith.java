package Practice2.prob5;

public abstract class Arith {
    double a;
    double b;

    void setValue(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract double calculate();
}
