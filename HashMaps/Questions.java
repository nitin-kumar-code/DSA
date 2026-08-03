/*
LeetCode: 1. Two Sum

Difficulty: Easy

Pattern: HashTable

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
*/

/*
LeetCode: 350. Intersection of Two Arrays II

Difficulty: Easy

Pattern: HashTable

import java.util.*;

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {

                answer.add(num);

                map.put(num, map.get(num) - 1);
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
*/

/*
LeetCode: 205. Isomorphic Strings

Difficulty: Easy

Pattern: HashTable

import java.util.HashMap;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST.containsKey(chS)) {

                if (mapST.get(chS) != chT) {
                    return false;
                }

            } else {
                mapST.put(chS, chT);
            }

            if (mapTS.containsKey(chT)) {

                if (mapTS.get(chT) != chS) {
                    return false;
                }

            } else {
                mapTS.put(chT, chS);
            }
        }

        return true;
    }
}
*/