package lc2062_count_vowel_substrings_of_a_string;

/**
 *
 * First try , terrible solution, 503 ms Beats 5.13% of users with Java
 *
 * @author Kai
 * @since 2024-01-04 09:36:00
 */
public class SolutionLC2062 {
    public int sol(String word) {
        char[] charArr = word.toCharArray();
        int[] vowelArr = new int[charArr.length];


        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case 'a':
                    vowelArr[i] = 1;
                    break;
                case 'e':
                    vowelArr[i] = 2;
                    break;
                case 'i':
                    vowelArr[i] = 3;
                    break;
                case 'o':
                    vowelArr[i] = 4;
                    break;
                case 'u':
                    vowelArr[i] = 5;
                    break;
                default:
                    vowelArr[i] = 0;
            }
        }

        int sum = 0;

        for (int i = 0; i < vowelArr.length - 4; i++) {
            if (vowelArr[i] == 0) {
                continue;
            }
            for (int j = i + 4; j < vowelArr.length; j++) {
                if (vowelArr[j] == 0) {
                    break;
                }
                System.out.println("i: " + i + ", j: " + j);
                if (isAEIOU(vowelArr, i, j)) {
                    System.out.println("i: " + i + ", j: " + j + ": !");
                    sum++;
                }
            }
        }

        return sum;
    }

    private boolean isAEIOU(int[] vowelArr, int startIndex, int endIndex) {
        int sumA = 0;
        int sumE = 0;
        int sumI = 0;
        int sumO = 0;
        int sumU = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            switch (vowelArr[i]) {
                case 1:
                    sumA++;
                    break;
                case 2:
                    sumE++;
                    break;
                case 3:
                    sumI++;
                    break;
                case 4:
                    sumO++;
                    break;
                case 5:
                    sumU++;
                    break;
                default:
                    return false;
            }
        }

        return sumA >= 1 && sumE >= 1 && sumI >= 1 && sumO >= 1 && sumU >= 1;
    }
}
