package SelfLearn3_3_2020_StringAndArray;

import java.util.Scanner;

public class        OperationWithArrayAndString_4 {
    public static void main(String[] args){
        int arr2[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Moi ban nhap arr2[" + (i + 1) + "][" + (j + 1) + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang 2 chieu ban vua nhap la: ");
        for(int m = 0; m < 3; m++){
            for(int n = 0; n < 3; n++){
                System.out.print(arr2[m][n] + " ");
            }
            System.out.println("\n");
        }
    }
}
