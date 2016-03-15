package Exam1.prob4;

public class Dog implements Soundable {
    Dog() {
        this.sound();
    }

    @Override
    public String sound() {
        return "몽몽";
    }
}
