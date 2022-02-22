package algo;

import java.util.Arrays;

/**
 * SumPairSearch.
 *
 * @author Igor_Zolov
 */
public class SumPairSearch {
    public static void main(String[] args) {
        int[] array = {-5, -3, -1, 0, 1, 3, 4, 7};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

    public static int[] twoSum(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == k)
                return new int[]{nums[l], nums[r]};
            if (sum < k) l++;
            else r--;
        }
        return new int[0];
    }
}
