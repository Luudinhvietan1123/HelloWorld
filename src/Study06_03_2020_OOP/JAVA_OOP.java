package Study06_03_2020_OOP;

import java.util.Scanner;

public class JAVA_OOP {
    public static void main(String[] args){
        STUDENT sinhvienA = new STUDENT();

      /*  sinhvienA.studentName = "Luu Dinh Viet An";
        String studentName = sinhvienA.getStudentName();
        System.out.println(studentName);//lưu đối tượng rồi lấy phần tử đó ra
        */ //Ctrl + Shilt + /
        STUDENT[] studentArray = new STUDENT[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5 ; i++){
            System.out.println("Nhap sinh vien thu " + (i+1));
            String line = sc.nextLine();
            String[] items = line.split(",");

            studentArray[i] = new STUDENT();
            studentArray[i].studentName = items[0];
            studentArray[i].studentNumber = items[1];
            studentArray[i].birthDay = items[2];
            studentArray[i].Genderl = items[3];
            studentArray[i].GPA = Float.valueOf(items[4]);
            System.out.println("thong tin sinh vien thu" + i + "la: " + studentArray[i].toString());
        }
        System.out.println("Moi ban nhap mssv can tim:");
        String mssv = sc.nextLine();
        for(STUDENT st : studentArray){
            if(st.studentNumber.equals(mssv))
            {
                System.out.println(st.toString());
                break;
            }
        }
    }
}
