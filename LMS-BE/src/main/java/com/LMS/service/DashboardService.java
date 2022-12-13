//package com.LMS.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.LMS.dto.PriceDTO;
//import com.LMS.model.Price;
//import com.LMS.repository.DashboardRepository;
//import com.LMS.utility.ServiceResponse;
//
//
//@Service
//public class DashboardService {
//	
//	@Autowired
//	private DashboardRepository dashboardRepository;
//
//	public ServiceResponse getClothPrice() {	
//		ServiceResponse response = new ServiceResponse();
//		try {
//		List<Price> clothPrices = dashboardRepository.findAll();
//		List<PriceDTO> priceDto = new ArrayList<>();
//		if (!clothPrices.isEmpty()) {
//			for(Price clothprices :clothPrices) {
//				PriceDTO priceDTO = new PriceDTO();
//				priceDTO.setId(clothprices.getId());
//				priceDTO.setType(clothprices.getType());
//				priceDTO.setPrice(clothprices.getPrice());
//				priceDto.add(priceDTO);
//			}
//			response.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			response.setServiceResponse(priceDto);
//		}else {
//			response.setServiceStatus(ServiceResponse.STATUS_FAIL);
//			response.setServiceResponse("Price  List is empty.");
//		}
//		}catch (Exception e) {
//			e.printStackTrace();
//			response.setServiceStatus(ServiceResponse.SOMETHING_WENT_WRONG);
//			response.setServiceResponse("Something Went Wrong.");
//			response.setServiceError(e.getMessage());
//		}
//		return response;
//	}
//
//}
