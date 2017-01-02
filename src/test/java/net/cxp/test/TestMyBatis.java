package net.cxp.test;

import javax.annotation.Resource;

import net.cxp.pojo.Users;
import net.cxp.service.UsersService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class TestMyBatis {

	private static Logger logger=Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private UsersService usersService;
	
	@Test
	public void testGetUser(){
		Users users=usersService.getUsersById(1007);
		logger.info(JSON.toJSONString(users));
	}
	
	@Test
	public void testUpdateUser(){
		Users user=new Users();
		user.setUserid(1769);
		user.setUname("hhh");
		int count=usersService.updateUsers(user);
		logger.info("updateUser-->"+count);
	}
	
}
