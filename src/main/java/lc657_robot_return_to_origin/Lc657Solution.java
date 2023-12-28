package lc657_robot_return_to_origin;

/**
 * @author Kai
 * @since 2023/12/28 14:32
 */
public class Lc657Solution {
    public boolean judgeCircle(String moves) {
        char[] moveArr = moves.toCharArray();

        int xAxis = 0;
        int yAxis = 0;

        for (char move : moveArr) {
            switch (move) {
                case 'R':
                    xAxis++;
                    break;
                case 'L':
                    xAxis--;
                    break;
                case 'U':
                    yAxis++;
                    break;
                case 'D':
                    yAxis--;
                    break;
            }
        }

        return xAxis == 0 && yAxis == 0;
    }
}
