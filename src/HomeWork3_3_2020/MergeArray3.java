package HomeWork3_3_2020;

import java.util.Random;

public class MergeArray3 {
    public static void main(String[] args){
        int arr1[] = new int[10];
        int arr2[] = new int[5];
        Random rd = new Random();
        for(int i = 0; i < 10; i++){
            arr1[i] = rd.nextInt(101);
        }
        for(int j = 0; j < 5; j++){
            arr2[j] = rd.nextInt(101);
        }
        int arr3[] = new int[100];
        for(int k = 0; k < 10; k++){
            arr3[k] = arr1[k];
        }
        for(int k = 10; k < 15; k++){
            arr3[k] = arr2[k - 10];
        }
        for(int k2 = 0; k2 < 15; k2++){
            System.out.print(arr3[k2] + "\t");
        }
    }
}
