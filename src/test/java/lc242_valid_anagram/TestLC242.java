package lc242_valid_anagram;

import org.junit.Assert;
import org.junit.Test;

/**
 * 242. Valid Anagram
 *
 * @since 2024-01-07 21:54:19
 */
public class TestLC242 {

    @Test
    public void test1() {
        SolutionLC242 solutionLC = new SolutionLC242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solutionLC.isAnagram(s, t);
        System.out.println(result);
        Assert.assertEquals(true, result);

        s = "rat";
        t = "car";
        result = solutionLC.isAnagram(s, t);
        System.out.println(result);
        Assert.assertEquals(false, result);
    }
}
