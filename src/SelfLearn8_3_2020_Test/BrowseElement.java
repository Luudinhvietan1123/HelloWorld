package SelfLearn8_3_2020_Test;

import java.util.Random;

public class BrowseElement {
    public static void main(String[] args){
        int array[] = new int[100];
        Random rd = new Random();
        for(int i = 0; i < 10; i++){
            array[i] = rd.nextInt(11);
        }
        System.out.print("[" + array[0]);
        for(int j = 1; j <10; j++){
            System.out.print(", " + array[j]);
        }
        System.out.print("]");
        for(int k = 0; k < 10; k++){
            if(array[k] == 6){
                System.out.println("\nInvalid Array");
                break;
            }
            else if (k == 9){
                System.out.println("\nValid Array");
            }
        }
    }
}
