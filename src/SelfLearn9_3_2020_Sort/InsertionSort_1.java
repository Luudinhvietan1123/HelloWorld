package SelfLearn9_3_2020_Sort;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter size array: ");
        int sizeArray5 = sc.nextInt();
        int array5[] = new int[sizeArray5];
        for(int a5 = 0; a5 < sizeArray5; a5++){
            array5[a5] = rd.nextInt(101);
        }
        System.out.print("New array: [" + array5[0]);
        for(int b5 = 1; b5 < sizeArray5; b5++){
            System.out.print(", " + array5[b5]);
        }
        System.out.print("]");
        for(int c5 = 1; c5 < sizeArray5; c5++){//toán tử ++ là tiền tố hay hậu tố không làm ảnh hưởng đến kết quả bài toán?
            int key = array5[c5];
            int d5 = c5 - 1;
            while(d5 >=0 && array5[d5] > key){
                array5[d5 + 1] = array5[d5];
                d5--;
            }
            array5[d5 + 1] = key;
        }
        System.out.print("\nNew array with InsertionSort: [" + array5[0]);
        for(int e5 = 1; e5 < sizeArray5; e5++){
            System.out.print(", " + array5[e5]);
        }
        System.out.print("]");
    }
}
