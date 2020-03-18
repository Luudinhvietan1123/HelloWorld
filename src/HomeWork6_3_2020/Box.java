package HomeWork6_3_2020;

import java.util.Scanner;

public class Box {
    public static void main(String[] args){
        InforBox box1 = new InforBox();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parameters of the box(Length/Width/Hight): ");
        String line = sc.nextLine();
        String[] items = line.split("/");
        box1 = new InforBox();
        box1.Length = Float.valueOf(items[0]);
        box1.Width = Float.valueOf(items[1]);
        box1.Hight = Float.valueOf(items[2]);
        float areaBox1 = box1.Area();
        float volumeBox1 = box1.Volume();
        System.out.print(box1.toString() + "\nArea of box: " + areaBox1 + "\nVolume of box: " + volumeBox1);
    }
}
