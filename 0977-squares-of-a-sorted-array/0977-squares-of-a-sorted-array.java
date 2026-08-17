class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int k=n-1;
        int[] result=new int[n];
        while(l<=r){
            int lSq=nums[l]*nums[l];
            int rSq=nums[r]*nums[r];
            if(lSq>rSq){
                result[k]=lSq;
                l++;
            }
            else{
                result[k]=rSq;
                r--;
            }
            k--;
        }
        return result;
    }
}