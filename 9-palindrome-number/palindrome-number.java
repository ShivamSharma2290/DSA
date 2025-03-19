class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }else if(x<0){
            return false;
        }
         String str = String.valueOf(x);
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private boolean isPalindromeHelper(String str, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return isPalindromeHelper(str, i + 1, j - 1);
    }
}
