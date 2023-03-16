//Naive Approach

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int n=s.length();
        int j=0;
        int max=0;

        for(int i=0;i<n;i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                max=Math.max(max,i-j+1);
            }
            else{
                while(s.charAt(i)!=s.charAt(j)){
                    map.remove(s.charAt(j));
                    j++;
                }

                map.remove(s.charAt(j));
                j++;
                map.put(s.charAt(i),1);
            }
        }
        return max;
    }
}

// optimised approach

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int len=0;

        HashMap<Character,Integer> map=new HashMap<>();
        while(i<n){
            if(map.containsKey(s.charAt(i))){
                j=Math.max(map.get(s.charAt(i))+1,j);  // why taken the max fry run for this "abba"
            }
            map.put(s.charAt(i),i);
            len=Math.max(len,i-j+1);
            i++;
        }
        return len;
    }
}
