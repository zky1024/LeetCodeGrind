package lc217_contains_duplicate;

import org.junit.Assert;
import org.junit.Test;

/**
 * 217. Contains Duplicate

 *
 * @author Kai
 * @since 2024-01-07 14:44:51
 */
public class TestLC217 {

    @Test
    public void test1() {
        SolutionLC217 solutionLC = new SolutionLC217();
        int[] nums = {1,2,3,1};
        boolean result = solutionLC.containsDuplicate(nums);
        System.out.println(result);
        Assert.assertEquals(true, result);

        nums = new int[]{1,2,3,4};
        result = solutionLC.containsDuplicate(nums);
        System.out.println(result);
        Assert.assertEquals(false, result);
    }
}
