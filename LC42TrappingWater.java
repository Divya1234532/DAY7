/*class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trap = 0;

        int[] left_max = new int[n];
        int[] right_max = new int[n];

        // fill left_max
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        }

        // fill right_max
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i]);
        }

        // calculate trapped water
        for (int i = 0; i < n; i++) {
            trap += Math.min(left_max[i], right_max[i]) - height[i];
        }

        return trap;
    }
}*/
class Solution {
    public int trap(int[] height) {
        int trap=0;
        int n=height.length;
        for(int i=0;i<n;i++)
        {
            int left_max=0;
            int right_max=0;
            for(int j=0;j<=i;j++)//left max
            {
                if(left_max<height[j])
                {
                    left_max=height[j];
                }
            }
            for(int k=i;k<n;k++)//right max
            {
                if(right_max<height[k])
                {
                    right_max=height[k];
                }
            }
            trap+=Math.min(left_max,right_max)-height[i];
        }
        return trap;
        
    }
}
