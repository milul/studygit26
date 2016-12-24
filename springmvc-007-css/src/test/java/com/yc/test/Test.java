package com.yc.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mvc.xml"})

public class Test {

	@Autowired
	private DataSource datasource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@org.junit.Test
	public void testConn() {
		Connection conn = null;
		try {
			conn = datasource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(conn);
	}

	@org.junit.Test
	public void testConn02() throws SQLException {
		Connection conn = null;
		conn = sqlSessionFactory.openSession().getConnection();
		assertNotNull(conn);
	}
}
