package cn.zj.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model m) {
		
		List<User> users = userService.selectList();
		m.addAttribute("users",users);
		
		return "userList";
	}
	
	
	@RequestMapping("/update")
	public String update(Integer userId) {
		
		//删除成功以后重定向跳转到列表
		return "redirect:/user/list.do";
	}
	
	
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		
		userService.deleteByPrimaryKey(userId);
		
		//删除成功以后重定向跳转到列表
		return "redirect:/user/list.do";
	}
}
