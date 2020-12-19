package concepts.java.strings;

public class StringExamples01Equals {

    public static void main(String[] args) {
        String x1 = "My name is Aaditya Sharma!";
        String x2 = "My name is Aaditya Sharma!";
        String x3 = new String("My name is Aaditya Sharma!");

        System.out.println("Are x1 and x2 same?: " + (x1 == x2));
        System.out.println("Are x1 and x2 same?: " + (x1.equals(x2)));

        System.out.println("==================");

        System.out.println("Are x1 and x3 same?: " + (x1 == x3));
        System.out.println("Are x1 and x3 same?: " + (x1.equals(x3)));
    }
}
