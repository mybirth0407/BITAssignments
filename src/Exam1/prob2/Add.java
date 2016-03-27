package exam1.prob2;

public class Add extends Arith {
    @Override
    double calculate() {
        double ret = (super.a + super.b);
        return ret;
    }
}
