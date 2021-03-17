package abhinav.spring.rest.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

	
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new User(rs.getString("username"),rs.getString("password"));
	}

}
