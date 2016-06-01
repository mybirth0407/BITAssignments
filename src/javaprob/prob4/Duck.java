package javaprob.prob4;

public class Duck implements Soundable {
    Duck() {
        this.sound();
    }

    @Override
    public String sound() {
        return "꽥꽥";
    }
}
