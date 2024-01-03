package lc1470_shuffle_the_array;

import org.junit.Test;

import java.util.Arrays;

public class TestLC1470 {

    @Test
    public void test1() {
        SolutionLC1470 solutionLC = new SolutionLC1470();
        int[] input = {2, 5, 1, 3, 4, 7};
        int[] output = solutionLC.shuffle(input, 3);
        System.out.println("output: " + Arrays.toString(output));
        int[] answer = {2, 3, 5, 4, 1, 7};
        System.out.println("expect: " + Arrays.toString(answer));

        // test if output is equal to answer
        for (int i = 0; i < output.length; i++) {
            assert (output[i] == answer[i]);
        }


    }
}
