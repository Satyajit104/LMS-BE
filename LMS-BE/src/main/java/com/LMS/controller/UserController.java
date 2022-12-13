//package com.LMS.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.LMS.dto.UserDTO;
//import com.LMS.model.User;
//import com.LMS.repository.UserRepository;
//import com.LMS.service.UserService;
//import com.LMS.utility.ServiceResponse;
//
//@RestController
//@RequestMapping("/api")
//public class UserController {
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private UserService userService;
//	
////		@RequestMapping(value = "/user", method = RequestMethod.GET)
////		public List<User> getAllStudents(){
////			return userRepository.findAll();
////			
////		}
//		
//
//	@RequestMapping(value = "/signUpUser",method = RequestMethod.POST)
//	public ServiceResponse signUpUser(@RequestBody UserDTO userDTO){
//		ServiceResponse response=userService.signUpUser(userDTO);
//		return response;
//	} 
//	
//	@RequestMapping(value = "/loginUser",method = RequestMethod.POST)
//	public ServiceResponse loginUser(@RequestBody UserDTO userDTO){
//		ServiceResponse response=userService.loginUser(userDTO);
//		return response;
//	} 
//	
//	@RequestMapping(value = "/verifyEmail",method = RequestMethod.POST)
//	public ServiceResponse verifyEmail(@RequestBody UserDTO userDTO){
//		ServiceResponse response=userService.verifyEmail(userDTO);
//		return response;
//	}
//	
//	
//	@RequestMapping(value = "/setNewPassword",method = RequestMethod.POST)
//	public ServiceResponse setNewPassword(@RequestBody UserDTO userDTO){
//		ServiceResponse response=userService.setNewPassword(userDTO);
//		return response;
//	}
//}
