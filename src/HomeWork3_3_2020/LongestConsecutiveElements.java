package HomeWork3_3_2020;

import java.util.Random;

public class LongestConsecutiveElements {
    public static int CountNumber(int size, int a1[]) {
        int j = 1;
        int max = 1;
        for (int i = 0; i < size - 1; i++) {
            if (a1[i] + 1 == a1[i + 1]) {
                j += 1;
                if (j > max) {
                    max = j;
                }
            } else j = 1;
        }
        return max;
    }
    public static void main(String[] args){
        int a[] = new int [100];
        Random rd = new Random();
        for(int i = 0; i < 100; i++){
            a[i] = rd.nextInt(9);
        }
        for(int element : a){
            System.out.print(element + "\t");
        }
        int n = CountNumber(100, a);
        System.out.println("\nLength of the longest consecutive elements sequence from of the unsorted array a is: " + n);
        int a2[] = {1,2,3,4,5,6,6,1,2,3,4,5,1,2,3,0,5,6,0,8,9,0,1,2,3};
        int m = CountNumber(25, a2);
        for(int element : a2){
            System.out.print(element + "\t");
        }
        System.out.println("\nLength of the longest consecutive elements sequence from of the unsorted array a2 is: " + m);
    }
}
