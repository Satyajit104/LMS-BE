//package com.LMS.service;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import com.LMS.dto.UserDTO;
//import com.LMS.model.User;
//import com.LMS.repository.UserRepository;
//import com.LMS.utility.ServiceResponse;
//
//
//@Service
//public class UserService {
//	
//	
//	@Value("${valid.attempt}")
//	private Integer failedAttempt;
//	
//	private Integer count = 0;
//	private Integer invalidAccessAttempt=0;
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Transactional
//	public ServiceResponse signUpUser(UserDTO userDTO) {
//		ServiceResponse response = new ServiceResponse();
//		try {
//		User user = new User();
//		user.setName(userDTO.getName());
//		user.setEmail(userDTO.getEmail());
//		user.setMobile(userDTO.getMobile());
//		user.setPassword(userDTO.getPassword());
//		user.setInvalidAccessAttempt(invalidAccessAttempt);
//		User dbResponse = userRepository.save(user);
//		
//		if(dbResponse != null) {
//			response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			response.setServiceResponse("User registered successfully");
//		}else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("User registration failed");
//		}
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//		return response;
//	}
//
//	public ServiceResponse loginUser(UserDTO userDTO) {
//		ServiceResponse response = new ServiceResponse();
//		try {
//			User user = userRepository.findByEmail(userDTO.getEmail());
//			
//			System.err.println(user+ "user after email verification");
//			String dbPassword = user.getPassword();
//			if(user!= null) {
//				if(user.getInvalidAccessAttempt()> failedAttempt) {
//					
//					response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//					response.setServiceResponse("Account Blocked !!");
//				}else if(dbPassword.equalsIgnoreCase(userDTO.getPassword())) {
//					
//					response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//					response.setServiceResponse("login successful");
//					response.setServiceResponse(user);
//					
//				}
//				else {
//					count = user.getInvalidAccessAttempt() + 1;
//					System.out.println("counter :" + count);
//					user.setInvalidAccessAttempt(count);
//					userRepository.save(user);
//					
//					response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//					response.setServiceResponse("Invalid Credentials.");
//				}
//			}
//
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//		return response;
//	}
//
//	public ServiceResponse verifyEmail(UserDTO userDTO) {
//		ServiceResponse response = new ServiceResponse();
//		try {
//			User user = userRepository.findByEmail(userDTO.getEmail());
//			if(user!= null) {
//				response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//				response.setServiceResponse("Email Verified Successfully");
//				
//			}else {
//				response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//				response.setServiceResponse("Invalid Email");
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//
//		return response;
//	}
//
//	public ServiceResponse setNewPassword(UserDTO userDTO) {
//		ServiceResponse response = new ServiceResponse();
//		try {
//			User user = userRepository.findByEmail(userDTO.getEmail());
//			if(user!= null) {
//				user.setPassword(userDTO.getPassword());
//				User dbResponse = userRepository.save(user);
//				System.out.println(dbResponse);
//				response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//				response.setServiceResponse("Password Updated Successfully");					
//
//			}else {
//				response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//				response.setServiceResponse("Password not updated");
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//		
//		return response;
//	
//	
//	}
//
//}
