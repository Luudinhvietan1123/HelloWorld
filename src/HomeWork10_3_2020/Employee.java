package HomeWork10_3_2020;

public class Employee extends Canbo {
    private String job;

    public void setJob(String job){
        this.job = job;
    }

    public String getJob(){
        return this.job;
    }

    public void showInfor(){
        super.showInfor();
        System.out.println("Job: " + this.job);
    }
}
