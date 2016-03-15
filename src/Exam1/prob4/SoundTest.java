package Exam1.prob4;

public class SoundTest {

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
        printSound(new Sparrow());
        printSound(new Duck());
    }

    public static void printSound(Soundable s) {
        System.out.println(s.sound());
    }
}
