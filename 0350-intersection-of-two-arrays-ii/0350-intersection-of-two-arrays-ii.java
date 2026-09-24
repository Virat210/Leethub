import java.util.*;
class Solution{
    public int[] intersect(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int x:nums1){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        for(int x:nums2){
            map2.put(x,map2.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:map1.keySet()){
            if(map2.containsKey(x)){
                int freq=Math.min(map1.get(x),map2.get(x));
                for(int i=0;i<freq;i++){
                    list.add(x);
                }
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}