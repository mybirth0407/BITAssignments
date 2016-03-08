package Practice3.prob7;

public abstract class Bird {
    String name;
    int legs;
    int length;

    abstract void fly();
    abstract void sing();

    public void setName(String name) {
        this.name = name;
    }

}
