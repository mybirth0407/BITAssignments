package practice3.prob7;

public class Sparrow extends Bird {
    void fly() {
        System.out.println("참새(" + super.name + ")는 날아다님!");
    }

    void sing() {
        System.out.println("참새(" + super.name + ")는 짹짹!");
    }

    public String toString() {
        return "참새의 이름은 " + super.name + "다";
    }
}
