package SelfLearn11_3_2020_OOP_part1;

public class Teacher extends Person{
    public String name;
    public String code;
    public int birthday;

    public Teacher(String name, String code, int birthday) {
        super(name, code, birthday);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float salary;

}
