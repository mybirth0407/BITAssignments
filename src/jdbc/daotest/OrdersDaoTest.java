package jdbc.daotest;

import jdbc.dao.OrdersDao;
import jdbc.vo.OrdersVo;

import java.util.List;

public class OrdersDaoTest {
    public static void main(String args[]) {
        insert();
//        getList();
    }

    public static void getList() {
        OrdersDao ordersDao = new OrdersDao();
        List<OrdersVo> list = ordersDao.getList();

        for (OrdersVo ordersVo: list) {
            System.out.println(ordersVo);
        }
    }

    public static void insert() {
        OrdersDao ordersDao = new OrdersDao();
        OrdersVo ordersVo = new OrdersVo();

        ordersVo.setOrderPrice(5000);
        ordersVo.setAddress("배송지1");
        ordersVo.setCustomerNo(1);
        ordersDao.insertOrders(ordersVo);

        ordersVo.setOrderPrice(3000);
        ordersVo.setAddress("배송지2");
        ordersVo.setCustomerNo(2);
        ordersDao.insertOrders(ordersVo);
    }
}
