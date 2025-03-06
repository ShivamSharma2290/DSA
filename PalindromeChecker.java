public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        // Initialize two pointers
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false; // If they are not the same, it's not a palindrome
            }
            i++;
            j--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));  // Output: true
    }
}