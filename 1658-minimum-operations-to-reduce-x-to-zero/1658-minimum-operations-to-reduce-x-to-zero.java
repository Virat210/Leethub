class Solution {
    public int minOperations(int[] nums, int x) {

       int total=0;
       for(int i:nums) total+=i;
       
       int target=total -x;
     
       
       if(target<0) return -1;
        int i=0;
        int j=0;
        int sum=0;
        int ans=-1;
        while(j<nums.length){
            sum+=nums[j];
            
            while(sum>target){
                sum-=nums[i];
                i++;
            }
            if(sum==target ){
                ans=Math.max(ans , j-i+1);
            }
        
            j++;
        }
        return ans==-1 ? -1: nums.length - ans;
    }
}
