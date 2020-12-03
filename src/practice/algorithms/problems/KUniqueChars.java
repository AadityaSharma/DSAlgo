package practice.algorithms.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KUniqueChars {
    public static String KUniqueCharacters(String str2) {
        if (str2 == null || str2.length() == 0)
            return null;

        String str = str2.substring(1);
        int k = Integer.parseInt("" + str2.charAt(0));

        if (!Character.isDigit(str2.charAt(0)) || str.length() < k) {
            return null;
        }

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charFreqMap = new HashMap<Character, Integer>();

        HashMap<Integer, List<String>> substrMap = new HashMap<Integer, List<String>>();

        // in the following loop we'll try to extend the range [windowStart, windowEnd]
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charFreqMap.put(rightChar, charFreqMap.getOrDefault(rightChar, 0) + 1);
            // shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
            while (charFreqMap.size() > k) {
                char leftChar = str.charAt(windowStart);
                charFreqMap.put(leftChar, charFreqMap.get(leftChar) - 1);
                if (charFreqMap.get(leftChar) == 0) {
                    charFreqMap.remove(leftChar);
                }
                windowStart++; // shrink the window
            }

            int currentLength = windowEnd - windowStart + 1;
            String currentSubstr = str.substring(windowStart, windowEnd + 1);

            if (currentLength >= maxLength) {
                maxLength = currentLength;

                List<String> maxLengthList = substrMap.getOrDefault(maxLength, new ArrayList<String>());
                maxLengthList.add(currentSubstr);

                substrMap.put(maxLength, maxLengthList);
            }
//            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
        }
        String resultStr = "";
        for (String substr: substrMap.get(maxLength)) {
            System.out.println("Substr with maxlen " + maxLength + " is: " + substr);
            resultStr = substr;
        }
        return resultStr;
//        return maxLength;
    }

    public static void main(String[] args) {
//        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2) + "\n\n");
//        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1) + "\n\n");
//        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3) + "\n\n");
//        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("aabacbebebe", 3) + "\n\n");
//        KUniqueCharacters("3aabacbebebe");
//        KUniqueCharacters("3cbbebi");
        KUniqueCharacters("1araaci");
    }
}
