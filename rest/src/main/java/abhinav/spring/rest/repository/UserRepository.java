package abhinav.spring.rest.repository;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository extends JdbcDaoSupport {
	
	
	
	@PostConstruct
	private void initialize(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/exampledb", "root", "password");
		setDataSource(dataSource);
	}
	
	
		
		
	public List<User> getUsers() {
		
		return getJdbcTemplate().query("Select * from users", new UserMapper());
	}

	public User getUser(String username){
		
		
		User user = (User) getJdbcTemplate().queryForObject("Select * from users where username=?", new Object[] {username}, new UserMapper());
		
			
			return user;
			
		}
	
	public void updatePassword(String username, String password){
		
		
		 getJdbcTemplate().update("update users set password=? where username=?", new Object[] {password,username});
		
			
	
			
		}
}
