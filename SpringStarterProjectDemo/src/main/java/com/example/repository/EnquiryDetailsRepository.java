package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepository extends CrudRepository<EnquiryDetails, Integer>{

	public default void addEnquiryDetails(EnquiryDetails enquiryDetails) {
		save(enquiryDetails);
	}

	public @ResponseBody
	default List<EnquiryDetails> displayEnquiryDetails() {
		return (List<EnquiryDetails>) findAll();
	}
	
}
