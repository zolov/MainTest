package oca.varscopes;

/**
 * LeetCode.
 *
 * @author Igor_Zolov
 */
public class LeetCode {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if  (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}
