package HomeWork3_3_2020;

public class StringAndArray {
    public static void main(String[] ars){
        int myArray[] = {24, 127, 20, 2, 24, 125};

        System.out.println("BEFORE call increase function " + toString(myArray));
        increase(myArray, 2);
        System.out.println("AFTER call increase function " + toString(myArray));
    }
    public static String toString(int[] myArray){
        String result = "";
        for(int i= 0; i < myArray.length; i++){
            result += result.equals("") ? myArray[i] : ", " + myArray[i];
        }
        return result;
    }
    public static void increase(int[] myArray, int step){
        for(int i = 0; i < myArray.length; i++){
            myArray[i] += step;
        }
    }
}
