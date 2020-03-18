package HomeWork3_3_2020;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {
    public static void copyArray(int arrayIn[], int n){
        int[] arrayOut= Arrays.copyOf(arrayIn, n);
        System.out.print("\nNew Array = [" + arrayOut[0]);
        for(int i = 1; i < arrayOut.length; i++){
            System.out.print(", " + arrayOut[i]);
        }
        System.out.print("]");
    }
    public static void copyArray2(int arrayIn2[]){
        int[] arrayOut2 = arrayIn2.clone();
        System.out.print("\nNew Array2 = [" + arrayOut2[0]);
        for(int i = 1; i < arrayOut2.length; i++){
            System.out.print(", " + arrayOut2[i]);
        }
        System.out.print("]");
    }
    public static void copyArray3(int arrayIn3[]){
        int arrayOut3[] = new int[arrayIn3.length];
        System.arraycopy(arrayIn3, 0, arrayOut3, 0, arrayIn3.length);
        System.out.print("\nNew Array3 = [" + arrayOut3[0]);
        for(int i = 1; i < arrayIn3.length; i++){
            System.out.print(", " + arrayOut3[i]);
        }
        System.out.print("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int sizeArray;
        System.out.println("Moi ban nhap kich thuoc mang: ");
        sizeArray = sc.nextInt();
        int arrayNew[] = new int[sizeArray];
        for(int i =0; i < sizeArray; i++){
            arrayNew[i] = rd.nextInt(101);
        }
        copyArray(arrayNew, sizeArray);
        copyArray2(arrayNew);
        copyArray3(arrayNew);
    }
}
