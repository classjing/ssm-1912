package cn.zj.ssm.service;

import java.util.List;

import cn.zj.ssm.pojo.User;

public interface UserService {
	//DML ：增删改

		int insert(User user);
		
		int updateByPrimaryKey(User user);
		
		int deleteByPrimaryKey(Integer id);
		
		
		
		//DQL : 查询
		
		User selectByPrimaryKey(Integer id);
		
		
		List<User> selectList();
		
}
