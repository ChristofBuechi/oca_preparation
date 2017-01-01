/**
 * Created by Christof on 01.01.2017.
 */
public class Main {
    static public void main(String... args) {
        char c3 = (char) -122;
        System.out.println("c3 = " + c3);


        Double a = 9.01;
        Integer b = 9;

        if (a < b) {
            System.out.println("value a is smaller");
        } else
            System.out.println("value b is smaller");


        MEQ50.start(args);
        MEQ61.start(args);
        MEQ62.start(args);
        MEQ74.start(args);

    }
}
