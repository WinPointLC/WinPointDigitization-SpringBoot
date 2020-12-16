<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />

	  <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />


	

    <link href="../assets/css/bootstrap.css" rel="stylesheet" />

	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	<script src="../assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="../assets/js/bootstrap.js" type="text/javascript"></script>
	
	</head>
	<body>
		
		
		<!--Signup form Page-->
	
		<div class="card card-nav-tabs"><br>
				<h4 class="card-header card-header-primary">Sign Up Form</h4>
				<br>
				  <form:form method="post" action="saveForm" modelAttribute="enquiryDetails">
			<div class="card card-nav-tabs">
					<h4 class="card-header card-header-primary">Personal Details</h4>
				<div class="card-body">
					<div class="form-row">
						<div class="col">
						<!-- <label for="firstname">First Name :</label> -->
						<form:input type="text" class="form-control" path="firstName" placeholder="First name" required="true"/>
						</div>
					</div>
					<div class="form-row">
						<div class="col">
						<!-- <label for="lastname">Last Name :</label> -->
						<form:input type="text" class="form-control" path="lastName" placeholder="Last name" required="true"/>
						</div>
					</div>
					<div class="form-row">
						<div class="col">
						<!-- <label for="mobnum">Mobile Number :</label> -->
						<form:input type="text" class="form-control" path="MobileNo" placeholder="Mobile Number" required="true"/>
						</div>
					</div>
					<div class="form-row">
						<div class="col">
						<!-- <label for="email">Email Id:</label> -->
						<form:input type="email" class="form-control" path="emailId" placeholder="Email Id" required="true"/>
						</div>
					</div>
					<%--  <div class="form-row">
						<div class="col">
						<div class="form-group">
						 <label class="label-control">Date Of Birth</label>
						 <form:input type="date" path="birthDate" class="form-control" required="true"/>
						 </div>
						 </div>
					</div>  --%>
					<div class="form-row">
					<div class="col">
						 <label class="label-control">Gender</label><br> 
						 <div class="form-check form-check-radio">
							<label class="form-check-label">
						 <form:radiobutton class="form-check-input" path="gender" value="Male" checked="true"/> 
						
							Male
								<span class="circle">
								<span class="check"></span>
								</span>
							</label>
						</div>
						<div class="form-check form-check-radio">
							<label class="form-check-label">
							
						 <form:radiobutton class="form-check-input" path="gender" value="Female"/> 
							Female
								<span class="circle">
								<span class="check"></span>
								</span>
							</label>
						</div> 
						
						
						</div>
					</div>
				</div>
			</div>
			<div class="card card-nav-tabs">
					<h4 class="card-header card-header-primary">Educational Details</h4>
				<div class="card-body">
					<div class="form-row">
						<div class="col">
						<!--  <label class="label-control">College</label> -->
						 <form:input type="text" class="form-control inputFileVisible" path="college" required="true" placeholder="Enter College Name"/>
						</div>
					</div>
					<%-- <div class="form-row">
						<div class="col">
						  <label for="degree">Degree</label> 
							<form:select id="degree" class="form-control" path="degree" style="height:32px">
							<option selected>Choose....</option>
							<option>BCA</option>
							<option>MCA</option>
							<option>B.E</option>
							<option>M.E</option>
							<option>MBA</option>
							</form:select>
						 </div>
					</div> --%>
					
					 <div class="form-row">
						<div class="col">
						  <label for="degree">Degree</label> 
							 <form:select class="form-control selectpicker" path = "degree" required="true">
				                     <form:option value = "NONE" label = "Select"/>
				                     <form:options items = "${degreeList}" />
				             </form:select>  
						 </div>
					</div> 
					<div class="form-row">
						<div class="col">
						 <!-- <label class="label-control">Branch</label> -->
						 <form:input type="text" class="form-control inputFileVisible" required="true" path="branch" placeholder="Enter Branch"/>
						 </div>
					</div>
				</div>
			</div>
			<div class="card card-nav-tabs">
					<h4 class="card-header card-header-primary">Professional and Experience Details</h4>
				<div class="card-body">
					<div class="form-row">
						<div class="col">
						<!--  <label class="label-control">Occupation</label> -->
						 <form:input type="text" class="form-control inputFileVisible" path="occupation" placeholder="Enter Occupation"/>
						 </div>
					</div>
					<div class="form-row">
						<div class="col">
						 <!-- <label class="label-control">Designation</label> -->
						 <form:input type="text" class="form-control inputFileVisible" path="designation" placeholder="Enter Designation"/>
						 </div>
					</div>
					<div class="form-row">
						<div class="col">
						<!--  <label class="label-control">Domain</label> -->
						 <form:input type="text" class="form-control inputFileVisible" path="domain" placeholder="Enter Domain"/>
						 </div>
					</div>
					<div class="form-row">
						<div class="col">
						<!--  <label class="label-control">Year of Graduation</label> -->
						 <form:input type="text" class="form-control inputFileVisible" required="true" path="yearOfGraduation" placeholder="Enter year of graduation"/>
						 </div>
					</div>
					<div class="form-row">
						<div class="col">
						<!--  <label class="label-control">Role</label> -->
						 <form:input type="text" class="form-control inputFileVisible" path="role" placeholder="Enter Role"/>
						 </div>
					</div>
					
					<div class="form-row">
						<div class="col">
						
						 <form:input type="text" class="form-control inputFileVisible" path="experience" placeholder="Experience (in months)" required="true"/>
						 </div>
					</div>
					
					
				</div>
			</div>
			
			<div class="card card-nav-tabs">
					<h4 class="card-header card-header-primary">Enquiry Details</h4>
				<div class="card-body">
				
					<div class="form-row">
						<div class="col">
						  <label for="Courses_Interested_in">Courses Interested in</label> 
							 <form:select class="form-control selectpicker" path = "courseInterestedIn" multiple="true" required="true">
				                    <%--  <form:option value = "NONE" label = "Select"/> --%>
				                     <form:options items = "${courseInterestedInList}" />
				             </form:select>  
						 </div>
					</div>
					
					<div class="form-row">
						<div class="col">
							 <label class="label-control">Eligibility</label>
							 <div class="form-check form-check-radio">
								<label class="form-check-label">
							 <form:radiobutton class="form-check-input" path="eligibility" value="Eligible" checked="true"/> 
							
								Eligible
									<span class="circle">
									<span class="check"></span>
									</span>
								</label>
							</div>
						</div>
					</div>
					
					<div class="form-row">
						<div class="col">
						  <label for="Courses_Already_done">Courses Already Done</label> 
							 <form:select class="form-control selectpicker" path = "courseAlreadyDone" multiple="true" >
				                    <%--  <form:option value = "NONE" label = "Select"/> --%>
				                     <form:options items = "${courseAlreadyDone}" />
				             </form:select>  
						 </div>
					</div>
					
				<div class="form-row">
						<div class="col">
						  <label for="avail_time">Available Time</label> 
							 <form:select class="form-control selectpicker" path = "timeSlotsId" required="true">
				                     <form:option value = "NONE" label = "Select"/>
				                     <form:options items = "${availableTimeList}" />
				             </form:select>  
						 </div>
					</div>  
					
					<div class="form-row">
						<div class="col">
						
						 <form:input type="text" class="form-control inputFileVisible" path="reference" placeholder="Reference"/>
						 </div>
					</div>
					
					 <%--  <div class="form-row">
						<div class="col">
						<div class="form-group">
						 <label class="label-control">Date Of Enquiry</label>
						 <form:input type="date" path="dateOfEnquiry" required="true" class="form-control"/>
						 </div>
						 </div>
					</div>   --%>
					
					<div class="form-row">
						<div class="col">
						
						 <form:input type="text" class="form-control inputFileVisible" path="recommendation" placeholder="Recommendation"/>
						 </div>
					</div>
					
					 <%--  <div class="form-row">
						<div class="col">
						<div class="form-group">
						 <label class="label-control">Start Date</label>
						 <form:input type="date" path="startDate" required="true" class="form-control"/>
						 </div>
						 </div>
					</div>   --%>
					
					  <div class="form-row">
						<div class="col">
						  <label for="segment_type">Segment Type</label> 
							 <form:select class="form-control selectpicker" path = "segmentTypeId" required="true">
				                     <!--<form:option value = "NONE" label = "Select"/>-->
				                     <form:options items = "${segmentTypeList}" />
				             </form:select>  
						 </div>
					</div>  
				
					<div class="form-row">
						<div class="col">
						
						 <form:input type="text" class="form-control inputFileVisible" path="suggestion" placeholder="Suggestions"/>
						 </div>
					</div>
					
					<%-- <div class="form-row">
						<div class="col">
							 <label class="label-control">Active Status</label>
							 <div class="form-check form-check-radio">
								<label class="form-check-label">
							 <form:radiobutton class="form-check-input" path="activeStatus" value="Active" checked="true"/> 
							
								Active
									<span class="circle">
									<span class="check"></span>
									</span>
								</label>
							</div>
						</div>
					</div> --%>
					
				</div>
			</div>
			<!--  <input type="button" class="btn btn-primary" style="margin-left:45%" value="Submit" onclick="submitForm()"/> -->
			  <input type="submit" class="btn btn-primary" style="margin-left:45%" value="Submit"/>
			<!--<div id="sliderRegular" class="slider"></div>-->
				</form:form>

			</div>
		
		
	<!--End Signup formPage-->

	
	</body>
</html>	