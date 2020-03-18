package HomeWork3_3_2020;

import java.util.Random;
import java.util.Scanner;

public class ArrayWithOperation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int sizeArray1;
        System.out.println("Enter size of Array: ");
        sizeArray1 = sc.nextInt();



        int array1[] = new int[sizeArray1];
        for(int i = 0; i < sizeArray1; i++){
            array1[i] = 100 - rd.nextInt(201);
        }
        System.out.print("Array1 = [" + array1[0]);
        for(int j = 1; j < sizeArray1; j++){
            System.out.print(", " + array1[j]);
        }
        System.out.print("]");

        int x = 0;
        double averagex = 0;
        int max = 0;
        for(int n = 0; n < sizeArray1; n++){
            if((array1[n] % 2 != 0) && (n % 2 == 0)){
                averagex += array1[n];
                x++;
            }
        }
        System.out.println("\nAverage of OddNumber in EnvenPosition: " + averagex/x);

        int minumum = array1[0];
        int maximum = array1[0];
        int arrayMinimum[] = new int[sizeArray1];
        int arrayMaximum[] = new int[sizeArray1];
        int countMin = 0, countMax = 0;
        for(int a = 0; a < sizeArray1; a++){
            if(array1[a] > maximum){
                maximum = array1[a];
            }
        }
        for(int b = 0; b < sizeArray1; b++){
            if(array1[b] == maximum){
                arrayMaximum[countMax] = b;
                countMax++;
            }
        }
        for(int c = 0; c < sizeArray1; c++){
            if(array1[c] < minumum){
                minumum = array1[c];
            }
        }
        for(int d = 0; d < sizeArray1; d++){
            if(array1[d] == minumum){
                arrayMinimum[countMin] = d;
                countMin++;
            }
        }
        System.out.print("Position of all Minimum Number: ");
        for(int outMin = 0; outMin < countMin; outMin++){
            System.out.print(arrayMinimum[outMin] + " ");
        }
        System.out.print("\nPosition of all Maximum Number: ");
        for(int outMax = 0; outMax < countMax; outMax++){
            System.out.print(arrayMaximum[outMax] + " ");
        }

        int squareNumber = 0;
        for(int e  = 0; e < sizeArray1; e++){
            if(Math.sqrt((double) array1[e]) % 1 == 0){
                squareNumber++;
            }
        }
        System.out.println("\nNumber of square number is: " + squareNumber);

        int primeNumber[] = new int[sizeArray1];
        int countPrimeNumber = 0;
        for(int f = 0; f < sizeArray1; f++){
            for(int g = 2; g < array1[f]; g++){
                if(array1[f] % g == 0){
                    break;
                }
                else if((g == array1[f] - 1) && (array1[f] % g != 0)){
                    primeNumber[countPrimeNumber] = array1[f];
                    countPrimeNumber++;
                }
            }
        }
        System.out.print("Array of Prime Number: [" + primeNumber[0]);
        for(int h = 1; h < countPrimeNumber; h++){
            System.out.print(", " + primeNumber[h]);
        }
        System.out.print("]");

        int array2[] = new int[sizeArray1];
        for(int k = 0; k < sizeArray1; k++){
            if(array1[k] < 0){
                array2[k] = 0;
            }
            else if(array1[k] >= 0){
                array2[k] = array1[k];
            }
        }
        System.out.print("\nArray replace negative number with zero: [" + array2[0]);
        for(int array2Out = 1; array2Out < sizeArray1; array2Out++){
            System.out.print(", " + array2[array2Out]);
        }
        System.out.print("]");

        int array3[] = new int[sizeArray1];
        int countPositivenumber = 0;
        for(int n = 0; n < sizeArray1; n++){
            if(array1[n] < 0){
                continue;
            }
            else if(array1[n] >= 0){
                array3[countPositivenumber] = array1[n];
                countPositivenumber++;
            }
        }
        System.out.print("\nArray without negative number: [" + array3[0]);
        for(int array3Out = 1; array3Out < countPositivenumber; array3Out++){
            System.out.print(", " + array3[array3Out]);
        }
        System.out.print("]");

        int st;
        for(int m = 0; m < sizeArray1 - 1; m++){
            for(int l = sizeArray1 - 1; l >= 1; l--){
                if(array1[l] < array1[l - 1]){
                    st = array1[l];
                    array1[l] = array1[l - 1];
                    array1[l - 1] = st;
                }
            }
        }
        System.out.print("\nNew Array with BUBLE-SORT: [" + array1[0]);
        for(int h = 1; h < sizeArray1; h++){
            System.out.print(", " + array1[h]);
        }
        System.out.print("]");
    }
}
