/*
LeetCode: 84. Largest Rectangle in Histogram

Difficulty: Hard

Pattern: Stack and Monotonic Stack

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        stack.push(0);

    for(int i =1 ; i<heights.length ; i++){
        while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
             max = getMax(heights, stack, max ,i);
        }
        stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
        max = getMax(heights, stack, max ,i);
        }
        return max;
    }
private static int getMax(int[] arr,Stack<Integer> stack,int max,int i){
    int area;
    int popped = stack.pop();
    int height = arr[popped];
      if(stack.isEmpty()){
        area = arr[popped] * i;
      } else{
        area = arr[popped] * (i-1 - stack.peek()); 
        }
        return Math.max(max , area);
    }
}
*/


/*
LeetCode: 503. Next Greater Element II

Difficulty: Medium

Pattern: Stack and Monotonic Stack

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            answer[i] = -1;
        }
        for(int i = 0; i < 2 * nums.length; i++){
            int index = i % nums.length;
        while(!stack.isEmpty() && nums[index] > nums[stack.peek()]){
                answer[stack.pop()] = nums[index];
            }
            if(i < nums.length){
                stack.push(index);
            }
        }
        return answer;
    }
}
*/

/*
LeetCode: 901. Online Stock Span

Difficulty: Medium

Pattern: Monotonic Stack

class StockSpanner {
     Stack<int[]> stack;
    public StockSpanner() {
       stack  = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1];
        }
        stack.push(new int[]{price , span});
        return span;
    }
}
*/
