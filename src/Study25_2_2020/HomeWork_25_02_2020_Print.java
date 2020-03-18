package Study25_2_2020;

import java.util.Scanner;

public class HomeWork_25_02_2020_Print {
    public static void main(String[] args){
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so A: ");
        A = sc.nextInt();
        System.out.println("Moi ban nhap so B: ");
        B = sc.nextInt();
        System.out.print("\nA + B = ");
        System.out.print(A + B);
        System.out.print("\nA - B = ");
        System.out.print(A - B);
        System.out.print("\nA * B = ");
        System.out.print(A * B);
        System.out.print("\nA / B = ");
        System.out.print(A / B);
        System.out.print("\nA mod B = ");
        System.out.print(A % B);
    }
}
