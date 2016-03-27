package practice4.prob3;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;

    Book(int bookNo, String title, String author) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.stateCode = 1;
    }

    public void rent() {
        if (stateCode == 1) {
            stateCode = 0;
            System.out.println(title + "이(가) 대여 됨");
        }
    }

    public void print() {
        String isRent;

        if (stateCode == 1) {
            isRent = "재고 있음";
        }
        else {
            isRent = "재고 없음";
        }
        System.out.println(
            "책 제목: " + title + ", 작가: " + author + ", 대여 유무: " + isRent);
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
