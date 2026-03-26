class Solution {
    public int pivotIndex(int[] nums) { 
        int n=nums.length;
        int m=0;
        for(int i=0;i<n;i++)
        {
            int l=0;
            int r=n-1;
            int suml=0;
            int sumr=0;
            for(int j=l;j<=m-1;j++)
            {
                suml+=nums[j];
            }
            for(int k=m+1;k<=r;k++)
            {
                sumr+=nums[k];
            }
            if(suml==sumr)
            {
                return i;
            }
            m++;
        }
        return -1;
        
    }
}
