package SelfLearn11_3_2020_OOP_part1;

public class Counter {
    public static int count = 0;
    private static String college = "HUST";
    public Counter(){
        count ++;
    }
    public int getCount() {
        return count;
    }
    public static void showCount(){
        System.out.println("Count: " + count);
        System.out.println("Colege: " + college);
    }
}
