/**
 * Created by Christof on 21.12.2016.
 */
public class ClownFish implements Aquatic {
    public String getNumberOfGills() {
        return "4";
    }

    //does not compile
//    public String getNumberOfGills(int input) {
//        return "6";
//    }

    public static void start(String[] args) {
        System.out.println(new ClownFish().getNumberOfGills(-1));
    }
}
