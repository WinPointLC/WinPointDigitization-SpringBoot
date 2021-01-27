package com.winpoint.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.UserProfile;

@Repository
public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer>{

	
	@Transactional
	@Modifying
//	@Query("UPDATE ENQUIRY_DETAILS a SET a.first_Name = ?2 , a.last_Name = ?3, a.email_Id = ?4, "
//			+ "a.mobile_No = ?5, a.address = ?6, a.birth_Date =?7 , a.college = ?8, a.degree=?9, a.branch =?10, a.occupation=?11,"
//			+ "a.designation =?12 , a.domain =?13 , a.role = ?14, a.experience = ?15, a.created_By =?16 , a.date_Of_Enquiry =?17,"
//			+ "a.gender = ?18, a.year_Of_Graduation = ?19, a.recommendation = ?20, a.eligibility = ?21, "
//			+ "a.reference = ?22, a.start_Date = ?23,"
//			+ "a.suggestion=?24,a.active_Status= ?25, a.birth_Date_String = ?26, a.date_Of_Enquiry_String = ?27,"
//			+ "a.start_Date_String = ?28 WHERE a.enquiry_Id = ?1")
	@Query(value = "UPDATE ENQUIRY_DETAILS SET first_Name = ?2 , last_Name = ?3, email_Id = ?4, \n"
			+ "			mobile_No = ?5, address = ?6, birth_Date =?7 , college = ?8, degree=?9, branch =?10, occupation=?11,\n"
			+ "			designation =?12 , domain =?13 , role =?14 , experience = ?15, created_By =?16 , date_Of_Enquiry =?17,\n"
			+ "			gender = ?18, year_Of_Graduation = ?19, recommendation =?20 , eligibility =?21, \n"
			+ "			reference =?22 , start_Date =?23,\n"
			+ "			suggestion=?24, active_Status=?25, birth_Date_String =?26, date_Of_Enquiry_String =?27,\n"
			+ "			start_Date_String =?28 WHERE enquiry_Id = ?1\n"
			+ "",
			nativeQuery = true)
	void updateEnquiryDetails(Integer enquiryId, String firstName, String lastName, String emailId, String mobileNo,
			String address, Date birthDate, String college, String degree, String branch,  String occupation,
			String designation, String domain, String role, Integer experience, Integer createdBy, Date dateOfEnquiry,
			String gender, Integer yearOfGraduation, String recommendation, String eligibility,
			String reference, Date startDate,
			String suggestion, boolean b, String birthDateString, String dateOfEnquiryString, String startDateString);
	
	
	
	List<EnquiryDetails> findByEmailId(String emailId);

	
	
}
