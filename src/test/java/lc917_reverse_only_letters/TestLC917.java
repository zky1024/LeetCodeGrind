package lc917_reverse_only_letters;

import org.junit.Assert;
import org.junit.Test;

public class TestLC917 {

    @Test
    public void test1() {
        SolutionLC917 solutionLC9171 = new SolutionLC917();
        String input = "ab-cd";
        String output = solutionLC9171.reverseOnlyLetters(input);
        System.out.println(output);
        Assert.assertEquals("dc-ba", output);
    }
}