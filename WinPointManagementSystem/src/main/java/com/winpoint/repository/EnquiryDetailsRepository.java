package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.winpoint.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer>{

	
	@Modifying
	@Query("UPDATE ENQUIRY_DETAILS a SET a.firstName = ?1 , a.lastName = ?2, a.emailId = ?3, "
			+ "a.mobileNo = ?4, a.address = ?5, a.birthDate =?6 , a.college = ?7, a.degree=?8, a.branch =?9, a.occupation=?10,"
			+ "a.deginatation =?11 , a.domain =?12 , a.role = ?13, a.experience = ?14, a.createdBy =?15 , a.dateOfEnquiry =?16,"
			+ "a.gender = ?17, a.yearOfGraduation = ?18, a.recommendation = ?19, a.recommendation = ?20, a.eligibility = ?21, "
			+ "a.courseInterestedIn = ?22,a.reference = ?23, a.timeSlotId = ?24, a.courseAlreadyDone = ?25, a.startDate = ?26,"
			+ "a.segmentTypeId= ?27,a.suggestion=?28,a.activeStatus= ?29, a.birthDateString = ?30, a.dateOfEnquiryString = ?31,"
			+ "a.startDateString = ?32")
	void updateEnquiryDetails();
	
	
}
