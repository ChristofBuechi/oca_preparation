/**
 * Created by Christof on 21.12.2016.
 */
public abstract class Bird {
    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void start(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
    }

}

class Pelican extends Bird {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
}
