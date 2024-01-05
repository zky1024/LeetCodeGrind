package lc2062_count_vowel_substrings_of_a_string;

import java.util.HashSet;
import java.util.Set;

/**
 * 3rd try
 *
 * @author Kai
 * @since 2024-01-04 09:36:00
 */
public class SolutionLC2062Attempt3 {
    public int countVowelSubstrings(String word) {
        char[] charArr = word.toCharArray();
        int len = charArr.length;
        Set<Character> set = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < len - 4; i++) {
            set.clear();
            for (int j = i; j < len; j++) {
                if ("aeiou".indexOf(charArr[j]) != -1) {
                    set.add(charArr[j]);
                } else {
                    break;
                }
                if (set.size() == 5) {
                    sum++;
                }
            }
        }
        return sum;
    }
}