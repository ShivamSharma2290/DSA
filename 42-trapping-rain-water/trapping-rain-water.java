class Solution {
    public int trap(int[] height) {
        if (height.length == 0) return 0;

      //using two pointer L && R.
        int ans = 0;
        int l = 0, r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];

        while (l < r) {
            if (maxL < maxR) {
                ans += Math.max(0, maxL - height[l]);
                maxL = Math.max(maxL, height[++l]);
            } else {
                ans += Math.max(0, maxR - height[r]);
                maxR = Math.max(maxR, height[--r]);
            }
        }

        return ans;
    }
}
