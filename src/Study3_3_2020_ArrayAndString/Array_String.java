package Study3_3_2020_ArrayAndString;

import java.util.Scanner;

public class Array_String {
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            a[i] = sc.nextInt();
        }
        for(int j = 0; j < 5; j++){
            System.out.print(a[j]);
        }
        System.out.println("\n");
        for(int item:a){
            System.out.println(item);
        }
    }
}
