package HomeWork10_3_2020_part2_MyProject;

import java.util.Scanner;

public class ManageDocument {
  /*  private static int sizeLib = 1000000;
    private static Scanner sc;
    Document[] document = new Document[sizeLib];
*//*
    anner sc = new Scanner(System.in);  Sc
*//*

 *//*   //Hàm lấy tống số Tài liệu còn khả dụng trong thư viện
    public int totalDocumentAvalable(){
        for(int i = 0; i < sizeLib; i++){
            if(Document[i] != ""){
                return i;
            }
        }
        return sizeLib;
    }
*//*
    //Hàm thêm tài liệu + chỉnh sửa danh sách tài liệu
    public void addNewDocument(){
        System.out.println("Nhập số lượng tài liệu bạn muốn thêm: ");
        int numberOfNewDocument  = sc.nextInt();

        int availableDocument = totalDocumentAvalable();
        for(int j = availableDocument; j < (availableDocument + numberOfNewDocument - 1); j++){
            System.out.println("Nhập tên tài liệu thứ " + (j - availableDocument + 1) + "muốn thêm: ");
        }
    }*/
    //Hàm xóa tài liệu + chỉnh sửa danh sách tài liệu

    //Hàm in thông tin tài liệu/Sách/Tạp chí/báo

    //Hàm tìm kiếm tài liệu theo thuộc tính

    //Hàm hiển thị danh sách tất cả tài liệu

    //Hàm hiển thị tài liệu theo thuộc tính

    //Hàm sắp xếp tài liệu theo yêu cầu: STT, abc, ngày thêm gần nhất,...

    //(Hàm tìm kiếm tài liệu theo thuộc tính) + (Hàm xóa tài liệu...) = Hàm xóa tài liệu theo mã

    //Hàm mượn/trả tài liệu (thêm, bớt số bản tài liệu còn trong kho/số bản phát hành)

    //Hàm hiển thị lịch sử của tài liệu

    //Hàm quản lí thông tin người mượn
}
