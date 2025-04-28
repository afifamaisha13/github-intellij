interface Swimmable {
    void swim();
}

interface Diveable {
    void dive();
}

class Fish implements Swimmable, Diveable {
    public void swim() {
        System.out.println("Fish is swimming...");
    }

    public void dive() {
        System.out.println("Fish is diving deep...");
    }
}

public class NewInterface {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.swim();
        f.dive();
    }
}
