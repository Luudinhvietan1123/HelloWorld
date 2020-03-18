package HomeWork3_3_2020;

import java.util.Random;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int newSizeArray;
        System.out.println("Enter size of Array: ");
        newSizeArray = sc.nextInt();
        int arrayBefore[] = new int[newSizeArray];
        System.out.print("\nBefore: [" + (arrayBefore[0] = rd.nextInt(10)));
        for (int i = 1; i < newSizeArray; i++) {
            arrayBefore[i] = rd.nextInt(10);
            System.out.print(", " + arrayBefore[i]);
        }
        System.out.print("]");
        int arrayAfter[] = new int[newSizeArray];
        arrayAfter[0] = arrayBefore[0];
        int count = 1;

        for(int i = 1; i < newSizeArray; i++){
            for(int j = 0; j < count; j++){
                if(arrayAfter[j] == arrayBefore[i]){
                    break;
                }
                else if(j == count - 1 && arrayAfter[j] != arrayBefore[i]){
                    arrayAfter[count] = arrayBefore[i];
                    count++;
                }
            }
        }

        System.out.print("\nAfter: [" + arrayBefore[0]);
        for (int q = 1; q < count; q++){
            System.out.print(", " + arrayAfter[q]);
        }
        System.out.print("]");
    }
}