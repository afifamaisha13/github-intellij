interface Bird {
    void fly();
}

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.fly();
    }
}
