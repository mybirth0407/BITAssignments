package Exam1.prob2;

public class Mul extends Arith {
    @Override
    double calculate() {
        double ret = (super.a * super.b);
        return ret;
    }
}
