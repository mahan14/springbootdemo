package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.demo.model.ProductDefinition;

public class ProductImpl implements ProductRepository {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public void setDatasource(DataSource datasource) {
		this.dataSource = datasource;
		jdbcTemplate.setDataSource(dataSource);
	}

	public java.util.List<ProductDefinition> getProductsAvailable() {
		String query = "select * from ProductDefinition";
		String sqlCreate ="create table ProductDefinition (productCode varchar(255), productname varchar(255), productdescription varchar(255))";
		String insertQuery = "insert into ProductDefinition(productCode, productname, productdescription) values ('P152042','aUTo ensures','Comprehensive insurance for all vehicle')";

		jdbcTemplate.execute(sqlCreate);
		jdbcTemplate.update(insertQuery);
		return jdbcTemplate.query(query, new RowMapper<ProductDefinition>() {

			public ProductDefinition mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				ProductDefinition productDefinition = new ProductDefinition();
				productDefinition.setProductCode(resultSet.getString(1));
				productDefinition.setProductdescription(resultSet.getString(2));
				productDefinition.setProductname(resultSet.getString(3));
				return productDefinition;
			}
		});

	}
}
