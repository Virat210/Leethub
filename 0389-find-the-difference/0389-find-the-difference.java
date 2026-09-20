import java.util.HashMap;

class Solution{
    public char findTheDifference(String s,String t){
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(char ch:map2.keySet()){
            if(!map1.containsKey(ch)||map1.get(ch)<map2.get(ch)){
                return ch;
            }
        }

        return ' ';
    }
}