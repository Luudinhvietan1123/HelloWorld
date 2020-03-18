package Study25_2_2020;

import java.util.Scanner;

public class HomeWork_25_02_2020_n_Plus_nn_Plus_nnn {
    public static void main(String[] args){
        System.out.println("Inport number: ");
        Scanner sc = new Scanner(System.in);
        int F;
        F = sc.nextInt();
        System.out.print("\nThis is answer: "
                + F + " + "
                + (F*10 + F) + " + "
                + (F*100 + F*10 + F) + " = "
                + (F + (F + F*10) + (F + F*10 + F*100)));
    }
}
