package com.qianrenxi.accountcenter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qianrenxi.accountcenter.model.User;
import com.qianrenxi.accountcenter.repository.UserDao;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
		User user = new User();
		user.setUsername("zhangsa");
		user.setIntroduction("Zhang San is 张三");
		
		userDao.save(user);
		
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
}
