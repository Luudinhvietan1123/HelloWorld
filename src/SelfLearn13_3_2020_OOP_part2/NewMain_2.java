package SelfLearn13_3_2020_OOP_part2;

public class NewMain_2 {
    // Khởi tạo phân số
    //In phân số
    //Nhập phân số
    //In phân sô
    public static void main(String[] args) {
       /* Fraction fractionA = new Fraction(3, 6);
        System.out.println(fractionA.print());
        Fraction fractionB = new Fraction(1, 9);
       *//* System.out.println(fractionA.UCLN(3, 9));
    }*//*
       *//* if (fractionB.checkNomalize() == true) {
            System.out.println(fractionB.print() + " ở dạng tối giản");
        } else {
            System.out.println(fractionB.print() + " không ở dạng tối giản");
        }
        fractionA.nomalize();
        System.out.println(fractionA.print());*//*
*/
        Fraction fractionA = new Fraction(3, 6);
        Fraction fractionB = new Fraction(2,10);
        Fraction fractionC = new Fraction(fractionA, fractionB, "+");
        System.out.println( fractionA.print() + "+" +  fractionB.print() + "=" + fractionC.print());
    }
}
