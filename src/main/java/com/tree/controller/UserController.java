package com.tree.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tree.common.RetCode;
import com.tree.entity.User;
import com.tree.service.UserService.IUserService;

@Controller  
@RequestMapping("/user")
public class UserController extends BaseController {
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
    
    //@ResponseBody
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(User user,Model model) throws Exception {
    	String username=user.getUsername();
    	String password=user.getPassword();
    	System.out.println(username);
    	
    	User item=userService.checkLogin(username, password);
    	if(item!=null) {
    		//putToSession("user",item);
    		logger.info("{} has login.",item.getUsername());
    		//resultMap.put("result", RetCode.SUCCESS);
    		return "home";
    	}else{
    		//resultMap.put("result", RetCode.FAIL);
    		//resultMap.put("errMsg", "用户名密码错误");
    		return null;
    	}
    }
    
    @RequestMapping("/toHome")
    public String toHome(){
        return "home";
    }
    
    @ModelAttribute("user")
    public User getUser() {
    	User user = new User();
    	return user;
    }
}
