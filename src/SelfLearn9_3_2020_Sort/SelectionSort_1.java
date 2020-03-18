package SelfLearn9_3_2020_Sort;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter size of new array: ");
        int sizeArray2 = sc.nextInt();
        int array2[] = new int[sizeArray2];
        for(int f = 0; f < sizeArray2; f++){
            array2[f] = rd.nextInt(101);
        }
        System.out.print("\nNew array: [" + array2[0]);
        for(int g = 1; g < sizeArray2; g++){
            System.out.print(", " + array2[g]);
        }
        System.out.print("]");

        for(int h = 0; h < sizeArray2 - 1; h++){
            int min = h;
            for(int i = h + 1; i < sizeArray2; i++){
                if(array2[min] > array2[i]){
                    int sw = array2[min];
                    array2[min] = array2[i];
                    array2[i] = sw;
                }
            }
        }

        System.out.print("\nNew array with SelecctionSort: [" + array2[0]);
        for(int j = 1; j < sizeArray2; j++){
            System.out.print(", " + array2[j]);
        }
        System.out.print("]");
    }
}
