class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];

        int leftProd = 1;

        for (int i = 0; i < n; i++) {
            out[i] = leftProd;
            leftProd *= nums[i];
        }

        int rightProd = 1;
        for (int j = n - 1; j >= 0; j--) {
            out[j] *= rightProd;
            rightProd *= nums[j];
        }

        return out;
    }
}  
