package SelfLearn9_3_2020_Sort;

import java.util.Random;
import java.util.Scanner;

public class InsretionSort_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter size of new array: ");
        int sizeArray6 = sc.nextInt();
        int array6[] = new int[sizeArray6];
        for(int a6 = 0; a6 < sizeArray6; a6++){
            array6[a6] = rd.nextInt(101);
        }
        System.out.print("New array: [" + array6[0]);
        for(int b6 = 1; b6 <sizeArray6; b6++){
            System.out.print(", " + array6[b6]);
        }
        System.out.print("]");
        for(int c6 = 1; c6 < sizeArray6; ++c6){
            int key = array6[c6];
            int d6 = c6 - 1;
            while(d6 >= 0 && array6[d6] > key){
                array6[d6 + 1] = array6[d6];
                d6--;
            }
            array6[d6 + 1] = key;
        }
        System.out.print("\nNew array with InsertionSort: [" + array6[0]);
        for(int e6 = 1; e6 < sizeArray6; e6++){
            System.out.print(", " + array6[e6]);
        }
        System.out.print("]");
    }
}
