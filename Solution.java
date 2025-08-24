class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int l=0,r=0;
        int zero=0,max=0;
        while(r<n)
        {
            if(nums[r]!=1)
            {
                if(zero>0)
                {
                    while(zero>0)
                    {
                        if(nums[l]==0)
                            zero--;
                        l++;
                    }
                }
                zero++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max-1;
    }
}