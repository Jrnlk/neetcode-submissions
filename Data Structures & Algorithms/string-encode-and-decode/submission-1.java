class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");

        for (String s : strs) {
            String len = Integer.toString(s.length());
            sb.append("[" + len + "]" + s);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> out = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            StringBuilder sb = new StringBuilder("");
            Character curr = str.charAt(i);

            // Length counter 
            int start = str.indexOf('[', i);
            int end = str.indexOf(']', i);

            if (curr == '[') {
                StringBuilder wordLength = new StringBuilder("");

                String result = str.substring(start + 1, end);
                int length = Integer.valueOf(result);
                
                // word builder
                for (int j = end + 1; j <= length + end; j++) {
                    sb.append(str.charAt(j));
                }

                int diff = end - start;
                i = i + length + diff;
            } else {
                continue;
            }

            out.add(sb.toString());
            
        }

        return out;
    }
}
