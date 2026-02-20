package hackerearth;

import java.util.Scanner;

//problem link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/
public class SavePatients {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] patient = new int[n];
    int[] vaccine = new int[n];

    //input for patients and vaccines
    for (int i = 0; i < n; i++) {
        patient[i] = input.nextInt();
    }

    for (int i = 0; i < n; i++) {
        vaccine[i] = input.nextInt();
    }


    //sort the patients and vaccines
    bubbleSort(patient);
    bubbleSort(vaccine);

    //count if the patient can be saved or not
        for(int i = 0; i < n; i++){
            if(patient[i] > vaccine[i]){
                System.out.println("No");
                return;
            }
        }


    }


    public static  void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
