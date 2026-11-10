/*
LeetCode: 20. Valid Parentheses

Difficulty: Easy

Pattern: Stack and Bracket Sequences

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
         if(ch == '(' || ch == '[' || ch == '{'){
            stack.push(ch);
         } else {
            if(ch == ')'){
                if(stack.isEmpty() || stack.pop() != '(' ){
                    return false;
                }
            }
            if(ch == ']'){
                if(stack.isEmpty() || stack.pop() != '[' ){
                    return false;
                }
            }
            if(ch == '}'){
                if(stack.isEmpty() || stack.pop() != '{' ){
                    return false;
                }
            }
         }
        }
        return stack.isEmpty();
    }
}
*/


/*
LeetCode: 32. Longest Valid Parentheses

Difficulty: Hard

Pattern: Stack and Bracket Sequences

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }
}
*/


/*
LeetCode: 735. Asteroid Collision

Difficulty: Medium

Pattern: Stack and Simulation

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length ; i++){
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek() > 0 
            && asteroids[i] < 0){
                if(stack.peek() < -asteroids[i]){
                    stack.pop();
                }
                else if(stack.peek() == -asteroids[i]){
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                stack.push(asteroids[i]);
            }
             }
              int[] ans = new int[stack.size()];
             for(int i = ans.length - 1 ; i>=0 ; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
*/