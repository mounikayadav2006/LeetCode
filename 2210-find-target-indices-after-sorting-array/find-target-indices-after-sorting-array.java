// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer>lst=new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 lst.add(i);
//             }
//         }
//         return lst;
//     }
// }


// import java.util.*;

// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         Arrays.sort(nums);

//         List<Integer> list = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 list.add(i);
//             } else if (nums[i] > target) {
//                 break;
//             }
//         }

//         return list;
//     }
// }


class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lst=new ArrayList<>();
        int smaller=0;
        int equal=0;
        for(int num:nums){
            if(num<target){
                smaller++;
            }
            else if(num==target){
                equal++;
            }
        }
        for(int i=smaller;i<smaller+equal;i++){
            lst.add(i);
        }
        return lst;
    }
}