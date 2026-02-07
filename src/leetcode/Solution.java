package leetcode;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2, 3, 3, 4, 4, 5, 5, 5, 6};
        Solution solution = new Solution();
        System.out.println("Length of array after removing duplicates: ");
        System.out.println(solution.removeDuplicates(nums));
    }



    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int k = 1;
        boolean same = false;
        while(j != nums.length){
            if(nums[i] == nums[j]){
                same = true;
                j++;
            }else if(nums[i] != nums[j] && same){
                i++;
                nums[i] = nums[j];
                k++;
                j++;
                same = i != j-1;
            }else{
                j++;
                i++;
                k++;
            }
        }

        return k;
    }
}
