package lc657_robot_return_to_origin;

import org.junit.Assert;
import org.junit.Test;


public class TestLC657 {

    @Test
    public void Test1() {
        SolutionLC657 solution = new SolutionLC657();
        String moves = "UDRLRLUDLR";
        boolean result = solution.judgeCircle(moves);
        System.out.println(result);
        Assert.assertTrue(result);
    }

    @Test
    public void Test2() {
        SolutionLC657 solution = new SolutionLC657();
        String moves = "LLLRRRR";
        boolean result = solution.judgeCircle(moves);
        System.out.println(result);
        Assert.assertFalse(result);
    }

}
