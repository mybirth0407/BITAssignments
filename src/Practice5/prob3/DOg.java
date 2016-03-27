package practice5.prob3;

public class Dog implements Soundable {
    Dog() {
        this.sound();
    }
    @Override
    public String sound() {
        return "멍멍";
    }
}