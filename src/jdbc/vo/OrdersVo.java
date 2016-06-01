package jdbc.vo;

public class OrdersVo {
    private int no;
    private int orderPrice;
    private int customerNo;
    private int count;
    private int bookNo;
    private String address;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrdersVo{" +
            "no=" + no +
            ", orderPrice=" + orderPrice +
            ", customerNo=" + customerNo +
            ", count=" + count +
            ", address='" + address + '\'' +
            '}';
    }
}
