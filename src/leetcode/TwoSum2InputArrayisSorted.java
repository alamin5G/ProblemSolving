package leetcode;

//problem link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSum2InputArrayisSorted {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int i=0;
            int j=numbers.length-1;
            int sum = 0;
            int[] result = new int[2];
            while(i < j){
                sum = numbers[i] + numbers[j];
                if(sum == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }else if(sum > target){
                    j--;
                }else{
                    i++;
                }
            }
            return result;
        }
    }
}
