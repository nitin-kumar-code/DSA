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
LeetCode: 754. Reach a Number

Difficulty: Medium

Pattern: Arrays and Math

class Solution {
    public int reachNumber(int target) {

        target = Math.abs(target);

        int sum = 0;
        int steps = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            steps++;
            sum += steps;
        }

        return steps;
    }
}
*/