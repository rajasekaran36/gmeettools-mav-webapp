import io.github.rajasekaranap.gmeettool.dao.StudentDao;
import io.github.rajasekaranap.gmeettool.impl.StudenDaoImpl;
import io.github.rajasekaranap.gmeettool.utils.StudentUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PrimaryListner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("CON INIT");
        StudentDao studentDao = StudentUtils.getStudentDao("src/main/resources/mapping_source/student_mapping_it_20_ite.csv");
        sce.getServletContext().setAttribute("studentdao",studentDao);
    }
}
