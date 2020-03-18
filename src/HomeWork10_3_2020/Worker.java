package HomeWork10_3_2020;

public class Worker extends Canbo {
    private int level;

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return this.level;
    }

    public void showInfor(){
        super.showInfor();
        System.out.println("Level: " + this.level);
    }
}
