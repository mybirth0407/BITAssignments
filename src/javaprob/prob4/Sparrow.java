package javaprob.prob4;

public class Sparrow implements Soundable {
    Sparrow() {
        this.sound();
    }

    @Override
    public String sound() {
        return "짹짹";
    }
}
