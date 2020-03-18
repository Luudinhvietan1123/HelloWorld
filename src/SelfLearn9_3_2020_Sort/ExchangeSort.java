package SelfLearn9_3_2020_Sort;

import java.util.Random;
import java.util.Scanner;

public class ExchangeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter size of new array: ");
        int sizeArray7 = sc.nextInt();
        int array7[] = new int[sizeArray7];
        for(int b7 = 0; b7 < sizeArray7; b7++){
            array7[b7] = rd.nextInt(101);
        }
        System.out.print("New array: [" + array7[0]);
        for(int c7 = 1; c7 < sizeArray7; c7++){
            System.out.print(", " + array7[c7]);
        }
        System.out.print("]");
    }
}
