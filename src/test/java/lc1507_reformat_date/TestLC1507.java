package lc1507_reformat_date;

import org.junit.Assert;
import org.junit.Test;

public class TestLC1507 {
    @Test
    public void test1() {
        SolutionLC1507 solution1 = new SolutionLC1507();
        String input = "20th Oct 2052";
        String output = solution1.reformatDate(input);
        Assert.assertEquals("2052-10-20", output);
        System.out.println(output);

         input = "1st Jan 2052";
         output = solution1.reformatDate(input);
        Assert.assertEquals("2052-01-01", output);
        System.out.println(output);
    }
}
