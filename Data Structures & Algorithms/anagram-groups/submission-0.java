class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        List<List<String>> out = new ArrayList<>();

        for (String s : strs) {
            groups.computeIfAbsent(lexioSort(s), k -> new ArrayList<>()).add(s);
        }

        for (List<String> li : groups.values()) {
            out.add(li);
        }

        return out;
    }

    public String lexioSort(String str) {
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        String out = Arrays.toString(strArr);
        return out;
    }

}
