package jdbc.vo;

public class CustomerVo {
    private int customerNo;
    private String email;
    private String passwd;
    private String name;

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerVo{" +
            "customerNo=" + customerNo +
            ", email='" + email + '\'' +
            ", passwd='" + passwd + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
