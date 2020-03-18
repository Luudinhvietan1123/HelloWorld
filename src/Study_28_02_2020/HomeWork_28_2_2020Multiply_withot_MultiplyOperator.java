package Study_28_02_2020;

import java.util.Scanner;

public class HomeWork_28_2_2020Multiply_withot_MultiplyOperator {
    public static void main(String [] args){
        int a, b;
        System.out.println("Moi ban nhap vao so a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Moi ban nhap vao so b: ");
        b = sc.nextInt();
        int c = 0;
        for(int i = 1; i <= b; i++){
            c = c + a;
        }
        System.out.println("Tich cua a va b la: " + c);
    }
}

