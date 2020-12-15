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
		<br></br>
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
						 <input type="text" id="dob"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control" required>
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
							<option selected>Choose....</option>
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
			
				<input type="button" class="btn btn-primary" style="align-item:center;margin-left:550px" value="Update"></input>
				</form>

				</div>
		</div>
			
		<!--End update form Page-->

	
	</body>
	
	<!-- <script type="text/javascript">
		alert('${user.firstName}');
	</script> -->
	<script>
			
		document.getElementById("fName").value='${user.firstName}';
		document.getElementById("lName").value='${user.lastName}';
		document.getElementById("mobNo").value='${user.mobileNumber}';
		document.getElementById("email").value='${user.emailId}';
		document.getElementById("college").value='${user.college}';
		document.getElementById("branch").value='${user.branch}';
		document.getElementById("occupation").value='${user.occupation}';
		document.getElementById("designation").value='${user.designation}';
		document.getElementById("domain").value='${user.domain}';
		document.getElementById("yearGrad").value='${user.yearOfGraduation}';
		document.getElementById("role").value='${user.role}';
		document.getElementById('${user.gender}').setAttribute("checked",true);
		document.getElementById("dob").value='${user.birthDate}';
		document.getElementById("degree").value='${user.degree}'; 
		
		
	</script>
</html>	