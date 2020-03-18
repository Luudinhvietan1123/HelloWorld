package SelfLearn13_3_2020_OOP_part2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fractionA, Fraction fractionB, String operator){
        fractionA.nomalize();
        fractionB.nomalize();
        switch (operator){
            case "+":
                this.add(fractionA, fractionB);
                break;
            case "-":
                this.sub(fractionA, fractionB);
                break;
            case "*":
            case ".":
            case "x":
                this.multiply(fractionA, fractionB);
                break;
            case "/":
            case ":":
                this.divide(fractionA, fractionB);
                break;
        }
    }
    //Tạo phần hiển thị cho phân số
    public String print() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    //Tổng hai phân số (x/y + a/b) = (x*b + a*y)/(b*y)
    private void add(Fraction fractionA, Fraction fractionB){
        /*System.out.println("add");*/
        this.setNumerator(fractionA.getNumerator() * fractionB.getDenominator() + fractionB.getNumerator() * fractionA.getDenominator());
        this.setDenominator(fractionA.getDenominator() * fractionB.getDenominator());
        this.nomalize();
    }

    //Hiệu 2 phân số (x/y - a/b)/(b*y)
    private void sub(Fraction fractionA, Fraction fractionB){
        System.out.println("sub");
    }

    //Tích 2 phân số (x/y * a/b) = (x*a)/(b*y)
    private void multiply(Fraction fractionA, Fraction fractionB){
        System.out.println("multiply");
    }

    //thương 2 phân số (x/y) / (a/b) = (x*b)/(y*a)
    private void divide(Fraction fractionA, Fraction fractionB){
        System.out.println("divide");
    }

    //Tìm ước chung lớn nhất
    private int UCLN(int x, int y){
        int ucln = Math.min(x, y);
        while(ucln >= 1){
            if(x % ucln == 0 && y % ucln == 0){
                return ucln;
            }
            ucln--;
        }
        return ucln;
    }

    public boolean checkNomalize(){
        if(this.UCLN(this.getNumerator(), this.getDenominator()) == 1){
            return true;
        }
        return false;
    }

    //Rút gọn phân số
    public void nomalize(){
        if(this.checkNomalize() == false) {
            int ucln = this.UCLN(this.getNumerator(), this.getDenominator());
            this.numerator = numerator / ucln;
            this.denominator = denominator / ucln;
        }
    }

    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
}
