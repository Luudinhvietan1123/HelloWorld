package Study_28_02_2020;

public class Study_28_2_2020Narrowing {
    public static void main(String[] args){
        double d = 100.123;
        long l = (long) d;
        int m = (int) d;
        System.out.println("Kieu long: " + l);
        System.out.println("Kieu int: " + m);
    }
}
