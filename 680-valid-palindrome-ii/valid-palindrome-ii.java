class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        for (; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping one character from either side
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        for (; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.validPalindrome("aba"));   // true
        System.out.println(sol.validPalindrome("abca"));  // true
        System.out.println(sol.validPalindrome("abc"));   // false
    }
}
