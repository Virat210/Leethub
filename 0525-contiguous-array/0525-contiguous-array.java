class Solution{
    public int findMaxLength(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,ans=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum--;
            else if(nums[i]==1) sum++;

            if(sum==0){
                ans=Math.max(ans,i+1);
            }
            else if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}