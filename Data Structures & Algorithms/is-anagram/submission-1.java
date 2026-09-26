class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();

        Map<Character, Integer> freq1 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (!freq.containsKey(curr)) {
                freq.put(curr, 1);
            } else {
                int val = freq.get(curr);
                freq.put(curr, val + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            Character curr = t.charAt(i);
            if (!freq1.containsKey(curr)) {
                freq1.put(curr, 1);
            } else {
                int val = freq1.get(curr);
                freq1.put(curr, val + 1);
            }
        }

        for (char key : freq.keySet()) {

            if (!freq1.containsKey(key)) {
                return false;
            }

            int mapVal = freq.get(key);
            int mapVal1 = freq1.get(key);

            if (mapVal != mapVal1) {
                return false;
            } else {
                continue;
            }
        }

        return true;

    }
}
