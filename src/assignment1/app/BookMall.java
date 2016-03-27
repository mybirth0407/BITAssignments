package assignment1.app;

import java.util.List;

import assignment1.dao.*;
import assignment1.vo.*;

public class BookMall {
    public static void main(String args[]) {
        /* 1. 고객 등록 */
        CustomerVo customerVo = new CustomerVo();
        CustomerDao customerDao = new CustomerDao();

        customerVo.setEmail("이메일1");
        customerVo.setPasswd("비번1");
        customerVo.setName("고객1");
        customerDao.insertCustomer(customerVo);

        customerVo.setEmail("이메일2");
        customerVo.setPasswd("비번2");
        customerVo.setName("고객2");
        customerDao.insertCustomer(customerVo);

        /* 2. 현재 등록된 고객 리스트 */
        System.out.println("--------고객이다-------");
        List<CustomerVo> customerList = customerDao.getList();
        for (CustomerVo customer: customerList) {
            System.out.println(customer);
        }

        /* 3. 책 카테고리 등록 */
        CategoryDao categoryDao = new CategoryDao();
        CategoryVo categoryVo = new CategoryVo();

        categoryVo.setName("장르1");
        categoryDao.insertCategory(categoryVo);

        categoryVo.setName("장르2");
        categoryDao.insertCategory(categoryVo);

        categoryVo.setName("장르3");
        categoryDao.insertCategory(categoryVo);

        categoryVo.setName("장르4");
        categoryDao.insertCategory(categoryVo);

        /* 4. 현재 책들의 카테고리 리스트 */
        System.out.println("--------책 카테고리다--------");
        List<CategoryVo> categoryList = categoryDao.getList();
        for (CategoryVo category: categoryList) {
            System.out.println(category);
        }

        /* 5. 현재 책들 등록 */
        BookDao bookDao = new BookDao();
        BookVo bookVo = new BookVo();

        bookVo.setTitle("책1");
        bookVo.setPrice(30000);
        bookVo.setCategoryNo(1);
        bookDao.insertBook(bookVo);

        bookVo.setTitle("책2");
        bookVo.setPrice(20000);
        bookVo.setCategoryNo(2);
        bookDao.insertBook(bookVo);

        bookVo.setTitle("책3");
        bookVo.setPrice(25000);
        bookVo.setCategoryNo(3);
        bookDao.insertBook(bookVo);

        bookVo.setTitle("책4");
        bookVo.setPrice(35000);
        bookVo.setCategoryNo(4);
        bookDao.insertBook(bookVo);

        /* 6. 현재 등록된 책 리스트 */
        System.out.println("--------책 리스트다--------");
        List<BookVo> bookList = bookDao.getList();
        for (BookVo book: bookList) {
            System.out.println(book);
        }

        /* 7. 고객의 장바구니 */
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

        /* 8. 현재 고객의 장바구니에 들어있는 책들  */
        System.out.println("--------장바구니다--------");
        List<CartVo> cartList = cartDao.getList();
        for (CartVo cart: cartList) {
            System.out.println(cart);
        }

        /* 9. 주문 등록 */
        OrdersDao ordersDao = new OrdersDao();
        OrdersVo ordersVo = new OrdersVo();

        ordersVo.setCustomerNo(1);
        ordersVo.setOrderPrice(ordersDao.getTotal(1));
        ordersVo.setAddress("배송지1");
        ordersDao.insertOrders(ordersVo);
        ordersDao.insertOrderedBook(1);

        ordersVo.setCustomerNo(2);
        ordersVo.setOrderPrice(ordersDao.getTotal(2));
        ordersVo.setAddress("배송지2");
        ordersDao.insertOrders(ordersVo);
        ordersDao.insertOrderedBook(2);

        /* 10. 주문 리스트 */
        System.out.println("--------주문 리스트다--------");
        List<OrdersVo> ordersList = ordersDao.getList();
        for (OrdersVo orders: ordersList) {
            System.out.println(orders);
        }

        /* 11. 주문된 책 리스트 */
        System.out.println("--------주문된 책 리스트다--------");
        List<OrdersVo> ordersBookList = ordersDao.printOrdersBook();
        for (OrdersVo ordersbook: ordersBookList) {
            System.out.println(
                "주문된 책 리스트 [ bookNo=" + ordersbook.getBookNo() +
                ", ordersNo=" + ordersbook.getNo() +
                ", count=" + ordersbook.getCount() + "]");
        }
    }
}
