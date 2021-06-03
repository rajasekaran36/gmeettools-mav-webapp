package io.github.rajasekaranap.gmeettool;

import com.google.gson.Gson;
import io.github.rajasekaranap.gmeettool.dao.StudentDao;
import io.github.rajasekaranap.gmeettool.impl.StudenDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mapping/rest/view")
public class MappingController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao studentDao = (StudentDao) req.getServletContext().getAttribute("studentdao");
        String mapping = new Gson().toJson(studentDao.getAllStudents());
        resp.setContentType("application/json");
        resp.getWriter().write(mapping);
    }
}
