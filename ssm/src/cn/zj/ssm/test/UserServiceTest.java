package cn.zj.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springdao.xml")
public class UserServiceTest {
	
	@Autowired
	private UserService userService;


	@Test
	public void testSelectList() {
		
		List<User> users = userService.selectList();
		for (User user : users) {
			System.out.println(user);
		}
	}

}
