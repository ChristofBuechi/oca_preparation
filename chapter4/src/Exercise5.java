/**
 * Created by Christof on 17.12.2016.
 */
public class Exercise5 {
    public static void start(String[] args) {

        /**
         * Given the following method, which of the method calls return 2? (Choose all that apply)

         A. howMany();
         B. howMany(true);
         C. howMany(true, true);
         D. howMany(true, true, true);          -> true
         E. howMany(true, {true});
         F. howMany(true, {true, true});
         G. howMany(true, new boolean[2]);      -> true
         */

        /*
        howMany();
        howMany(true);
        howMany(true, true);
        howMany(true, true, true);
        howMany(true, {true});
        howMany(true, {true, true});
        howMany(true, new boolean[2]);
         */

    }

    public static int howMany(boolean b, boolean... b2) {
        return b2.length;
    }
}
