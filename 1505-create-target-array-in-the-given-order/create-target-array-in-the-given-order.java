class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            lst.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i]=lst.get(i);

        }
        return target;
    }
}