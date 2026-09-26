class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            for (int j = 0; j < nums.length; j++) {
                int curr = nums[j];
                int sum = start + curr;
                if (j == i) {
                    continue;
                } else if (sum == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        Arrays.sort(res);
        return res;
    }
}
