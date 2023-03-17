class Solution {
    public int numberOfSubstrings(String s) {
        int res=0;
        int j=0; int[] count=new int[3];
        int n=s.length();

        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;

            while(count[0]>0 && count[1]>0 && count[2]>0){
                System.out.println(i);
                res+=n-i;
                System.out.println("res "+res);
                count[s.charAt(j)-'a']--;
                j++;
            }
        }
        return res;
    }
}
