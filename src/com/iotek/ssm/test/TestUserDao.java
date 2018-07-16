package com.iotek.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.UserDao;
import com.iotek.ssm.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserDao {
	@Autowired
	private UserDao userDao;
	@Test
	public void testQueryUserById() {
		User user = userDao.queryUserById(1);
		System.out.println(user);
	}
}







