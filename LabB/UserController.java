package LabB;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.grandcircus.movies.dao.UserDao;
import co.grandcircus.movies.model.User;

//Implement controllers for users 

@Controller
public class UserController {
		
		private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
		
		@Autowired
		private UserDao userDao;
		
		/*
		 * List all users
		 */
		
		@RequestMapping(value = "/users", method = RequestMethod.GET)
		public String listUsers(Model model) {
			List<User> users = new ArrayList<>();
			
			//users = userDao.getAllUsersSortedBy(sortOrder);			
			users = userDao.getAllUsers();
			model.addAttribute("users", users);

			logger.info("/users -> user-list.jsp");
			return "user-list";
		}
		
		/**
		 * Display one user
		 */
		@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
		public String getUser(@PathVariable int id, Model model) {
			model.addAttribute("id", id);
			model.addAttribute("user", userDao.getUser(id));

			logger.info("GET /users/" + id + " -> user.jsp");
			return "movie";
		}
		
		/**
		 * Save one user
		 */
		@RequestMapping(value = "/users/{id}", method = RequestMethod.POST)
		public String addUser(@PathVariable int id, User user, Model model) {
			userDao.updateUser(id, user);
			model.addAttribute("id", id);
			model.addAttribute("user", user);

			logger.info("POST /users/" + id + " -> user.jsp");
			return "user";
		}
		
		/**
		 * Delete one movie
		 */
		@RequestMapping(value = "/users/{id}/delete", method = RequestMethod.POST)
		public String deleteUser(@PathVariable int id, Model model) {
			userDao.deleteUser(id);
			model.asMap().clear();

			logger.info("POST /users/" + id + "/delete -> redirect to /users");
			return "redirect:/users";
		}

		/**
		 * Display one user
		 */
		@RequestMapping(value = "/users/create", method = RequestMethod.GET)
		public String findUser(Model model) {
			model.addAttribute("user", new User());

			logger.info("GET /users/create -> user-create.jsp");
			return "user-create";
		}

		/**
		 * Save new user
		 */
		@RequestMapping(value = "/users/create", method = RequestMethod.POST)
		public String addUser(User user, Model model) {
			userDao.addUser(user);
			model.asMap().clear();

			logger.info("POST /users/create -> redirect to /users");
			return "redirect:/users";
		}

}
