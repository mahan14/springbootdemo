import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.service.SpeakerService;

import dao.ProductImpl;

public class Application {

	public static void main(String args[]) {
		// loading the spring application context manually using the class like
		// mentioned below
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext appContext2 = new ClassPathXmlApplicationContext("bean-factory-xml-demo.xml");
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(JDBCConfig.class);

		// SpeakerService service = new SpeakerServiceImpl();

		//SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		DataSource ds = appContext2.getBean("datasource",DriverManagerDataSource.class);
		
		ProductImpl service1 = appContext.getBean("prod", ProductImpl.class);
		service1.setDatasource(ds);
		// System.out.println(service);

//		System.out.println(service.findAll().get(0).getFirstName());
//		System.out.println(service.findAll().get(0).getSeedNum());
		System.out.print(service1.getProductsAvailable());

		// SpeakerService service2 = appContext.getBean("speakerService",
		// SpeakerService.class);

		// System.out.println(service2);
	}
}
