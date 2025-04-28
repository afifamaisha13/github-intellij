class Instrument {
    protected String category = "Instrument";

    void play() {
        System.out.println("This is an instrument.");
    }
}

class Guitar extends Instrument {
    void strum() {
        System.out.println(category + " goes strum strum!");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();
        g.strum();
    }
}
