package SelfLearn3_3_2020_StringAndArray;

import java.util.Scanner;

public class OperationWithStringAndArray_6 {
    public static void main(String[] args){
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap mat khau cua ban: ");
        s1 = sc.nextLine();
        int n1 = s1.length();
        //System.out.println(n);
        String s2;
        System.out.println("Moi ban nhap lai mat khau: ");
        s2 = sc.nextLine();
        int n2 = s2.length();
        if(n1> n2 || n1 < n2){
            System.out.println("Mat khau khong hop le!");
        }
        else if(n1 == n2){
            int j = 0;
            for(int i = 0; i < n1; i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    System.out.println("Mat khau khong hop le!");
                    break;
                }
                j++;
                }
            if(j == n1){
                System.out.println("Mat khau hop le");
            }
        }
    }
}
