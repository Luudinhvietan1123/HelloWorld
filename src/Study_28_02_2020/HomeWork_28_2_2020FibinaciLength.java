package Study_28_02_2020;

import java.util.Scanner;

public class HomeWork_28_2_2020FibinaciLength {
    public static void main(String[] args){
        System.out.println("Please Enter Fibonaci Length: ");
        Scanner sc = new Scanner(System.in);
        int c;
        c =  sc.nextInt();
        while(c < 0 || c > 10000) {
            System.out.println("Invalid Length!!! Try again: ");
            c = sc.nextInt();
            }
        int arr[];
        arr = new int[10000];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < c; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for(int j = 0; j < c - 1; j++){
            System.out.print(arr[j] + ", ");
        }
        System.out.print(arr[c - 1]);
    }
}
