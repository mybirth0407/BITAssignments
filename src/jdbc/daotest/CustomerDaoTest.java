package jdbc.daotest;

import jdbc.vo.CustomerVo;
import jdbc.dao.CustomerDao;

import java.util.List;

public class CustomerDaoTest {
    public static void main(String args[]) {
        insert();
//        getList();
    }

    public static void getList() {
        CustomerDao customerDao = new CustomerDao();
        List<CustomerVo> customerList = customerDao.getList();

        for (CustomerVo customerVo: customerList) {
            System.out.println(customerVo);
        }
    }

    public static void insert() {
        CustomerDao customerDao = new CustomerDao();
        CustomerVo customerVo = new CustomerVo();

        customerVo.setName("고객1");
        customerVo.setPasswd("asdf");
        customerVo.setEmail("a@a");
        customerDao.insertCustomer(customerVo);

        customerVo.setName("고객2");
        customerVo.setPasswd("zcxv");
        customerVo.setEmail("b@b");
        customerDao.insertCustomer(customerVo);
    }
}
