class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1; 
        int high = position[n - 1] - position[0]; 
        int result = 0; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPutballs(position, m, mid)) {
                result = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        
        return result;
    }

    private static boolean canPutballs(int[] position, int m, int distance) {
        int count = 1; 
        int endPosition = position[0]; 
        
        for (int i = 1; i < position.length; i++) {
    
            if (position[i] - endPosition >= distance) {
                count++;
                endPosition = position[i]; 
                
                if (count == m) { 
                    return true;
                }
            }
        }
        return false;
        
    }
}