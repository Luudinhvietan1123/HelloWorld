package Study25_2_2020;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class HomeWork_25_2_2020_Multiplication {
    public static void main(String [] arcs){
        int C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Import C: ");
        C = sc.nextInt();
        System.out.println("This is Multiplication Table of " + C);
        System.out.print(C + " * 1 = " + C * 1);
        System.out.print("\n" + C + " * 2 = " + C * 2);
        System.out.print("\n" + C + " * 3 = " + C * 3
                +"\n" + C + " * 4 = " + C * 4
                +"\n" + C + " * 5 = " + C * 5
                +"\n" + C + " * 6 = " + C * 6
                +"\n" + C + " * 7 = " + C * 7
                +"\n" + C + " * 8 = " + C * 8
                +"\n" + C + " * 9 = " + C * 9
                +"\n" + C + " * 10 = " + C * 10);
    }
}
