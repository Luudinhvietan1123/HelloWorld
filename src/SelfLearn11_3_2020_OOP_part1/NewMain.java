package SelfLearn11_3_2020_OOP_part1;

 public class NewMain {
    public static void main(String[] args) {
       /* Student student1 = new Student();
        student1.name = "Luu Dinh Viet An";
        student1.birthday = 2000;
        student1.code = "K63_20186300";

        Student student2 = new Student();
        student2.name = "Lee Min Wan";
        student2.birthday = 2000;
        student2.code = "K63_20182726";

        System.out.println("name: " + student1.name);
        System.out.println("birthday: " + student1.birthday);
        System.out.println("code: " + student1.code);
        System.out.println("-------------------------------------");
        System.out.println("name: " + student2.name);
        System.out.println("birthday: " + student2.birthday);
        System.out.println("code: " + student2.code);*/

        // Getter and Setter
        // Student student1 = new Student();
        //student1.setName("Luu Dinh Viet An");
        //student1.setCode("K63_20186300");
        //student1.setBirthday(2000);
        //Setcode with OverloadingMethod
        //student1.setCode();
        //student1.setCode("K63_", 20186300);
        //student1.setCode(20186300);

     /*   System.out.println("Name: " + student1.getName());
        System.out.println("birthday: " + student1.getBirthday());
        System.out.println("Code: " + student1.getCode());*/
        //student1.showInfor();

     /*   System.out.println("-----------------------------");
        Student student2 = new Student();
        student2.setName("Lee Min Wan");
        student2.setBirthday(2000);
        student2.setCode("K63_20182726");*/

      /*  System.out.println("Name: " + student2.getName());
        System.out.println("Code: " + student2.getCode());
        System.out.println("Birthday: " + student2.getBirthday());*/

     /* //toString
      System.out.println(student2.toString());
        int age = student2.getAge();
        System.out.println("Age: " + age);*/
/*
     Student student3 = new Student("Luu Dinh Viet An", "K63_20186300", 2000);
     student3.showInfor();
     Teacher teacher1 = new Teacher("Luu Dinh Viet Anh", "K30_19885300", 1970);
     teacher1.showInfor();*/

        //OVERRIDING
   /* Person psn = new Person();
    psn.showInfor();*/

    /*Student student1 = new Student();
        student1.setName("Luu Dinh Viet An");
        student1.setCode("K63_20186300");
        student1.setBirthday(2000);
        student1.setGPA((float) 3.3);
        student1.showInfor();*/

       /* Student student1 = new Student("Luu Dinh Viet An", "K63_20186300", 2000);
        student1.setGPA((float) 3.3);
        student1.showInfor();*/

        /* private chỉ truy cập trong class;
    null(rỗng) chỉ truy cập trong package;
    protected chỉ truy cập trong package và các class con;
    public truy cập ở bất kì đâu
   */
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.showCount();
        obj2.showCount();
        obj3.showCount();
       /* System.out.println(Counter.count);*/

        Counter.showCount();
    }
}
