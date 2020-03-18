package HomeWork3_3_2020;

import java.util.Random;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args){
        int sizeArray1, sizeArray2;
        System.out.println("Enter size of Array1: ");
        Scanner sc= new Scanner(System.in);
        sizeArray1 = sc.nextInt();
        System.out.println("Enter size of Array2: ");
        sizeArray2 = sc.nextInt();
        int Array1[] = new int[sizeArray1];
        int Array2[] = new int[sizeArray2];
        Random rd = new Random();
        for(int i = 0; i < sizeArray1; i++){
            Array1[i] = rd.nextInt(101);
        }
        for(int j = 0; j < sizeArray2; j++){
            Array2[j] = rd.nextInt(101);
        }
        int sizeArray3 = sizeArray1 + sizeArray2;
        int Array3[] = new int[sizeArray3];
        for(int i2 = 0; i2 < sizeArray1; i2++){
            Array3[i2] = Array1[i2];
        }
        for(int j2 = sizeArray1; j2 < sizeArray3; j2++){
            Array3[j2] = Array2[j2 - sizeArray1];
        }
        System.out.print("\nArray3 = [" + Array3[0]);
        for(int i3 = 1; i3 < sizeArray3; i3++){
            System.out.print(", " + Array3[i3]);
        }
        System.out.print("]");
    }
}
