package jdbc.daotest;

import jdbc.vo.CategoryVo;
import jdbc.dao.CategoryDao;

import java.util.List;

public class CategoryDaoTest {
    public static void main(String args[]) {
        insert();
//        getList();
    }

    public static void getList() {
        CategoryDao categoryDao = new CategoryDao();
        List<CategoryVo> list = categoryDao.getList();

        for(CategoryVo categoryVo: list){
            System.out.println(categoryVo);
        }
    }

    public static void insert() {
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
    }
}
