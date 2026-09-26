class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            Character left = s.charAt(start);
            Character right = s.charAt(end);

            System.out.println(left + " " + right);

            if (left != right) {
                return false;
            }

            start++;
            end--;

        }

        return true; 
    }
}
