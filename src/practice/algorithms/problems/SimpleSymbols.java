package practice.algorithms.problems;

public class SimpleSymbols {

    public static String validateString(String str) {
        String trueStr = "true";
        String falseStr = "false";

//        var arr = str.toLowerCase().split("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (i == 0 || i == str.length()) {
                    return falseStr;
                }

                if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    return falseStr;
                }
            }
        }

        return trueStr;
    }

    public static void main(String[] args) {

        String str1 = "+d===+a+";
        String str2 = "2+a+a+";
        String output1 =  validateString(str1);
        String output2 =  validateString(str2);
        System.out.println("input: " + str1 + ", output: " + output1);
        System.out.println("input: " + str2 + ", output: " + output2);
    }
}
