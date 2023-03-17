class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }

        int remove=k-1;
        int add =cardPoints.length-1;
        int res=sum;
        while(remove>=0){
            sum-=cardPoints[remove--];
            sum+=cardPoints[add--];

            res=Math.max(res,sum);
        }
        return res;
    }
}
