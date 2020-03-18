package HomeWork10_3_2020;

public class Engineer extends Canbo{
    private String field;

    public void setField(String field){
        this.field = field;
    }

    public String getField(){
        return this.field;
    }

    public void showInfor(){
        super.showInfor();
        System.out.println("Field: " + this.field);
    }
}
