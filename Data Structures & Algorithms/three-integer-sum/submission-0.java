class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> out = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int currSum = nums[i] + nums[start] + nums[end];

                if (currSum == 0) {
                    out.add(Arrays.asList(
                        nums[i],
                        nums[start],
                        nums[end]
                    ));

                    start++;
                    end--;

                    // Skip duplicate values
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }

                } else if (currSum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return out;
    }
}