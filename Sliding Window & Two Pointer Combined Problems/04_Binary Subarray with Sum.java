class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return Atmost(nums,goal)-Atmost(nums,goal-1);
    }

    public int Atmost(int[] arr,int goal){
        if(goal<0){
            return 0;
        }
       int i=0;
       int j=0; int count=0; int res=0;
       int n=arr.length;
       while(i<n){
           if(arr[i]==1) count++;

           while(count>goal){
               if(arr[j]==1) count--;
               j++;
           }
           res+=i-j+1;
           i++;
       }
       return res;
    }
}
