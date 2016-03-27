package assignment1.daotest;

import assignment1.dao.CartDao;
import assignment1.vo.CartVo;

import java.util.List;

public class CartDaoTest {
    public static void main(String args[]) {
        insert();
//        getList();
    }

    public static void getList() {
        CartDao cartDao = new CartDao();
        List<CartVo> list = cartDao.getList();

        for(CartVo cartVo: list){
            System.out.println(cartVo);
        }
    }

    public static void insert() {
        CartDao cartDao = new CartDao();
        CartVo cartVo = new CartVo();

        cartVo.setCount(1);
        cartVo.setCustomerNo(1);
        cartVo.setBookNo(1);
        cartDao.insertCart(cartVo);

        cartVo.setCount(2);
        cartVo.setCustomerNo(1);
        cartVo.setBookNo(3);
        cartDao.insertCart(cartVo);

        cartVo.setCount(1);
        cartVo.setCustomerNo(2);
        cartVo.setBookNo(2);
        cartDao.insertCart(cartVo);

        cartVo.setCount(3);
        cartVo.setCustomerNo(2);
        cartVo.setBookNo(4);
        cartDao.insertCart(cartVo);
    }
}
