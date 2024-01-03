package lc1470_shuffle_the_array;

class SolutionLC1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] output = new int[2 * n];
        for (int i = 0; i < n; i++) {
            output[2 * i] = nums[i];
        }

        for (int i = n; i < 2 * n; i++) {
            output[2 * (i - n) + 1] = nums[i];
        }

        return output;
    }
}
