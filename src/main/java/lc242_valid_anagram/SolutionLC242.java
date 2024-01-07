package lc242_valid_anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 *
 * @since 2024-01-07 21:54:19
 */
public class SolutionLC242 {
    public boolean isAnagram(String s, String t) {
        char[] charArr1 = s.toCharArray();
        char[] charArr2 = t.toCharArray();

        if(charArr1.length != charArr2.length){
            return false;
        }


        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : charArr1) {
            int count = countMap.getOrDefault(c, 0);
            countMap.put(c, count + 1);
        }

        for (char c : charArr2) {
            int count = countMap.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            countMap.put(c, count - 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() != 0){
                return false;
            }
        }

        return true;
    }
}
