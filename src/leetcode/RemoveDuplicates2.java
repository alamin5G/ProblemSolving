package leetcode;
// problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class RemoveDuplicates2 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1};
        RemoveDuplicates2 solution = new RemoveDuplicates2();
        System.out.println("Length of array after removing duplicates: ");
        System.out.println(solution.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 2;
        int j = 2;

       if(nums.length == 0) return 0;
       else  if(nums.length == 1) return 1;
       else   if(nums.length == 2) return 2;
       else{
           while( j != nums.length){

               if(nums[j] != nums[i-2]){
                   nums[i] = nums[j];
                   i++;

               }
               j++;


           }
       }


        return i;
    }
}
