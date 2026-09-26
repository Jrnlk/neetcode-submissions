class Solution {

    public int maxArea(int[] heights) {
        int n = heights.length;
        int start = 0;
        int end = n - 1;
        
        int leftMax = 0;
        int rightMax = 0;
        int maxArea = 0;
        while (start < end) {
            int currMax = 
            Math.min(heights[start], heights[end]) * (end - start);
            //System.out.println(Math.min(heights[start], heights[end]) + " " + (end - start));


            if (currMax > maxArea) {
                maxArea = currMax;
            }

            if (heights[start] >= heights[end]) {
                end--;
            } else {
                start++;
            };

            //System.out.println(maxArea);
        }

        return maxArea;
    }

}
