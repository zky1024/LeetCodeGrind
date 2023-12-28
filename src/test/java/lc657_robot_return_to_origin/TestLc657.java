package lc657_robot_return_to_origin;

import org.junit.Assert;
import org.junit.Test;


public class TestLc657 {

    @Test
    public void Test1() {
        Lc657Solution solution = new Lc657Solution();
        String moves = "UDRLRLUDLR";
        boolean result = solution.judgeCircle(moves);
        System.out.println(result);
        Assert.assertTrue(result);
    }

    @Test
    public void Test2() {
        Lc657Solution solution = new Lc657Solution();
        String moves = "LLLRRRR";
        boolean result = solution.judgeCircle(moves);
        System.out.println(result);
        Assert.assertFalse(result);
    }

}
