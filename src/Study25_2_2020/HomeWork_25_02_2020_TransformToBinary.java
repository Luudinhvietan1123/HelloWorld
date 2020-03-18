package Study25_2_2020;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class HomeWork_25_02_2020_TransformToBinary {
    public static void main(String[] args) {
        System.out.println("Transform to Binary, Import decimal number: ");
        Scanner sc = new Scanner(System.in);
        int D;
        D = sc.nextInt();
        System.out.print("This is Binary form: ");
        int E[];
        E = new int [100];
        int i = 0;
        while(D > 0){
            E[i] = D % 2;
            D = D / 2;
            i++;
        }
        while(i >= 0){
            System.out.print(E[i]);
            i--;
        }
    }
}