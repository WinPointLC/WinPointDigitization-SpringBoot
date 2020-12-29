package com.winpoint.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.winpoint.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer>{

	
	@Modifying
//	@Query("UPDATE ENQUIRY_DETAILS a SET a.first_Name = ?2 , a.last_Name = ?3, a.email_Id = ?4, "
//			+ "a.mobile_No = ?5, a.address = ?6, a.birth_Date =?7 , a.college = ?8, a.degree=?9, a.branch =?10, a.occupation=?11,"
//			+ "a.designation =?12 , a.domain =?13 , a.role = ?14, a.experience = ?15, a.created_By =?16 , a.date_Of_Enquiry =?17,"
//			+ "a.gender = ?18, a.year_Of_Graduation = ?19, a.recommendation = ?20, a.eligibility = ?21, "
//			+ "a.reference = ?22, a.start_Date = ?23,"
//			+ "a.suggestion=?24,a.active_Status= ?25, a.birth_Date_String = ?26, a.date_Of_Enquiry_String = ?27,"
//			+ "a.start_Date_String = ?28 WHERE a.enquiry_Id = ?1")
	@Query(value = "UPDATE ENQUIRY_DETAILS SET first_Name = 'bbb' , last_Name = 'aaa', email_Id = 'aaa',\n"
			+ "			mobile_No = 123, address = 'aaa', birth_Date ='1111-11-11' , college = 'aaaa', degree='aaa', branch ='aaa', occupation='aaa',\n"
			+ "			designation ='aaa' , domain ='aaa' , role ='aaa' , experience = 1, created_By =1 , date_Of_Enquiry ='1111-11-11',\n"
			+ "			gender = 'aaa', year_Of_Graduation = 1, recommendation ='aaa' , eligibility ='aaa', \n"
			+ "			reference ='aaa' , start_Date ='1111-11-11',\n"
			+ "			suggestion='aaa', active_Status=1, birth_Date_String ='aaaa', date_Of_Enquiry_String ='aaaa',\n"
			+ "			start_Date_String ='aaaa' WHERE enquiry_Id = 1\n"
			+ "",
			nativeQuery = true)
	void updateEnquiryDetails(Integer enquiryId, String firstName, String lastName, String emailId, String mobileNo,
			String address, Date birthDate, String college, String degree, String branch,  String occupation,
			String designation, String domain, String role, Integer experience, Integer createdBy, Date dateOfEnquiry,
			String gender, Integer yearOfGraduation, String recommendation, String eligibility,
			String reference, Date startDate,
			String suggestion, Integer activeStatus, String birthDateString, String dateOfEnquiryString, String startDateString);
}
