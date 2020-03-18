package HomeWork10_3_2020;

import java.util.Calendar;

public class Canbo {

    private String name;
    private int birth;
    private String gender;
    private String adress;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getBirth() {
        return this.birth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return this.adress;
    }

    public void showInfor(){
        System.out.println("Name: " + this.name);
        System.out.println("Birth:  " + this.birth);
        System.out.println("Gender: " + this.gender);
        System.out.println("Adress: " + this.adress);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nBirth: " + getBirth() + "\nGender: " + getGender();
    }

}
