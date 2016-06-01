package jdbc.dao;

import jdbc.db.BookMallDBConnection;
import jdbc.vo.CartVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartDao {
    public List<CartVo> getList() {
        List<CartVo> list = new ArrayList<CartVo>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        
        try {
            conn = (new BookMallDBConnection()).getConnection();
            String sql =
                "select ca.customerNo, ca.bookNo, ca.count " +
                "from cart ca, customer cu " +
                "where ca.customerNo = cu.no ";

            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            
            while (true) {
                if (rs.next() == false) {
                    break;
                }
                CartVo cartVo = new CartVo();
                cartVo.setCustomerNo(rs.getInt(1));
                cartVo.setBookNo(rs.getInt(2));
                cartVo.setCount(rs.getInt(3));

                list.add(cartVo);
            }
        }
        catch (Exception e) {
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
            return list;
        }
    }
    
    public void insertCart(CartVo cartVo) {
        Connection conn = null;
        PreparedStatement psmt = null;
        
        try {
            conn = (new BookMallDBConnection()).getConnection();
            String sql =
                "insert into cart " +
                "values (?, ?, ?)";
            
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, cartVo.getCustomerNo());
            psmt.setInt(2, cartVo.getBookNo());
            psmt.setInt(3, cartVo.getCount());

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
