class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime
        
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Step 2: Use two pointers to find the closest prime pair
        int prev = -1, num1 = -1, num2 = -1, minDiff = Integer.MAX_VALUE;
        
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                if (prev != -1 && (i - prev) < minDiff) {
                    minDiff = i - prev;
                    num1 = prev;
                    num2 = i;
                }
                prev = i;
            }
        }
        
        return num1 == -1 ? new int[]{-1, -1} : new int[]{num1, num2};
    }
}