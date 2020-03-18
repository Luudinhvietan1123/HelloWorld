package Study_28_02_2020;

import java.util.Scanner;

public class HomeWork_28_2_2020_SUM {
    public static void main(String[] args){
        System.out.println("Import number: ");
        int r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        while(r < 0){
            System.out.println("Invalid number!! Try agian:");
            r = sc.nextInt();
        }
        int SUM1 = 0;
        for(int i = 1; i <= r; i++){
            SUM1 = SUM1 + i;
        }
        float AVERAGE1 = (float) SUM1/r;
        System.out.println("SUM1 = " + SUM1 + "\nAVERAGE1 = " + AVERAGE1);
        int SUM2 = 0, j = 1;
        while(j <= r){
            SUM2 = SUM2 + j;
            j++;
        }
        float AVERAGE2 = (float) SUM2/r;
        System.out.println("SUM2 = " + SUM2 + "\nAVERAGE2 = " + AVERAGE2);
        int SUM3 = 0, l = 1;
        do{
            SUM3 = SUM3 + l;
            l++;
        }while(l <= r);
        float AVERAGE3 = (float) SUM3/r;
        System.out.println("SUM3 = " + SUM3 + "\nAVERAGE3 = " + AVERAGE3);
    }
}
