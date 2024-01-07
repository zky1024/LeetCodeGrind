package lc217_contains_duplicate;

import java.util.HashMap;
import java.util.Map;

/**
 * 217. Contains Duplicate

 *
 * @author Kai
 * @since 2024-01-07 14:44:51
 */
public class SolutionLC217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int n : nums){
            int count = countMap.getOrDefault(n,0);
            if(count > 0){
                return true;
            }
            countMap.put(n, count +1);
        }
        return false;
    }
}