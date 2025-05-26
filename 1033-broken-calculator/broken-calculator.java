class Solution {
    public int brokenCalc(int start, int target) {
        //TC : O(nlog n).
        int ans = 0;
        while(target>start)
        {
            if(target%2==1)
            {
                target++;
            }
            else
            {
                target/=2;
            }
            ans++;
        }
        return ans + start-target;
    }
}

