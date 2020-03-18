package SelfLearn9_3_2020_Sort;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter new size of array: ");
        int sizeArray3 = sc.nextInt();
        int array3[] = new int[sizeArray3];
        for(int a1 = 0; a1 < sizeArray3; a1++){
            array3[a1] = rd.nextInt(101);
        }
        System.out.println("New array: [" + array3[0]);
        for(int b1 = 1; b1 < sizeArray3; b1++){
            System.out.print(", " + array3[b1]);
        }
        System.out.print("]");
        int min1;
        for(int c1 = 0; c1 < sizeArray3; c1++){
            min1 = c1;
            for(int d1 = c1 + 1; d1 < sizeArray3; d1++){
                if(array3[min1] > array3[d1]){
                    int sw = array3[min1];
                    array3[min1] = array3[d1];
                    array3[d1] = sw;
                }
            }
        }
        System.out.print("\nNew array with SelectionSort: [" + array3[0]);
        for(int e1 = 1; e1 < sizeArray3; e1++){
            System.out.print(", " + array3[e1]);
        }
        System.out.print("]");
    }
}
