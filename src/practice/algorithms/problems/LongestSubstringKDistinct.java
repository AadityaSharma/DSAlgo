package practice.algorithms.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static int findLength(String str, int k) {
        if (str == null || str.length() == 0 || str.length() < k)
            throw new IllegalArgumentException();

        // aaaaaaabaaaaaaa
        // total characters - 16
        // n -
//        String[] longestSubstrArr = new String[];

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        HashMap<Integer, List<String>> substrMap = new HashMap<Integer, List<String>>();

        // in the following loop we'll try to extend the range [windowStart, windowEnd]
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
            // shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
            while (charFrequencyMap.size() > k) {
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++; // shrink the window
            }

            int currentLength = windowEnd - windowStart + 1;
            String currentSubstr = str.substring(windowStart, windowEnd + 1);

            if (currentLength >= maxLength) {
                maxLength = currentLength;

                List maxLengthList = substrMap.getOrDefault(maxLength, new ArrayList<String>());
                maxLengthList.add(currentSubstr);

                substrMap.put(maxLength, maxLengthList);
            }
//            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
        }
        for (String substr: substrMap.get(maxLength)) {
            System.out.println("Substr with maxlen " + maxLength + " is: " + substr);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2) + "\n\n");
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1) + "\n\n");
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3) + "\n\n");
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("aabacbebebe", 3) + "\n\n");
    }
}
