package jdbc.vo;

public class BookVo {
    private int no;
    private int price;
    private String title;

    private String categoryName;
    private int categoryNo;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(int categoryNo) {
        this.categoryNo = categoryNo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookVo{" +
            "no=" + no +
            ", price=" + price +
            ", title='" + title + '\'' +
            ", categoryNo=" + categoryNo +
            '}';
    }
}
