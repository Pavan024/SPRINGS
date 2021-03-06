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
public class RegistrationController {
	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView userRegistration(@RequestParam("username") String username,
			@RequestParam("email")String email,@RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView();

		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);

		int counter = userDao.registerUser(user);

		if (counter > 0) {
			mv.addObject("msg", "User registration successful.");
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("registration");

		return mv;

	}
}
