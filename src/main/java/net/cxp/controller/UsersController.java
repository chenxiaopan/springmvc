package net.cxp.controller;

import javax.annotation.Resource;

import net.cxp.pojo.Users;
import net.cxp.service.UsersService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UsersController {

	@Resource
	private UsersService usersService;
	
	//请求url名为/user/showUser
	@RequestMapping("/showUser")
	public String showUser(@RequestParam(value="userid",required=false,defaultValue="1007")String userid,Model model){
		
		int userId=Integer.parseInt(userid);
		Users user=usersService.getUsersById(userId);
		model.addAttribute("user",user);
		
		return "showUser";
	}
	
}
