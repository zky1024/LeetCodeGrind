package lc2062_count_vowel_substrings_of_a_string;

import java.util.HashSet;
import java.util.Set;

/**
 * 2nd try, still bad, beats 10% of users
 *
 * @author Kai
 * @since 2024-01-04 09:36:00
 */
public class SolutionLC2062Attempt2 {
    public int countVowelSubstrings(String word) {
        char[] charArr = word.toCharArray();
        int[] vowelArr = new int[charArr.length];


        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case 'a':
                    vowelArr[i] = 1;
                    break;
                case 'e':
                    vowelArr[i] = 2;
                    break;
                case 'i':
                    vowelArr[i] = 3;
                    break;
                case 'o':
                    vowelArr[i] = 4;
                    break;
                case 'u':
                    vowelArr[i] = 5;
                    break;
                default:
                    vowelArr[i] = 0;
            }
        }

        Set<Integer> vowelSet = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < charArr.length - 4; i++) {
            if (!isVowel(vowelArr[i])) {
                continue;
            }
            for (int j = i + 4; j < charArr.length; j++) {
                if (!isVowel(vowelArr[j])) {
                    break;
                }
                boolean containNonVowel = false;
                for (int k = i; k <= j; k++) {
                    if (isVowel(vowelArr[k])) {
                        vowelSet.add(vowelArr[k]);
                    } else {
                        containNonVowel = true;
                        break;
                    }
                }
                if (vowelSet.size() == 5 && !containNonVowel) {
                    sum++;
                }
            }
            vowelSet.clear();
        }
        return sum;
    }

    boolean isVowel(int i) {
        return i > 0;
    }
}