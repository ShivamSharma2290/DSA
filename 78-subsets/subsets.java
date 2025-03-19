class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums.length-1, nums,  res,new ArrayList<>());
        return res; 
    }
    public void backTrack(int n,int[] nums,List<List<Integer>> res,List<Integer> temp)
    {
        if(n==-1)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[n]);
        backTrack(n-1,nums,res,temp);
        temp.remove(temp.size() - 1);
        backTrack(n-1,nums,res,temp);
    }
    

   
}
/*
public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int start, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        res.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);         
            backtrack(i + 1, nums, temp, res);
            temp.remove(temp.size() - 1); 
        }
    }
*/