package Study25_2_2020;

public class HomeWork_25_02_2020_Divisible {
    public static void main(String[] args){
        int i = 1;
        int j = 1;
        int k = 1;
        System.out.print("Divided by 3: ");
        while(i <= 100){
            if(i % 3 == 0) System.out.print(i + ", ");
            i++;
        }
        System.out.print("\nDivided by 5: ");
        while(j <= 100){
            if(j % 5 == 0) System.out.print(j + ", ");
            j++;
        }
        System.out.print("\nDivided by both 3 and 5: ");
        while(k <= 100){
            if(k % 3 == 0 && k % 5 == 0)System.out.print(k + ", ");
            k++;
        }
    }
}
