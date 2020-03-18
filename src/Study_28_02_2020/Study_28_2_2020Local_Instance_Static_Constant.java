package Study_28_02_2020;

public class Study_28_2_2020Local_Instance_Static_Constant {

    static final int CONSTANT = 10;
    static int staticVariable = 19;
    private int instantVariable;
    public static void main(String[] args){
        int localVariable = 12;

        Study_28_2_2020Local_Instance_Static_Constant ref = new Study_28_2_2020Local_Instance_Static_Constant();

        System.out.println(localVariable);
        System.out.println(ref.instantVariable);
        System.out.println(CONSTANT);
        System.out.println(staticVariable);
    }
}