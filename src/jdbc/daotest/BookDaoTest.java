package jdbc.daotest;

import jdbc.dao.BookDao;
import jdbc.vo.BookVo;

import java.util.List;

public class BookDaoTest {
    public static void main(String args[]) {
        insert();
//        getList();
    }

    public static void insert() {
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
    }

    public static void getList() {
        BookDao bookDao = new BookDao();
        List<BookVo> bookList = bookDao.getList();

        for (BookVo book : bookList) {
            System.out.println(book);
        }
    }
}