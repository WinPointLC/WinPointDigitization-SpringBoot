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
	  <link href="C:/Users/Admin/Desktop/screendevlopment/WebContent/jsp/buttonsize.css" rel="stylesheet"/>
	  <link href="../css/employee_new_2.css" rel="stylesheet" />
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />
	 <!-- <link rel="stylesheet" href="C:/Users/Admin/Desktop/webdevelopment/webContent/css/LoginForm.css">-->

	  <!--<script>
		 <c:import url="/FeeDetailsServlet" />
		 <c:set var="unpaidStudentsList" value="${requestScope.unpaidStudentsList}" />
	  </script>-->
	  <!--Login css-->
	  <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />


	<style>body{padding-top: 60px;}</style>

    <link href="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/css/bootstrap.css" rel="stylesheet" />

	<link href="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/css/login-register.css" rel="stylesheet" />
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	<script src="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/js/bootstrap.js" type="text/javascript"></script>
	<script src="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/js/login-register.js" type="text/javascript"></script>
	<!-- Login css end -->

	 <!-- <SCRIPT src="http://java.com/js/dtjava.js"></SCRIPT>-->
	  <!--<script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>-->

	</head>
	<body>
	<!--<div class = "wrapper">
			<div class="sidebar" data-color="purple" data-background-color="white">
				<div class="logo">
					<a href="http://www.winpointlc.com" class="simple-text logo-normal">
						WinPoint
					</a>
				</div>
				<div class = "sidebar-wrapper">
					<ul class="nav">
						<li class="nav-item active  ">
						  <a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\mainpage.html" id="Employee-link">
							<i class="material-icons">dashboard</i>
							<p> Employee Dashboard</p>
						  </a>
						</li>
						<li class="nav-link active">
						  <a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\loginfrom.html" id="Employee-link">
							<i class="material-icons">person</i>
							<p>User Login</p>
						  </a>
						</li>
						<li class="nav-link active">
						  <a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\enquirydetails.html" id="Employee-link">
						  <i class="material-icons">assignment</i>
							<p>Enquiry Details</p>
						  </a>
						</li>
						<li class="nav-link active">
						  <a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\updateform.html" id="Employee-link">
						  <i class="material-icons">update</i>
							<p>Update Form</p>
						  </a>
						</li>
						<li class="nav-link active">
						  <a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\coursename.html" id="Employee-link">
						  <i class="material-icons">subject</i>
							<p>Course Name</p>
						  </a>
						</li>
						<li class="nav-link active">
						  <a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\batchlaunch.html" id="Employee-link">
						  <i class="material-icons">content_paste</i>
							<p>Batch Launch</p>
						  </a>
						</li>
					</ul>
				</div>
			</div>
		<div class="main-panel">
					<!-- Navbar -->
				<!--<nav class="navbar navbar-expand-lg bg-primary">
				<div class="container">
				<!--from employeeenew.html-->
				
				 <!--End employeenew.html-->
				<!--	<a class="navbar-brand" href="#"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
					<span class="sr-only">Toggle navigation</span>
					<span class="navbar-toggler-icon"></span>
					<span class="navbar-toggler-icon"></span>
					<span class="navbar-toggler-icon"></span>
				</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item active">
					<a class="nav-link" href="#">Home<span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\loginfrom.html">Login form</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="C:\Users\Admin\Desktop\screendevlopment\WebContent\jsp\signupform.html">Registration form</a>
				</li>
			<!--<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Dropdown link
				</a>
			<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
				<a class="dropdown-item" href="#">Action</a>
				<a class="dropdown-item" href="#">Another action</a>
				<a class="dropdown-item" href="#">Something else here</a>
			</div>
			</li>-->
			<!--</ul>
				<!--<div class="collapse navbar-collapse justify-content-end">-->
				<!--<div style="align:right">
				<ul class="navbar-nav" style="float:right">

				<li class="nav-item dropdown">
					<a class="nav-link" href="#pablo" id="navbarDropdownProfile" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<i class="material-icons">person</i>
						<p class="d-lg-none d-md-block">		
						Account
						</p>
					</a>

				<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
					<a class="dropdown-item" href="#" onclick="User_link();">Profile</a>
					<a class="dropdown-item" href="#" onclick="Settings_link();">Settings</a>
					<div class="dropdown-divider"></div>
					<!-- giving ajax call to Logout Link -->
					<!---<a class="dropdown-item" onclick="LogoutSession();">Log out</a>
				</div>--->
				<!-- your navbar here -->
				<!---</ul>
			</div>
				<!--</div>-->
        <!---</div>
		</div>
</nav>--->
		<!-- End Navbar -->
		<!--Lecture View Page-->
			<br></br>
			<div class="card card-nav-tabs">
				<h3 class="card-header card-header-primary text-center">Lecture View</h3>
				<br></br>
				<h4 class="text-left">Current Lectures : 10</h4>
				<br></br>
			
					<table>
						<tr>
							<td style="width:25%"><button type="button" class="btn btn-default">
							Start Date <br> 2nd Oct 2019</button></td>
							<td align="left">
							<div class="progress form-group">
								<div class="progress-bar bg-success" role="progressbar" 
									style="width:25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">
								</div>
							</div>
							</td>
							<td><button type="button" class="btn btn-default" style="float:right">
							End Date <br> 2nd Jan 2020</button></td>
						
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:50%">
							Progress<br> Tracker</button>
							</td>
							<td><h4> <u>&nbspLecture Number : 10 </u></h4></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:50%">Fees Records</button></td>
							<td rowspan="3">
								<label for="exampleFormControlTextarea1">Course Plan</label>
						<textarea class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
						</div>
							</td>
							<td style="float:right"><label for="lecturedate">Lecture Date : 22 Oct 2019</label></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:50%">Attendance<br>Records</button></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:50%">Assignments</button></td>
							<td style="float:right"><label for="lecturedate">Session Duration : 2 hours</label></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:50%">Feedback</button></td>
							<td rowspan="3">
								<label for="exampleFormControlTextarea1">Lecture Coverage</label>
						<textarea class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
							</td>
							<td style="float:right"><label for="lecturedate">Start Time : 5.30pm</label></td>

						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:50%">Evaluation</button></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:50%">Edit Batch<br>Details</button></td>
							<td style="float:right"><label for="lecturedate">Class Strength : 10</label></td>
						</tr>
					</table>
			</div>
		
		<!--End Lecture View Page-->

	</div>
	</div>
	</body>
</html>	