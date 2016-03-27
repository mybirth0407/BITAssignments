package assignment1.dao;

import assignment1.db.BookMallDBConnection;
import assignment1.vo.CustomerVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    public List<CustomerVo> getList() {
        List<CustomerVo> list = new ArrayList<CustomerVo>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();

            String sql =
                "select c.no, c.email, c.passwd, c.name " +
                "from customer c";

            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (true) {
                if (rs.next() == false) {
                    break;
                }

                CustomerVo customerVo = new CustomerVo();
                customerVo.setCustomerNo(rs.getInt(1));
                customerVo.setEmail(rs.getString(2));
                customerVo.setPasswd(rs.getString(3));
                customerVo.setName(rs.getString(4));

                list.add(customerVo);
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

    public void insertCustomer(CustomerVo customerVo) {
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();

            String sql =
                "insert into customer " +
                "values (null, ?, ?, ?)";

            psmt = conn.prepareStatement(sql);
            psmt.setString(1, customerVo.getEmail());
            psmt.setString(2, customerVo.getPasswd());
            psmt.setString(3, customerVo.getName());

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
