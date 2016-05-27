package annotation1;

/**
 * Created by WUHamster on 27.05.2016.
 */
public class ForTesting {

    @Test(a = 3, b = 7)
    public static int test (int a, int b) {
        return a*b;
    }
}
