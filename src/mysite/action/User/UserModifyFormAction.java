package mysite.action.user;

import mysite.dao.UserDao;
import mysite.db.WebDBConnection;
import mysite.vo.UserVo;
import mysite.web.WebUtil;
import mysite.web.action.Action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserModifyFormAction implements Action {

    @Override
    public void execute(
        HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session == null) {
            WebUtil.redirect(request, response, "/main");
            return;
        }

        UserVo authUser = (UserVo) session.getAttribute("authUser");
        if (authUser == null) {
            WebUtil.redirect(request, response, "/main");
            return;
        }

        UserDao userDao = new UserDao(new WebDBConnection());
        UserVo userVo = userDao.get(authUser.getNo());

        request.setAttribute("userVo", userVo);
        WebUtil.forward(request, response,
            "/WEB-INF/mysite/views/user/modifyform.jsp");
    }
}