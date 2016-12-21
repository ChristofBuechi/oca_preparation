public class Owl implements Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void start(String[] args) {
        Nocturnal nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}
interface Nocturnal {
    default boolean isBlind() {
        return true;
    }
}