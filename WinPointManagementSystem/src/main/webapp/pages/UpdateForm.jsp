<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">

	<head>
	  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" type="text/css">
	  <title>Employee Dashboard</title>
	  <!-- Required meta tags -->
	  <meta charset="utf-8">
	  <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	  <!--     Fonts and icons     -->
	  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
	  <link rel="stylesheet" href="../assets/css/fontawesome.min.css">
	  <!-- Material Kit CSS -->
	  <link href="../assets/css/material-dashboard.css?v=2.1.1" rel="stylesheet"/>
	  <!-- own CSS -->
	  <link href="../css/employee_new_2.css" rel="stylesheet" />
	  <link href="C:/Users/Admin/Desktop/screendevlopment/WebContent/jsp/position.css" rel="stylesheet" />
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <script src="../assets/js/core/jquery.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />
	
	  <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />


    <link href="../assets/css/bootstrap.css" rel="stylesheet" />

	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	<script src="../assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="../assets/js/bootstrap.js" type="text/javascript"></script>
	
	</head>
	<body>
	
		<!--Update form Page-->
		
		<div class="card card-nav-tabs">
				<h4 class="card-header card-header-primary">Update Form</h4>
				<br></br>
		<div class="card-body">
				<form>
				<div class="row">
						<div class="col">
						<label for="firstname">First Name :</label>
						<input type="text" class="form-control" id="fName"/>
						</div>
				</div>
				<div class="row">
						<div class="col">
						<label for="lastname">Last Name :</label>
						<input type="text" class="form-control" id="lName" />
						</div>
				</div>
				<div class="row">
						<div class="col">
						<label for="mobnum">Mobile Number :</label>
						<input type="text" class="form-control" id="mobNo" />
						</div>
				</div>
				<div class="row">
						<div class="col">
						<label for="email">Email Id:</label>
						<input type="email" class="form-control" id="email" />
						</div>
				</div>
				<div class="row">
						<div class="col">
						<div class="form-group">
						 <label class="label-control">Date Of Birth</label>
						 <input type="text" id="dob"  class="form-control" required>
						 </div>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label class="label-control">Gender</label>
						 <div class="form-check form-check-radio">
							<label class="form-check-label">
						<input class="form-check-input" type="radio" name="exampleRadios" id="Male" value="Male" >
							Male
								<span class="circle">
								<span class="check"></span>
								</span>
							</label>
						</div>
						<div class="form-check form-check-radio">
							<label class="form-check-label">
						<input class="form-check-input" type="radio" name="exampleRadios" id="Female" value="Female">
							Female
								<span class="circle">
								<span class="check"></span>
								</span>
							</label>
						</div>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label class="label-control">College</label>
						 <input type="text" id="college" class="form-control inputFileVisible"/>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label for="degree">Degree</label>
							<select id="degree" class="form-control" style="height:32px">
							<!-- <option selected>Choose....</option> -->
							<option>BCA</option>
							<option>MCA</option>
							<option>B.E</option>
							<option>M.E</option>
							<option>MBA</option>
							</select>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label class="label-control">Branch</label>
						 <input type="text" id="branch" class="form-control inputFileVisible"/>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label class="label-control">Occupation</label>
						 <input type="text" id="occupation" class="form-control inputFileVisible"/>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label class="label-control">Designation</label>
						 <input type="text" id="designation" class="form-control inputFileVisible"/>
						 </div>
				</div>
				<div class="form-row">
						<div class="col">
						 <label class="label-control">Domain</label>
						 <input type="text" id="domain" class="form-control inputFileVisible"/>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label class="label-control">Year of Graduation</label>
						 <input type="text" id="yearGrad" class="form-control inputFileVisible"/>
						 </div>
				</div>
				<div class="row">
						<div class="col">
						 <label class="label-control">Role</label>
						 <input type="text" id="role" class="form-control inputFileVisible"/>
						 </div>
				</div>
				
				<div class="row">
						<div class="col">
						 <label class="label-control">Experience (in months)</label>
						 <input type="text" id="experience" class="form-control inputFileVisible"/>
						 </div>
				</div>
			
			
				<div class="row">
						<div class="col">
						 <label class="label-control">Courses Interested in</label>
						 <input type="text" id="courses_interested" class="form-control inputFileVisible"/>
						 </div>
				</div>
				
			    <div class="row">
						<div class="col">
						 <label class="label-control">Courses Already Done</label>
						 <input type="text" id="courses_done" class="form-control inputFileVisible"/>
						 </div>
				</div>
				
				<div class="row">
						<div class="col">
						 <label class="label-control">Reference</label>
						 <input type="text" id="reference" class="form-control inputFileVisible"/>
						 </div>
				</div>
				
				<div class="row">
						<div class="col">
						 <label class="label-control">Date Of Enquiry</label>
						 <input type="text" id="Date_Of_Enquiry" class="form-control inputFileVisible"/>
						 </div>
				</div>
				
				<div class="row">
						<div class="col">
						 <label class="label-control">Recommendation</label>
						 <input type="text" id="recommendation" class="form-control inputFileVisible"/>
						 </div>
				</div>
				
				<div class="row">
						<div class="col">
						 <label class="label-control">Start Date</label>
						 <input type="text" id="Start_Date" class="form-control inputFileVisible"/>
						 </div>
				</div>
				
				<!-- <div class="row">
						<div class="col">
						 <label class="label-control">Available Time</label>
						 <input type="text" id="avail_time" class="form-control inputFileVisible"/>
						 </div>
				</div> -->
				
				 <div class="row">
						<div class="col">
						 <label class="label-control">Available Time</label>
						  <select name="availableTime" class="form-control selectpicker"  id="avail_time" required>
								<c:forEach items="${availableTimeList}" var="availableTime">
   									 <option name="availableTime">${availableTime.timeSlotsDescription}</option>
								</c:forEach>
						</select>
						 </div>
				</div>
				
				<!-- <div class="row">
						<div class="col">
						 <label class="label-control">Segment Type</label>
						 <input type="text" id="Seg_type" class="form-control inputFileVisible"/>
						 </div>
				</div> -->
				<div class="row">
					<div class="col">
					 <label class="label-control">Segment Type</label>
				<select name="segmentType" class="form-control selectpicker" id="Seg_type"  required>
								<c:forEach items="${segmentTypeList}" var="segmentType">
   									 <option name="segmentType" value="${segmentType.segmentTypeId}">${segmentType.segmentTypeName}</option>
								</c:forEach>
				</select>	
					</div>
				</div>
					
					
				<input type="button" class="btn btn-primary" style="align-item:center;margin-left:400px" onclick="update()" value="Update"></input>
				</form>

				</div>
		</div>
			
		<!--End update form Page-->

	
	</body>
	<script>
		queryString = window.location.search;
		//alert(queryString);
		urlParams = new URLSearchParams(queryString);
		//alert(urlParams.get('enquiryid'));
		enquiryId=urlParams.get('enquiryid');

		

				var myData = {
				 	enquiryId: enquiryId
				};
				
				$.ajax({
					type: 'POST',
					
					url: "/getUpdateFormList",
					
					data: jQuery.param(myData),
					dataType: 'json',
					
					contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function (jsonObj) {

							updateFormDet=jsonObj;
						
							//alert(updateFormDet.mappingTimeSlots);

							document.getElementById("fName").value=updateFormDet.firstName;
							document.getElementById("lName").value=updateFormDet.lastName;
							document.getElementById("mobNo").value=updateFormDet.mobileNo;

							document.getElementById("email").value=updateFormDet.emailId;
							document.getElementById("college").value=updateFormDet.college;
							document.getElementById("branch").value=updateFormDet.branch;

							document.getElementById("occupation").value=updateFormDet.occupation;
							document.getElementById("designation").value=updateFormDet.designation;
							document.getElementById("domain").value=updateFormDet.domain;

							document.getElementById("yearGrad").value=updateFormDet.yearOfGraduation;
							document.getElementById("role").value=updateFormDet.role;
							document.getElementById(updateFormDet.gender).setAttribute("checked",true);
							document.getElementById("dob").value=updateFormDet.birthDateString;
							document.getElementById("degree").value=updateFormDet.degree;
							document.getElementById("experience").value=updateFormDet.experience;
							document.getElementById("courses_interested").value=updateFormDet.courseInterestedIn;
							document.getElementById("courses_done").value=updateFormDet.courseAlreadyDone;
							
							document.getElementById("reference").value=updateFormDet.reference;

							document.getElementById("Date_Of_Enquiry").value=updateFormDet.dateOfEnquiryString;
							document.getElementById("Start_Date").value=updateFormDet.startDateString;
							document.getElementById("recommendation").value=updateFormDet.recommendation;

							<c:forEach items="${availableTimeList}" var="availableTime">
							
								if('${availableTime.timeSlotsId}'==updateFormDet.mappingTimeSlots.timeSlotsId){
										//	alert('${availableTime.timeSlotsDescription}');
									document.getElementById("avail_time").value='${availableTime.timeSlotsDescription}';
									
									}
							</c:forEach>   

							<c:forEach items="${availableTimeList}" var="availableTime">
							
							if('${availableTime.timeSlotsId}'==updateFormDet.mappingTimeSlots.timeSlotsId){
									//	alert('${availableTime.timeSlotsDescription}');
								document.getElementById("avail_time").value='${availableTime.timeSlotsDescription}';
								
								}
						</c:forEach>   
						
							/* <c:forEach items="${segmentTypeList}" var="segmentType">
								if('${segmentType.segmentTypeId}'==updateFormDet.mappingSegmentType.segmentTypeId){
										alert('${segmentType.segmentTypeName}');
										alert(document.getElementById("Seg_type"));
									document.getElementById("Seg_type").value='${segmentType.segmentTypeName}';
									
								}
							</c:forEach>    */  
		
					},
					error: function(){
						alert("Error");
						//document.getElementById("error").innerHTML = "Invalid email or password";
					}

				});

			function update(){

				var timeSlotsId;
				var segmentTypeId;
				var timeSlotsDescription;
				var segmentTypeName;
				<c:forEach items="${availableTimeList}" var="availableTime">
					if(document.getElementById("avail_time").value=='${availableTime.timeSlotsDescription}'){
							//alert('${availableTime.timeSlotsId}');
						timeSlotsId='${availableTime.timeSlotsId}';
						timeSlotsDescription='${availableTime.timeSlotsDescription}';
					}
				</c:forEach>   

				var mappingTimeSlots={
						timeSlotsId:timeSlotsId,
						timeSlotsDescription:timeSlotsDescription
				}

				<c:forEach items="${segmentTypeList}" var="segmentType">
					if(document.getElementById("Seg_type").value=='${segmentType.segmentTypeName}'){
							//alert('${segmentType.segmentTypeId}');
						segmentTypeId='${segmentType.segmentTypeId}';
						segmentTypeName='${segmentType.segmentTypeName}';
					}
			    </c:forEach>   

			    var mappingSegmentType={
			    		segmentTypeId:segmentTypeId,
			    		segmentTypeName:segmentTypeName
				}
				

				var myData={
						enquiryId:enquiryId,
						firstName:document.getElementById("fName").value,
						lastName:document.getElementById("lName").value,
						mobileNo:document.getElementById("mobNo").value,
						emailId:document.getElementById("email").value,
						college:document.getElementById("college").value,
						designation:document.getElementById("designation").value,
						domain:document.getElementById("domain").value,
						yearOfGraduation:document.getElementById("yearGrad").value,
						role:document.getElementById("role").value,
						birthDateString:document.getElementById("dob").value,
						degree:document.getElementById("degree").value,
						experience:document.getElementById("experience").value,
						courseInterestedIn:document.getElementById("courses_interested").value,
						courseAlreadyDone:document.getElementById("courses_done").value,
						reference:document.getElementById("reference").value,
						dateOfEnquiryString:document.getElementById("Date_Of_Enquiry").value,
						startDateString:document.getElementById("Start_Date").value,
						recommendation:document.getElementById("recommendation").value,
						//timeSlotsId:timeSlotsId,
						//segmentTypeId:segmentTypeId
						mappingTimeSlots:mappingTimeSlots,
						mappingSegmentType,mappingSegmentType
						
							
				}
				$.ajax({
					type: 'POST',
					
					url: "/SaveUpdateData",
					data: JSON.stringify(myData),
					//data: jQuery.param(myData),
					//dataType: 'json',
					contentType: 'application/json; charset=utf-8',
					//contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function () {
						
						alert("Success in updating");

					}
				});
			}
			
	</script>
	
</html>	