package HomeWork10_3_2020_part2_MyProject;

public class Book  extends Document{
    private String author;
    private int totalPages;
    /*@Override {
        private String code;

        public void setCode (String str,int nb){
            this.code = str + nb
        }
    }
*/
    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setTotalPages(int totalPages){
        this.totalPages = totalPages;
    }

    public int getTotalPages(){
        return this.totalPages;
    }

    //Hàm hiển thị thông tin sách
}
