package assignment1.dao;

import assignment1.db.BookMallDBConnection;
import assignment1.vo.CategoryVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    public List<CategoryVo> getList() {
        List<CategoryVo> list = new ArrayList<CategoryVo>();
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();
            String sql =
                "select c.no, c.name " +
                "from category c";
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (true) {
                if (rs.next() == false) {
                    break;
                }
                CategoryVo categoryVo = new CategoryVo();
                categoryVo.setNo(rs.getInt(1));
                categoryVo.setName(rs.getString(2));

                list.add(categoryVo);
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

    public void insertCategory(CategoryVo categoryVo) {
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            conn = (new BookMallDBConnection()).getConnection();
            String sql = "insert into category " +
                "values (null, ?)";

            psmt = conn.prepareStatement(sql);
            psmt.setString(1, categoryVo.getName());
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
