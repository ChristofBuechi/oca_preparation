/**
 * Created by Christof on 17.12.2016.
 */

import rope.*;

import static rope.Rope.*;

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.lengthExercise12);
    }

    public static void start(String[] args) {
        rope1.lengthExercise12 = 2;
        rope2.lengthExercise12 = 8;
        System.out.println(rope1.lengthExercise12);
    }
}
