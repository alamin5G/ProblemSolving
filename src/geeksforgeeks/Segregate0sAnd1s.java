package geeksforgeeks;

//problem link: https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
public class Segregate0sAnd1s {
    // User function Template for Java

    class Solution {
        void segregate0and1(int[] arr) {
            // code here
            Boolean one = false;
            Boolean zero = false;
            int i = 0;
            int j = arr.length-1;

            while(i < j){
                if(arr[i] != 0){
                    one = true;
                }

                if(arr[j] != 1){
                    zero = true;
                }

                if(arr[i] == 0){
                    i++;
                }

                if(arr[j] == 1){
                    j--;
                }

                if(zero && one){
                    arr[i] = 0;
                    arr[j] = 1;
                    i++;
                    j--;
                    one = false;
                    zero = false;
                }
            }
        }
    }

}
