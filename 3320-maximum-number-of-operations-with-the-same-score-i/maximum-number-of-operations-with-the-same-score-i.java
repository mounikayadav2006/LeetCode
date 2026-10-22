class Solution {
    public int maxOperations(int[] nums) {
        int inital=nums[0]+nums[1];
        int count=1;
        for(int i=2;i<nums.length-1;i+=2){
            if(nums[i]+nums[i+1]!=inital){
                break;
            }
            count++;
        }
        return count;
    }
}