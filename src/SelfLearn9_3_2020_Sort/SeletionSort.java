package SelfLearn9_3_2020_Sort;

import java.util.Random;
import java.util.Scanner;

public class SeletionSort {
    public static void SelectionSort(int arrayIn[], int sizeArrayIn){

    }
    public static void main(String[] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeArray1 = sc.nextInt();
        int array1[] = new int[sizeArray1];
        for(int a = 0; a < sizeArray1; a++){
            array1[a] = rd.nextInt(101);
        }
        System.out.print("Array: [" + array1[0]);
        for(int b = 1; b < sizeArray1; b++){
            System.out.print(", " + array1[b]);
        }
        System.out.print("]");

        int max;
        for(int c = 0; c < sizeArray1 -1; c++){
            max = c;
            for(int d = c + 1; d < sizeArray1; d++){
                if(array1[max] < array1[d]){
                    int sw = array1[max];
                    array1[max] = array1[d];
                    array1[d] = sw;
                }
            }
        }

        System.out.print("\nNew Array with Selection-Sort: [" + array1[0]);
        for(int e = 1; e < sizeArray1; e++){
            System.out.print(", " + array1[e]);
        }
        System.out.print("]");
    }
}
