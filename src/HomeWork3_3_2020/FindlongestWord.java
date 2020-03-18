package HomeWork3_3_2020;

import java.util.Scanner;

public class FindlongestWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String yourName1 = sc.nextLine();
        String yourName2[] = yourName1.split(" ");
        String max1 = yourName2[0];
        /*System.out.println(max);*/
        for(String max2 : yourName2){
            if(max2.length() > max1.length()){
                max1 = max2;
            }
        }
        System.out.println("The longest word in Your Name is: " + max1);
    }
}
