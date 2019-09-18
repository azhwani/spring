import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.spring.ioc.EmployeDAO;

public class SpringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings({ "resource", "unused" })
		ApplicationContext app1 = new AnnotationConfigApplicationContext(Springloc.class);
		@SuppressWarnings({ "resource" })
		ApplicationContext app2 = new ClassPathXmlApplicationContext("META-INF/ApplicationContext.xml");
		
		EmployeDAO emp = app2.getBean(EmployeDAO.class);
		System.out.println(emp.printfirstname());

	}

}
