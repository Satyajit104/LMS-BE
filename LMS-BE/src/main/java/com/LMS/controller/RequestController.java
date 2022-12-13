//package com.LMS.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.LMS.dto.RequestDTO;
//import com.LMS.dto.UserDTO;
//import com.LMS.service.RequestService;
//import com.LMS.utility.ServiceResponse;
//
//@RestController
//@RequestMapping("/api")
//public class RequestController {
//	
//	@Autowired
//	private RequestService requestService;
//	
//	@RequestMapping(value = "/addLaundryRequest",method = RequestMethod.POST)
//	public ServiceResponse addLaundryRequest(@RequestBody RequestDTO requestDTO){
//		ServiceResponse response=requestService.addLaundryRequest(requestDTO);
//		return response;
//	} 
//	
//	 @RequestMapping(value = "/getRequestDetails", method = RequestMethod.GET )
//	    public ServiceResponse getRequestDetails(){
//			ServiceResponse response=requestService.getRequestDetails();
//			return response;
//
//}
//	 
//	 @RequestMapping(value = "/changeStatusAsAccept", method = RequestMethod.POST )
//	    public ServiceResponse changeStatusAsAccept(@RequestBody RequestDTO requestDTO ){
//			ServiceResponse response=requestService.changeStatusAsAccept(requestDTO);
//			return response;
//
//}
//	 @RequestMapping(value = "/updateStatusInprocess", method = RequestMethod.POST )
//	    public ServiceResponse updateStatusInprocess(@RequestBody RequestDTO requestDTO ){
//			ServiceResponse response=requestService.updateStatusInprocess(requestDTO);
//			return response;
//
//}
//	 @RequestMapping(value = "/updateStatusFinish", method = RequestMethod.POST )
//	    public ServiceResponse updateStatusFinish(@RequestBody RequestDTO requestDTO ){
//			ServiceResponse response=requestService.updateStatusFinish(requestDTO);
//			return response;
//
//}
//	 
//	 
////	 @RequestMapping(value = "/getRequestDetailsByUserId", method = RequestMethod.POST )
////	    public ServiceResponse getRequestDetailsByUserId(@RequestBody RequestDTO requestDTO ){
////			ServiceResponse response=requestService.getRequestDetailsByUserId(requestDTO);
////			return response;
//
////}
//}