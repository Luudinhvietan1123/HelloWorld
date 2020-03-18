package SelfLearn3_3_2020_StringAndArray;

public class CreateANewParamid {
    public static void main(){
        for(int i = 1; i <= 15; i += 2){
            for(int k = 0; k < (7 - i/2); k++){
                System.out.println(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.println("$");
            }
        }
    }
}
