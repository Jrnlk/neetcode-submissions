class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] current = intervals[i];

            if (overLapCheck(current, newInterval)) {
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            } 
            else if (current[1] < newInterval[0]) {
                result.add(current);
            } 
            else {
                result.add(newInterval);

                for (int j = i; j < n; j++) {
                    result.add(intervals[j]);
                }

                return result.toArray(new int[result.size()][]);
            }
        }

        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }

    public boolean overLapCheck(int[] int1, int[] int2) {
        return int1[0] <= int2[1] && int2[0] <= int1[1];
    }
}