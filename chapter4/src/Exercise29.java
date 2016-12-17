/**
 * Created by Christof on 17.12.2016.
 */
public class Exercise29 {

    /**
     *
     * Which lambda can replace the MySecret class to return the same value? (Choose all that apply)

     A. caller((e) -> "Poof");                                    -> applies
     B. caller((e) -> {"Poof"});
     C. caller((e) -> { String e = ""; "Poof" });
     D. caller((e) -> { String e = ""; return "Poof"; });
     E. caller((e) -> { String e = ""; return "Poof" });
     F. caller((e) -> { String f = ""; return "Poof"; });         -> applies
     */
    public static void start(String[] args) {
//        caller((e) -> "Poof");
//        caller((e) -> {"Poof"});
//        caller((e) -> { String e = ""; "Poof" });
//        caller((e) -> { String e = ""; return "Poof"; });
//        caller((e) -> { String e = ""; return "Poof" });
//        caller((e) -> { String f = ""; return "Poof"; });
    }

    private static void caller(Object o) {

    }
}

interface Secret {
    String magic(double d);
}
class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}
