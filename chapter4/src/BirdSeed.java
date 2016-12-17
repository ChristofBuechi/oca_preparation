/**
 * Created by Christof on 17.12.2016.
 */
public class BirdSeed {

    private int numberBags;
    boolean call;

    public BirdSeed() {
    // LINE 1
        call = false;
    // LINE 2
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void start(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
