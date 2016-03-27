package assignment1.dao;

import assignment1.db.BookMallDBConnection;
import assignment1.vo.BookVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public List<BookVo> getList() {
        List<BookVo> list = new ArrayList<BookVo>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();

            String sql =
                "select b.no, b.title, b.price, c.name, b.categoryNo " +
                "from book b, category c " +
                "where b.no = c.no";

            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (true) {
                if (rs.next() == false) {
                    break;
                }
                BookVo bookVo = new BookVo();
                bookVo.setNo(rs.getInt(1));
                bookVo.setTitle(rs.getString(2));
                bookVo.setPrice(rs.getInt(3));
                bookVo.setCategoryName(rs.getString(4));
                bookVo.setCategoryNo(rs.getInt(5));

                list.add(bookVo);
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (psmt != null) {
                    psmt.close();
                }

                if (conn != null) {
                    conn.close();
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void insertBook(BookVo bookVo) {
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();

            String sql =
                "insert into book " +
                "values (null, ?, ?, ?)";

            psmt = conn.prepareStatement(sql);
            psmt.setString(1, bookVo.getTitle());
            psmt.setInt(2, bookVo.getPrice());
            psmt.setInt(3, bookVo.getCategoryNo());

            psmt.executeUpdate();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (psmt != null) {
                    psmt.close();
                }

                if (conn != null) {
                    conn.close();
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
