/*
LeetCode: 41. First Missing Positive

Difficulty: Hard

Topics: Arrays and Sorting

class Solution {

    public int firstMissingPositive(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            // Only place positive numbers in the range [1, n]
            if (nums[i] > 0 &&
                nums[i] <= nums.length &&
                nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }

        // Find the first missing positive
        for (i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions are correct
        return nums.length + 1;
    }
}
*/

/*
Leetcode: 645. Set Mismatch

Difficulty: Easy

Topics: Arrays and Sorting

class Solution {

    public int[] findErrorNums(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }

        return new int[]{-1, -1};
    }
}

*/