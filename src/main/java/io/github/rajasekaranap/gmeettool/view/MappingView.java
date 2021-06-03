package io.github.rajasekaranap.gmeettool.view;

import io.github.rajasekaranap.gmeettool.dao.StudentDao;
import io.github.rajasekaranap.gmeettool.impl.StudenDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mapping")
public class MappingView extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao studentDao = (StudenDaoImpl)req.getServletContext().getAttribute("studentdao");
        resp.setContentType("text/html");
        studentDao
                .getAllStudents()
                .stream().forEach(student->{
                    try {
                        resp.getWriter().println(student+"<br>");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
