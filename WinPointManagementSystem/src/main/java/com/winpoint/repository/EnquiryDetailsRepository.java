package com.winpoint.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.winpoint.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer>{

	
//	@Modifying
//	@Query("UPDATE ENQUIRY_DETAILS a SET a.firstName = ?2 , a.lastName = ?3, a.emailId = ?4, "
//			+ "a.mobileNo = ?5, a.address = ?6, a.birthDate =?7 , a.college = ?8, a.degree=?9, a.branch =?10, a.occupation=?11,"
//			+ "a.deginatation =?12 , a.domain =?13 , a.role = ?14, a.experience = ?15, a.createdBy =?16 , a.dateOfEnquiry =?17,"
//			+ "a.gender = ?18, a.yearOfGraduation = ?19, a.recommendation = ?20, a.recommendation = ?21, a.eligibility = ?22, "
//			+ "a.courseInterestedIn = ?23,a.reference = ?24, a.timeSlotId = ?25, a.courseAlreadyDone = ?26, a.startDate = ?27,"
//			+ "a.segmentTypeId= ?28,a.suggestion=?29,a.activeStatus= ?30, a.birthDateString = ?31, a.dateOfEnquiryString = ?32,"
//			+ "a.startDateString = ?33 WHERE A.enquiryId = ?1")
//	void updateEnquiryDetails(Integer enquiryId, String firstName, String lastName, String emailId, String mobileNo,
//			String address, Date birthDate, String college, String degree, String branch,  String occupation,
//			String designation, String domain, String role, Integer experience, Integer createdBy, Date dateOfEnquiry,
//			String gender, Integer yearOfGraduation, String recommendation, String eligibility, String courseInterestedIn,
//			String reference, Integer timeSlotsId, String courseAlreadyDone, Date startDate, Integer segmentTypeId,
//			String suggestion, Integer activeStatus, String birthDateString, String dateOfEnquiryString, String startDateString);
//	
	
}
