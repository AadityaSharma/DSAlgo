package concepts.java.strings;

public class StringExample02ConcatOperator {

    public static void main(String[] args) {
        // We'll see why you should be careful about String
        // Concatenation (+) operator in loops

        String x1 = "Value1";
        String x2 = "Value2";

//        concat(x1, x2);

        useStringBuffer(x1, x2);
    }

    private static void useStringBuffer(String x1, String x2) {
        StringBuffer a = new StringBuffer(x1);

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; ++i) {
            a.append(x2);
        }

        Long endTime = System.currentTimeMillis();

        System.out.println("\nThis loop took " + (endTime - startTime) + "ms\n");
        // above loop took just a few milliseconds to complete
        System.out.println(a);
    }

    public static void concat(String x1, String x2) {
        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; ++i) {
            x1 = x1 + x2;
        }

        Long endTime = System.currentTimeMillis();

        System.out.println("\nThis loop took " + (endTime - startTime) + "ms\n");

        // it took several minutes to complete the above for loop and
        // reach till this print statement
        // So, we see that we should avoid using string concat in loops
        // to avoid performance issues
        System.out.println(x1);
    }
}
