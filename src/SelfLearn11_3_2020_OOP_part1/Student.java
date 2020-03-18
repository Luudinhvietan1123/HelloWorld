package SelfLearn11_3_2020_OOP_part1;

public class Student extends Person{

    public float GPA;

    public Student(String name, String code, int birthday) {
        super(name, code, birthday);
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public void showInfor() {
        super.showInfor();
        System.out.println("GPA: " + this.GPA);
    }
}


