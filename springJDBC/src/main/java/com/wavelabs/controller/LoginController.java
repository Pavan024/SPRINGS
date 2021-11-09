package com.wavelabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wavelabs.dao.UserDao;
import com.wavelabs.model.User;

@Controller
public class LoginController {
	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView userLogin(@RequestParam("username") String username,
			@RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView();

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		String name = userDao.loginUser(user);

		if (name != null) {

			mv.addObject("msg", "Welcome " + name + ", You have successfully logged in.");
			mv.addObject("user",user);
			mv.setViewName("welcome");

		} else {

			mv.addObject("msg", "Invalid user id or password.");
			mv.setViewName("login");
		}

		return mv;

	}

}
