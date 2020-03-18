package Study06_03_2020_OOP;

public class STUDENT {
    String studentName;
    String studentNumber;
    String birthDay;
    String Genderl;
    float GPA;

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentName(){
        return this.studentName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getGenderl() {
        return Genderl;
    }

    public void setGenderl(String genderl) {
        Genderl = genderl;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
// alt ins to string
    @Override
    public String toString() {
        return "STUDENT{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", Genderl='" + Genderl + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
