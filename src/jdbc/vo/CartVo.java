package jdbc.vo;

public class CartVo {
    private int count;
    private int bookNo;
    private int customerNo;

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CartVo{" +
            "customerNo=" + customerNo +
            ", bookNo=" + bookNo +
            ", count=" + count +
            '}';
    }
}
