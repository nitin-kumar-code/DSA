/*
LeetCode: 1. Plus One

Difficulty: Easy

Pattern: Arrays and Math 

class Solution {
    public int[] plusOne(int[] digits) {
       for(int i=digits.length-1 ; i>=0 ; i--){
         if(digits[i] < 9){
            digits[i]++;
            return digits;
         }
          digits[i] = 0;
        }
        int[] result = new int [digits.length + 1];
        result[0] = 1;

        return result;
       }
    }

*/

/* 
LeetCode: 34. Find First and Last Position of Element in Sorted Array

Difficulty: Medium

Pattern: Arrays and Binary Search

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);

        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;   
                } else {
                    start = mid + 1; 
                }
            }
        }

        return ans;
    }
}
*/

/* 
LeetCode: 33. Search in Rotated Sorted Array

Difficulty: Medium

Topic: Arrays and Binary Search

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
*/