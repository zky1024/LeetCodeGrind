package lc917_reverse_only_letters;

import org.junit.Assert;
import org.junit.Test;

public class TestLc917 {

    @Test
    public void test1() {
        Solution solution1 = new Solution();
        String input = "ab-cd";
        String output = solution1.reverseOnlyLetters(input);
        System.out.println(output);
        Assert.assertEquals("dc-ba", output);
    }
}