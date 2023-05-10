import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.util.CalendarFactory;

import dao.ProductImpl;

import java.util.Calendar;

@Configuration
@ComponentScan({ "com.demo" })
public class AppConfig {

	@Bean(name = "cal")
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}

	@Bean
	public Calendar cal() throws Exception {
		return calFactory().getObject();
	}

	@Bean(name="prod")
	public ProductImpl prodImpl() {
		return new ProductImpl();
	}

	/*
	 * @Bean(name = "speakerService")
	 * 
	 * @Scope(value= BeanDefinition.SCOPE_SINGLETON) public SpeakerService
	 * getSpeakerService() { //SpeakerServiceImpl service = new
	 * SpeakerServiceImpl(getSpeakerRepository()); SpeakerServiceImpl service = new
	 * SpeakerServiceImpl(); //service.setRepository(getSpeakerRepository()); return
	 * service; }
	 * 
	 * 
	 * @Bean(name = "speakerRepository") public SpeakerRepository
	 * getSpeakerRepository() { return new HibernateSpeakerRepositoryImpl(); }
	 */

}
