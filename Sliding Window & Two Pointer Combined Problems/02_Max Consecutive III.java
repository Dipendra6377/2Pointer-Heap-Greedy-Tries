class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        int n =nums.length;
        int zeroCnt =0;

        while(i<n){
            if(nums[i]==0){
                zeroCnt++;
            }
            while(zeroCnt>k){
                if(nums[j]==0){
                    zeroCnt--;
                }
                j++;
            }

            max=Math.max(max,i-j+1);
            i++;
        }
        return max;
    }
}
