class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0;int j=0; int count=0;
        int odd=0; int res=0;
        int n=nums.length;

        while(i<n){
            if(nums[i]%2!=0){
                odd++;
                count=0;
            }
            
            while(odd==k){
                if(nums[j++]%2!=0){
                    odd--;
                }
                count++;
            }
            res+=count;
            i++;
        }
        return res;
    }
}
