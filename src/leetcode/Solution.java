package leetcode;
// problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2};
        Solution solution = new Solution();
        System.out.println("Length of array after removing duplicates: ");
        System.out.println(solution.removeDuplicates(nums));
    }



    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while(j != nums.length){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                j++;
            }else{
                j++;
            }
        }

        for(int n : nums){
            System.out.print(n + " ");
        }
        System.out.println();
        return i + 1;
    }
}
