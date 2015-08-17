package com.qianrenxi.accountcenter.repository.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.qianrenxi.accountcenter.model.User;
import com.qianrenxi.accountcenter.repository.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public User save(User user) {
		//String sql = "insert user(username, password, introduction) values(:username,:password,:introduction)";
		//SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(user);
		
		String sql = "insert user(username, password, introduction) values(?,?,?)";
		
		jdbcTemplate.update(sql, user.getUsername(),user.getPassword(), user.getIntroduction());
		return null;
	}
}
