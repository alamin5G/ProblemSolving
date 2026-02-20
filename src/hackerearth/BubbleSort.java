package hackerearth;

import java.util.Scanner;

// Problem link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/bubble-sort-15-8064c987/
public class BubbleSort {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        int c = 0; //to count the traversals of the array

        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }


        for(int i = 0; i < n-1; i++){
            c++; //counting the traversals of the array
            boolean swap = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if(!swap) break;
        }

        System.out.println(c);
    }
}
