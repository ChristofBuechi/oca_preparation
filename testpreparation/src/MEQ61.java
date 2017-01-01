/**
 * Created by Christof on 01.01.2017.
 */
public class MEQ61 {
    public static void start(String[] args) {
        StringBuilders.start(args);
    }


}

class StringBuilders {

    public static void start(String[] args) {
        StringBuilder sb1 = new StringBuilder("eLion");
        String ejg = null;
        ejg = sb1.append("X").substring(sb1.indexOf("L"), sb1.indexOf("X"));
        System.out.println(ejg);
    }
}
