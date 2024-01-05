package lc2062_count_vowel_substrings_of_a_string;

import org.junit.Assert;
import org.junit.Test;

/**
 * 2062. Count Vowel Substrings of a String
 *
 * @author Kai
 * @since 2024-01-04 09:36:00
 */
public class TestLC2062 {

    @Test
    public void test1() {
        SolutionLC2062Attempt3 solutionLC = new SolutionLC2062Attempt3();
        String word = "abcde";
        System.out.println(word);
        int result = solutionLC.countVowelSubstrings(word);
        System.out.println(result);
        Assert.assertEquals(0, result);
    }
    @Test
    public void test2() {
        SolutionLC2062Attempt3 solutionLC = new SolutionLC2062Attempt3();
        String word = "cuaieuouac";
        System.out.println(word);
        int result = solutionLC.countVowelSubstrings(word);
        System.out.println(result);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test3() {
        SolutionLC2062Attempt3 solutionLC = new SolutionLC2062Attempt3();
        String word = "aeiouu";
        System.out.println(word);
        int result = solutionLC.countVowelSubstrings(word);
        System.out.println(result);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test4() {
        SolutionLC2062Attempt3 solutionLC = new SolutionLC2062Attempt3();
        String word = "unicornarihan";
        System.out.println(word);
        int result = solutionLC.countVowelSubstrings(word);
        System.out.println(result);
        Assert.assertEquals(0, result);
    }
}
