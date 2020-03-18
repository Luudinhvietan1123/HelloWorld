package HomeWork10_3_2020_part2_MyProject;

import javax.print.Doc;
import java.util.Scanner;

public class Document {
    //Các thuộc tính của đối tượng Document
    private String nameDocument;
    private String code;
    private String publishingCompany;
    private int issueNumber;



    //Seter và Geter
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setPublishingCompany(String publishingCompany){
        this.publishingCompany = publishingCompany;
    }
    public String getPublishingCompany(){
        return this.publishingCompany;
    }
    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }
    public int getIssueNumber(){
        return this.issueNumber;
    }
    public String getNameDocument() {
        return nameDocument;
    }
    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }



    //Khai báo thư viện và các phương thức quản lí thư viện
    private static int sizeLib = 1000000;
    private static Scanner sc;
    Document[] document = new Document[sizeLib];



    //Hàm lấy tống số Tài liệu còn khả dụng trong thư viện
    public int totalDocumentAvalable(){
        for(int i = 0; i < sizeLib; i++){
            if(document[i] == null){
                return i;
            }
        }
        return sizeLib;
    }



    //Hàm thêm (một hoặc nhiều) tài liệu
    public void addNewDocument(){
        System.out.println("Nhập số lượng tài liệu bạn muốn thêm: ");
        int numberOfNewDocument  = sc.nextInt();

        int availableDocument = totalDocumentAvalable();
        for(int j = availableDocument; j < (availableDocument + numberOfNewDocument - 1); j++){
            System.out.println("Nhập tên tài liệu thứ " + (j - availableDocument + 1) + " muốn thêm: ");
            String nameIn = sc.nextLine();
            document[j].setNameDocument(nameIn);
            System.out.println("Nhập mã số tài thứ " + (j - availableDocument + 1) + " muốn thêm: ");
            String codeIn = sc.nextLine();
            document[j].setCode(codeIn);
            System.out.println("Nhập thông tin nhà xuất bản: ");
            String publishingCompanyIn = sc.nextLine();
            document[j].setPublishingCompany(publishingCompanyIn);
            System.out.println("Nhập số lượng bản phát hành: ");
            int issueNumberIn = sc.nextInt();
            document[j].setIssueNumber(issueNumberIn);
        }
    }



  /*  //Hàm xóa (một hay nhiều) tài liệu theo một thuộc tính bất kì + chỉnh sửa danh sách tài liệu
    public void deleteDocument() {
        System.out.println("Nhập thông tin của tài liệu bạn muốn xóa: ");
        String nameToDelete = sc.nextLine();
        System.out.println("Đây là tất cả những tài liệu bạn muốn xóa: ");
        String[][] inforDocument3 = new String[totalDocumentAvalable()][4];
        for(int i = 0; i < totalDocumentAvalable(); i++){
            inforDocument3[i][0] = document[i].getNameDocument();
            inforDocument3[i][1] = document[i].getCode();
            inforDocument3[i][2] = int.valueOf(document[i].getIssueNumber());
            inforDocument3[i][3] = document[i].getPublishingCompany();
            for(int j = 0; j < 4; j++){
                if(inforDocument3[i][j].equals(nameToDelete)){
                    System.out.print(document[i].toString());
                    break;
                }
            }
        }
        System.out.println("Bạn muốn xóa tất cả các tài liệu trên ?");
        System.out.println("[1] Có" + "\t\t\t" + "[0] Không");
        boolean flag;
        if (flag != false) {
            for (int i2 = 0; i2 < totalDocumentAvalable(); i2++) {
                inforDocument3[i2][0] = document[i2].getNameDocument();
                inforDocument3[i2][1] = document[i2].getCode();
                inforDocument3[i2][2] = int.valueOf(document[i2].getIssueNumber());
                inforDocument3[i2][3] = document[i2].getPublishingCompany();
                for (int j2 = 0; j2 < 4; j2++) {
                    if (inforDocument3[i2][j2].equals(nameToDelete)){
                        document[i2] = document[i2 + 1];
                    }
                }
            }
        }
    }




    //Hàm tìm kiếm một hay nhiều tài liệu theo một thuộc tính bất kì
    public void findDocument(){
        System.out.println("Mời bạn nhập thông tin cần tìm kiếm: ");
        String nameToSearch = sc.nextLine();
        String[][] inforDocument2 = new String[totalDocumentAvalable()][4];
        int countResult = 0;
        for(int i = 0; i < totalDocumentAvalable(); i++){
            inforDocument2[i][0] = document[i].getNameDocument();
            inforDocument2[i][1] = document[i].getCode();
            inforDocument2[i][2] = int.valueOf(document[i].getIssueNumber());
            inforDocument2[i][3] = document[i].getPublishingCompany();
            for(int j = 0; j < 4; j++){
                if(inforDocument2[i][j].equals(nameToSearch)){
                    countResult++;
                    System.out.print("RESUILT " + countResult + ": " + document[i].toString());
                    break;
                }
            }
        }
        if(countResult == 0){
            System.out.println("No result found!!!");
        }
    }




    //Hàm hiển thị danh sách tất cả tài liệu
    public void viewFullListDocument(){
        String inforDocument1[] = new String[4];
        for(int a = 0; a < totalDocumentAvalable(); a++){
            inforDocument1[0] = document[a].getNameDocument();
            inforDocument1[1] = document[a].getCode();
            inforDocument1[2] = int.valueOf(document[a].getIssueNumber());
            inforDocument1[3] = document[a].getPublishingCompany();
            for(int b = 0; b < 4; b++){
                System.out.print(inforDocument1[b] + "\t\t\t");
            }
            System.out.println("\n");
        }
    }



    //Hàm lấy thời gian hiện tại
    public String toStringTimeNow(){
        return java.time.LocalDateTime.now();
    }



    //Hàm hiển thị tài liệu
    private String toString(){
        return nameDocument + "\t\t\t" + code + "\t\t\t" + issueNumber +"\t\t\t" + publishingCompany;
    }



    //Hàm lưu lịch sử của tài liệu
    private int countHistory = 0;
    private String[] history = new String[1000];
    private void historyDocument(){
        history[countHistory] = toStringTimeNow();
        countHistory++;
    }



    //Hàm lựa chọn thuộc tính tài liệu và sắp xếp danh sách tài liệu theo yêu cầu : STT, abc, ngày thêm gần nhất,lịch sử tài liệu.
    public void sortDocumentLibrary(){
        System.out.println("Lựa chọn thuộc tính sắp xếp tài liệu: " +
                "\n[1] Sắp xếp theo tên tài liệu" +
                "\n[2] Sắp xếp theo mã tài liệu" +
                "\n[3] Sắp xếp theo số lượng phát hành" +
                "\n[4] Sắp xếp theo tên công ty phát hành");
        int typeNumber = sc.nextInt();
        while(typeNumber < 1 || typeNumber > 4){
            System.out.println("Lựa chọn không hợp lệ, mời thử lại: ");
            typeNumber = sc.nextInt();
        }
        System.out.println("Danh sách sau khi sắp xếp theo ");
        String[][] inforDocument4 = new String[totalDocumentAvalable()][4];
        for(int i = 0; i < totalDocumentAvalable(); i++){
            inforDocument4[i][0] = document[i].getNameDocument();
            inforDocument4[i][1] = document[i].getCode();
            inforDocument4[i][2] = int.valueOf(document[i].getIssueNumber());
            inforDocument4[i[3]] = document[i].getPublishingCompany();
        }
        switch (typeNumber){
            case 2:{
                System.out.print("mã tài liệu");
                Document keyCode = new Document();
                for(int codeNo = 1; codeNo < totalDocumentAvalable(); codeNo++){
                    keyCode.setCode(int.valueOf(inforDocument4[codeNo][1]));
                    int codeEx = codeNo - 1;
                    while(codeEx >= 0 && (int.valueOf(inforDocument4[codeEx][1])) > int.valueOf(keyCode.getCode())){
                        inforDocument4[codeEx + 1][0] = inforDocument4[codeEx][0];
                        inforDocument4[codeEx + 1][1] = inforDocument4[codeEx][1];
                        inforDocument4[codeEx + 1][2] = inforDocument4[codeEx][2];
                        inforDocument4[codeEx + 1][3] = inforDocument4[codeEx][3];
                        codeEx--;
                    }
                    keyCode.setNameDocument(inforDocument4[codeEx][0]);
                    keyCode.setCode(inforDocument4[codeEx][1]);
                    keyCode.setIssueNumber(int.valueOf(inforDocument4[codeEx][2]));
                    keyCode.setPublishingCompany(inforDocument4[codeEx][3]);
                }
            }
            case 3:{
                System.out.print("tổng số bản phát hành");
                Document keyTotal = new Document();
                for(int keyTotalNo = 1; keyTotalNo < totalDocumentAvalable(); keyTotalNo++){
                    keyTotal.setIssueNumber(int.valueOf(inforDocument4[keyTotalNo][2]));
                    int keyTotalEx = keyTotalNo - 1;
                    while(keyTotalEx >= 0); && int.valueOf(inforDocument4[keyTotalEx][2]) > keyTotal.getIssueNumber()){
                        inforDocument4[keyTotalEx + 1][0] = inforDocument4[keyTotalEx][0];
                        inforDocument4[keyTotalEx + 1][1] = inforDocument4[keyTotalEx][1];
                        inforDocument4[keyTotalEx + 1][2] = inforDocument4[keyTotalEx][2];
                        inforDocument4[keyTotalEx + 1][3] = inforDocument4[keyTotalEx][3];
                        keyTotalEx--;
                    }
                    keyTotal.setNameDocument(inforDocument4[keyTotalEx][0]);
                    keyTotal.setCode(inforDocument4[keyTotalEx][1]);
                    keyTotal.setIssueNumber(int.valueOf(inforDocument4[keyTotalEx][2]));
                    keyTotal.setPublishingCompany(inforDocument4[keyTotalEx][3]);
                }
            }
            case 1:{
                System.out.print("tên tài liệu");
            }
            case 4:{
                System.out.print("tên công ty phát hành");
            }
        }
        viewFullListDocument();
    }*/



    //Hàm hiển thị lịch sử của tài liệu được tìm kiếm = in ra mảng hiển thị hàm lưu tài liệu
    //Hàm quản lí thông tin người mượn
    //Hàm mượn/trả tài liệu (thêm, bớt số bản tài liệu còn trong kho/số bản phát hành)
    //(Hàm tìm kiếm tài liệu theo thuộc tính) + (Hàm xóa tài liệu...) = Hàm xóa tài liệu theo mã (SOLVED!)
    //Hàm tìm kiếm (một hay nhiều) tài liệu theo 1 thuộc tính bất kì hoặc (một hay nhiều) thuộc tính bất kì
    //Hàm xóa (một hay nhiều) tài liệu theo (một hay nhiều) thuộc tính bất kì
}
