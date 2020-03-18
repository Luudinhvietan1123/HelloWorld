package SelfLearn11_3_2020_OOP_part1;

import java.util.Calendar;
//final public class Person Chống kế thừa
 public class Person {
    public String name;
    public String code;
    public int birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //Chống ghi đè phương thức: OVERRRIDING:
    //final public void showInfor(){
    public void showInfor(){
        System.out.println("Name: " + this.name);
        System.out.println("Code: " + this.code);
        System.out.println("Birthday: " + this.birthday);
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nCode: " + getCode() + "\nBirthday: " + getBirthday();
    }

    public int getAge(){
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
    }

/*
    //OverloadingMethod
    public void setCode(){
        this.code = "K63_20186300";
    }

    public void setCode(String str, int number){
        this.code = str + number;
    }

    public void setCode(int number){
        this.code = "K63_" + number;
    }
*/

    //Constructor
    public Person(String name, String code, int birthday){
        this.name = name;
        this.code = code;
        this.birthday = birthday;
    }
}
