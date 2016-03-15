package Exam1.prob4;

public class Cat implements Soundable {
    Cat() {
        this.sound();
    }

    @Override
    public String sound() {
        return "야옹";
    }
}
