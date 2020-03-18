package SelfLearn3_3_2020_StringAndArray;

import java.util.Scanner;

public class OparationWithArrayAndString_5 {
    public static void main(String[] args){
        String arr3[][] = new String[3][3];
        Scanner sc = new Scanner(System.in);
        for(int t = 0; t < 3; t++){
            System.out.println("Moi ban nhap ten: ");
            arr3[t][0] = sc.nextLine();
            System.out.println("Moi ban nhap lop: ");
            arr3[t][1] = sc.nextLine();
            System.out.println("Moi ban nhap nganh hoc: ");
            arr3[t][2] = sc.nextLine();
        }
        System.out.println("Nhap mssv: ");
        int mssv = sc.nextInt();
        System.out.println("Thong tin ban can tim la: "
        + "\nTen: " + arr3[mssv - 1][0]
        + "\nLop: " + arr3[mssv - 1][1]
        + "\nNganh hoc: " + arr3[mssv - 1][2]);
    }
}