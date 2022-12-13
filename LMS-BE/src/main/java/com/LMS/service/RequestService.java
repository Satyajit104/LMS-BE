//package com.LMS.service;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.LMS.dto.RequestDTO;
//import com.LMS.dto.UserDTO;
//import com.LMS.model.Request;
//import com.LMS.model.User;
//import com.LMS.repository.RequestRepository;
//import com.LMS.utility.ServiceResponse;
//import com.LMS.utility.StringToDateTimeParser;
//
//
//@Service
//public class RequestService {
//
//	
//	@Autowired
//	StringToDateTimeParser stringToDateTimeParser;
//	
//	@Autowired
//	private RequestRepository requestRepository;
//	
//	@Transactional
//	public ServiceResponse addLaundryRequest(RequestDTO requestDTO) {
//		ServiceResponse response = new ServiceResponse();
//		
//		try {
//			Request request = new Request();
//			request.setUserId(requestDTO.getUserId());
//			request.setBottom(requestDTO.getBottom());
//			request.setTop(requestDTO.getTop());
//			request.setWoolen(requestDTO.getWoolen());
//			request.setDescription(requestDTO.getDescription());
//			request.setContactPerson(requestDTO.getContactPerson());
//			request.setAddress(requestDTO.getAddress());
//			request.setDate(stringToDateTimeParser.getDate(requestDTO.getDate(), "yyyy-MM-dd"));
//			request.setStatus(requestDTO.getStatus());
//			Request dbResponse = requestRepository.save(request);
//			if(dbResponse != null) {
//				response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//				response.setServiceResponse("User request stored successfully");
//			}else {
//				response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//				response.setServiceResponse("User request failed");
//			}
//	
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//
//		
//		return response;
//	}
//
//	@Transactional
//	public ServiceResponse getRequestDetails() {
//		ServiceResponse response = new ServiceResponse();
//		try {
//		List<Object[]> list = requestRepository.getRequestDetails();
//		List<RequestDTO> dtoList = new ArrayList<RequestDTO>();
//
//		System.out.println(list);
//		
//		if (dtoList != null) {
//			//dtoList.forEach((object) -> {
//			for(Object[] obj:list){
//				RequestDTO empDTO = new RequestDTO();
//				//System.out.println(object[0].toString());
//				empDTO.setAddress(obj[3] != null ? (obj[3].toString()) : null);
//				empDTO.setName(obj[0] != null ? (obj[0].toString()) : null);
//				empDTO.setDate(obj[2] != null ? (obj[2].toString()) : null);
//				empDTO.setContactPerson(obj[4] != null ? (obj[4].toString()) : null);
//				empDTO.setMobile(obj[1] != null ? ( (Long.parseLong(obj[1].toString()))) : null);
//				empDTO.setTop(obj[5] != null ? Integer.parseInt(obj[5].toString()) : null);
//				empDTO.setBottom(obj[6] != null ? Integer.parseInt(obj[6].toString()) : null);
//				empDTO.setWoolen(obj[7] != null ? Integer.parseInt(obj[7].toString()) : null);
//				empDTO.setId(obj[8] != null ? ( (Long.parseLong(obj[8].toString()))) : null);
//				empDTO.setStatus(obj[9] != null ? (obj[9].toString()) : null);
//				empDTO.setUserId(obj[10] != null ? ( (Long.parseLong(obj[10].toString()))) : null);
//
//				dtoList.add(empDTO);
//
//				System.out.println(empDTO);
//
//			}
//			response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			response.setServiceResponse(dtoList);
//			}else {
//					response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//					response.setServiceResponse("List not found");
//
//				}
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//			
//	
//		return response;
//	
//		}
//
//	public ServiceResponse changeStatusAsAccept(RequestDTO requestDTO) {
//		ServiceResponse response = new ServiceResponse();
//		try {
//		Optional<Request> req = requestRepository.findById(requestDTO.getId());
//		System.out.println(req);
//		if(req.isPresent()) {
//			Request request = req.get();
//			request.setStatus(requestDTO.getStatus());
//			Request dbResponse = requestRepository.save(request);
//		
//		
//		if (dbResponse != null) {
//			response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			response.setServiceResponse("Request Status Update.");
//		} else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("Request Status Updation failed");
//		}
//		}
//		else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("Request not found");
//		}
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//		return response;
//		
//	
//	}
//	
//	public ServiceResponse updateStatusInprocess(RequestDTO requestDTO) {
//		ServiceResponse response = new ServiceResponse();
//		try {
//		Optional<Request> req = requestRepository.findById(requestDTO.getId());
//		System.out.println(req);
//		if(req.isPresent()) {
//			Request request = req.get();
//			request.setStatus(requestDTO.getStatus());
//			Request dbResponse = requestRepository.save(request);
//		
//		
//		if (dbResponse != null) {
//			response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			response.setServiceResponse("Request Status Update.");
//		} else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("Request Status Updation failed");
//		}
//		}
//		else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("Request not found");
//		}
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//		return response;
//		
//	
//	}
//	public ServiceResponse updateStatusFinish(RequestDTO requestDTO) {
//		ServiceResponse response = new ServiceResponse();
//		try {
//		Optional<Request> req = requestRepository.findById(requestDTO.getId());
//		System.out.println(req);
//		if(req.isPresent()) {
//			Request request = req.get();
//			request.setStatus(requestDTO.getStatus());
//			Request dbResponse = requestRepository.save(request);
//		
//		
//		if (dbResponse != null) {
//			response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			response.setServiceResponse("Request Status Update.");
//		} else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("Request Status Updation failed");
//		}
//		}
//		else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("Request not found");
//		}
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("something went wrong");
//		}
//		return response;
//		
//	
//	}
//
////	public ServiceResponse getRequestDetailsByUserId(RequestDTO requestDTO) {
////		ServiceResponse response = new ServiceResponse();
////		List<Object[]> list = requestRepository.getRequestDetailsById();
////
////		return null;
////	}
////	
//
//}
