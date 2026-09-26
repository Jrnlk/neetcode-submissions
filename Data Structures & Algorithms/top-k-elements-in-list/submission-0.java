class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            if (freq.containsKey(n)) {
                int val = freq.get(n);
                freq.put(n, val + 1);
            } else {
                freq.put(n, 1);
            }
        }

        Comparator<Map.Entry<Integer, Integer>> comp = (e1, e2) -> 
        Integer.compare(e2.getValue(), e1.getValue());
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(comp);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.offer(entry);
        }

        int[] out = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> curr = pq.poll();
            int val = curr.getKey();
            out[i] = val;
        }

        return out;
    }
}
