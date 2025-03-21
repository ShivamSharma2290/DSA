class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         Arrays.sort(nums);
        backTrack(0, nums,  res,new ArrayList<>());
        return res; 
    }
    public void backTrack(int start,int[] nums,List<List<Integer>> res,List<Integer> temp)
    {
         res.add(new ArrayList<>(temp));
         for (int i = start; i < nums.length; i++) {
              // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue; 
            temp.add(nums[i]);
            backTrack(i + 1, nums, res, temp);
            temp.remove(temp.size() - 1);
         }
        
    }
}