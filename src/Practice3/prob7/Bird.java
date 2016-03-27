package practice3.prob7;

public abstract class Bird {
    String name;
    int legs;
    int length;

    abstract void fly();
    abstract void sing();

    public void setName(String name) {
        this.name = name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
