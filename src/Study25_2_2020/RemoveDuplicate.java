package Study25_2_2020;

public class RemoveDuplicate {
    public static void main(String[] args){
        int arrayIn[] = {20,20,30,40,50,50,50,50};
        int arrayOut[] = new int[100];
        int j = 0;
        for(int i = 0; i < arrayIn.length; i++){
            if(i == 0){
                arrayIn[i] = arrayOut[i];
                j++;
            }
            else if (arrayIn[i] != arrayIn[i - 1]){
                arrayIn[i] = arrayOut[j];
                j++;
            }
            else continue;
        }
        System.out.println("New length: " + j);
    }
}
