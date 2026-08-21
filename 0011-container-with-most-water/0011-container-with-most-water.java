class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxWater=0;
        int l=0;
        int r=n-1;
        while(l<r){
            int width=r-l;
            int ht=Math.min(height[l],height[r]);
            int currWater=width*ht;
            maxWater=Math.max(maxWater,currWater);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxWater;
    }
}