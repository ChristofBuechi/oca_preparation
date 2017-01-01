import java.util.function.Predicate;

/**
 * Created by Christof on 01.01.2017.
 */
public class MEQ50 {

    public static void start(String[] args) {
        Op.start(args);
    }
}

class Op {
    public static void start(String... args) {
        int a = 0;
        int b = 100;

        Predicate<Integer> compare = (var) -> var++ == 10;
//        if (!b++ > 100 && compare.test(a)) {
//            System.out.println(a + b);
//        }
    }
}
