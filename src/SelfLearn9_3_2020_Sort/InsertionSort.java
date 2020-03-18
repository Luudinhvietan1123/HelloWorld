package SelfLearn9_3_2020_Sort;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter size of array: ");
        int sizeArray4 = sc.nextInt();
        int array4[] = new int[sizeArray4];
        for(int a4 = 0; a4 < sizeArray4; a4++){
            array4[a4] = rd.nextInt(101);
        }
        System.out.print("New array: [" + array4[0]);
        for(int b4 = 1; b4 < sizeArray4; b4++){
            System.out.print(", " + array4[b4]);
        }
        System.out.print("]");
        for(int c4 = 1; c4 < sizeArray4; ++c4){// toán tử ++ là tiền tố hay hậu tố không ảnh hưởng đến kết quả bài toán?
            int key4 = array4[c4];
            int d4 = c4 - 1;
            while(d4 >= 0 && array4[d4] > key4){
                array4[d4 + 1] = array4[d4];
                d4--;
            }
            array4[d4 + 1] = key4;
        }
        System.out.print("\nNew array with InsertionSort: [" + array4[0]);
        for(int e4 = 1; e4 < sizeArray4; e4++){
            System.out.print(", " + array4[e4]);
        }
        System.out.print("]");
    }

}
