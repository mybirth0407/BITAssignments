package practice5.prob3;

public class Duck implements Soundable {
    Duck() {
        sound();
    }
    @Override
    public String sound() {
        return "꽥꽥";
    }
}