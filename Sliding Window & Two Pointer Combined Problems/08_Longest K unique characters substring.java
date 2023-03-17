class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map =new HashMap<>();
        int j=0;
        int max=-1;
        int n=s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
            if(map.size()==k){
                max=Math.max(max,i-j+1);
            }
            
            while(map.size()>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                
                if(map.get(s.charAt(j))==0){
                    map.remove(s.charAt(j));
                }
                j++;
            }
        }
        return max;
    }
}
