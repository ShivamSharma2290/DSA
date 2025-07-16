class Solution {
    public int lengthOfLIS(int[] nums) {
         List<Integer> sub = new ArrayList<>(); 
    for (int num : nums) { 
        int i = Collections.binarySearch(sub, num); 
        if (i < 0) i = -(i + 1); 
        if (i < sub.size()) sub.set(i, num); 
        else sub.add(num); 
    } 
    return sub.size(); 
    }
}