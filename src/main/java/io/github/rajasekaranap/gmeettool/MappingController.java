package io.github.rajasekaranap.gmeettool;

import com.fasterxml.jackson.databind.ObjectMapper;
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
        String mapping = new ObjectMapper().writeValueAsString(studentDao.getAllStudents());
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
        resp.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
        resp.addHeader("Access-Control-Max-Age", "1728000");
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().print(mapping);
    }
}
