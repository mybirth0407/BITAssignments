package practice3.prob7;

public class Duck extends Bird {
    void fly() {
        System.out.println("오리(" + super.name + ")는 날지 않아!");
    }

    void sing() {
        System.out.println("오리(" + super.name + ")는 꽥꽥!");
    }

    public String toString() {
        return "오리의 이름은 " + super.name + "다";
    }
}
