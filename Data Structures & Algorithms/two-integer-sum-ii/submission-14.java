class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] out = new int[2];
        int sum = 0;
        int p1 = 0;
        int p2 = n - 1;

        while (p1 < p2) {
            sum = numbers[p1] + numbers[p2];

            if (sum == target) {
                out[0] = p1 + 1;
                out[1] = p2 + 1;
                break;
            }

            if (sum > target) {
                p2--;
            }

            if (sum < target) {
                p1++;
            }

        }

        return out;
    }
}
