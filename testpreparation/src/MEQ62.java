/**
 * Created by Christof on 01.01.2017.
 */
public class
MEQ62 {
    public static void start(String[] args) {
        Chair.start(args);
    }
}

interface Jumpable {
    int height = 1;

    default void worldRecord() {
        System.out.println(height);
    }
}


interface Moveable {
    int height = 2;

    static void worldRecord() {
        System.out.println(height);
    }
}

class Chair implements Jumpable, Moveable {
    int height = 3;

    Chair() {
        worldRecord();
    }


    public static void start(String[] args) {
        Jumpable j = new Chair();
        Moveable m = new Chair();
        Chair c = new Chair();
    }
}