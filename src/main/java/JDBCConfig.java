import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JDBCConfig {

	@Bean(name = "datasource")
	public DataSource giveMyJdbcBean() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:mem:testdb;");
		dataSource.setUsername("sa");
		dataSource.setPassword(" ");
		return dataSource;
	}
}
