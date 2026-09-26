class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for (int i : nums) {
            set.add(i);
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (set.contains(nums[i] - 1)) {
                continue;
            }

            int skip = 1;
            while (set.contains(nums[i] + skip)) {
                count++;
                skip++;
            }

            if (count > max) {
                max = count;
            }

        }

        return max;
    }
}
