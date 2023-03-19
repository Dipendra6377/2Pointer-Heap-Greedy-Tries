class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        int i=-1;
        int j=-1;
        int count=0;
        int reqcount=t.length();
        HashMap<Character,Integer> map1 =new HashMap<>();

        for(char ch :t.toCharArray() ){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2 =new HashMap<>();
        while(true){
            boolean flag1=false;
            boolean flag2=false;

            while(i<s.length()-1 && count<reqcount){
                i++;
                char ch = s.charAt(i);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);

                if(map2.getOrDefault(ch, 0) <= map1.getOrDefault(ch, 0)) {
                    count++;
                }

                flag1 = true;
            }

            while(j<i && count==reqcount){
                 String pans = s.substring(j+1, i+1);
                if(ans.length()==0 || pans.length()<ans.length()){
                    ans = pans;
                }
                j++;
                char ch = s.charAt(j);
                if(map2.get(ch) == 1) {
                    map2.remove(ch);
                }
                else {
                    map2.put(ch, map2.get(ch)-1);
                }

                if(map2.getOrDefault(ch,0) < map1.getOrDefault(ch,0)) {
                    count--;
                }

                flag2 = true;
            }
            if(flag1 == false && flag2 == false) {
                break;
            }
        }
        return ans;
    }
}
