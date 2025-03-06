class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false; // If mismatch found, it's not a palindrome
            }
        }
        return true; // If no mismatch found, it's a palindrome
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("abcba"));  // Output: true
    }
}
