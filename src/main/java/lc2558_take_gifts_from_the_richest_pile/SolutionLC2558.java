package lc2558_take_gifts_from_the_richest_pile;

public class SolutionLC2558 {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 1; i <= k; i++) {
            // 1. find the max value
            int maxIndex = findMaxIndex(gifts);
            // 2. find the floored square root of the max value
            int flooredSquareRoot = getFlooredSquareRoot(gifts[maxIndex]);
            // 3. replace the max value with the floored square root
            gifts[maxIndex] = flooredSquareRoot;
        }

        // 4. return the sum of the array
        long sum = 0;
        for (int gift : gifts) {
            sum += gift;
        }
        return sum;

    }

    private int findMaxIndex(int[] gifts) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] > max) {
                max = gifts[i];
                index = i;
            }
        }
        return index;
    }

    private int getFlooredSquareRoot(int n) {
        return (int) Math.floor(Math.sqrt(n));
    }
}
