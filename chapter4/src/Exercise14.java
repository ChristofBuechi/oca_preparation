import java.util.ArrayList;

/**
 * Created by Christof on 17.12.2016.
 */
public class Exercise14 {
    public static void start(String[] args) {
/**
 *
 * Which of the following can replace line 2 to make this code compile? (Choose
 all that apply)

 A. import static java.util.Collections;
 B. import static java.util.Collections.*;                                      -> true
 C. import static java.util.Collections.sort(ArrayList<String>);
 D. static import java.util.Collections;
 E. static import java.util.Collections.*;
 F. static import java.util.Collections.sort(ArrayList<String>);
 */

        Imports imports = new Imports();
        imports.method(new ArrayList<>());
    }
}
