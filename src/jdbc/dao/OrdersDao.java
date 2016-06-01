package jdbc.dao;

import jdbc.db.BookMallDBConnection;
import jdbc.vo.OrdersVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersDao {
    public void insertOrders(OrdersVo ordersVo) {
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();

            String sql =
                "insert into orders " +
                "values(null, ?, ?, ?)";

            psmt = conn.prepareStatement(sql);

            psmt.setInt(1, ordersVo.getOrderPrice());
            psmt.setString(2, ordersVo.getAddress());
            psmt.setInt(3, ordersVo.getCustomerNo());

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

    public List<OrdersVo> getList() {
        List<OrdersVo> list = new ArrayList<OrdersVo>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();

            String sql =
                "select o.no, o.orderPrice, o.address, o.customerNo " +
                "from orders o";

            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (true) {
                if (rs.next() == false) {
                    break;
                }

                OrdersVo ordersVo = new OrdersVo();
                ordersVo.setNo(rs.getInt(1));
                ordersVo.setOrderPrice(rs.getInt(2));
                ordersVo.setAddress(rs.getString(3));
                ordersVo.setCustomerNo(rs.getInt(4));

                list.add(ordersVo);
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


    public int getTotal(Integer customerNo) {
        int total = 0;
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();
            
            String sql = "select sum(b.price * c.count) " +
                "from cart c, book b " +
                "where b.no = c.bookNo " +
                    "and c.customerNo = ?";
            
            psmt = conn.prepareStatement(sql);
            
            psmt.setLong(1, customerNo);
            rs = psmt.executeQuery();
            
            if (rs.next()) {
                total = rs.getInt(1);
            }
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
        return total;
    }
    
    public void insertOrderedBook(Integer customerNo) {
        Connection conn = null;
        PreparedStatement psmt1 = null;
        PreparedStatement psmt2 = null;
        ResultSet rs = null;

        Integer bookNo = null;
        Integer orderNo = null;
        int count = 0;
        
        try {
            conn = (new BookMallDBConnection()).getConnection();
            
            String sql1 =
                "select o.no, c.bookNo, c.count " +
                "FROM cart c, orders o " +
                "where c.customerNo = ? " +
                    "and o.customerNo = c.customerNo";

            psmt1 = conn.prepareStatement(sql1);
            psmt1.setInt(1, customerNo);
            rs = psmt1.executeQuery();

            while (true) {
                if (rs.next() == false) {
                    break;
                }
                orderNo = rs.getInt(1);
                bookNo = rs.getInt(2);
                count = rs.getInt(3);

                String sql2 =
                    "insert into orderedbook " +
                    "values(?, ?, ?)";

                psmt2 = conn.prepareStatement(sql2);
                psmt2.setInt(1, orderNo);
                psmt2.setInt(2, bookNo);
                psmt2.setInt(3, count);

                psmt2.executeUpdate();
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

                if (psmt1 != null) {
                    psmt1.close();
                }

                if (psmt2 != null) {
                    psmt2.close();
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

    public List<OrdersVo> printOrdersBook(){
        List<OrdersVo> list = new ArrayList<OrdersVo>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();
            
            String sql =
                "select ob.bookNo, ob.orderNo, ob.count " +
                "from orderedbook ob";
            
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                OrdersVo OrdersVo = new OrdersVo();
                
                OrdersVo.setBookNo(rs.getInt(1));
                OrdersVo.setNo(rs.getInt(2));
                OrdersVo.setCount(rs.getInt(3));
                
                list.add(OrdersVo);
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
}
