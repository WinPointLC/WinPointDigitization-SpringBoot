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
	 <!-- <link rel="stylesheet" href="C:/Users/Admin/Desktop/webdevelopment/webContent/css/LoginForm.css">-->

	  <!--<script>-->
		 <!--<c:import url="/FeeDetailsServlet" />-->
		 <!--<c:set var="unpaidStudentsList" value="${requestScope.unpaidStudentsList}" />-->
		 <!--$('.datetimepicker')-->
		
	 <!-- </script>-->
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
		<!---<div class = "wrapper">
			<div class="sidebar" data-color="purple" data-background-color="white">
				<div class="logo">
					<a href="http://www.winpointlc.com" class="simple-text logo-normal">
						WinPoint
					</a>
				</div>
				<div class = "sidebar-wrapper">
					<ul class="nav">
						<li class="nav-item active">
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
				<!---<nav class="navbar navbar-expand-lg bg-primary">
				<div class="container">
				<!--from employeeenew.html-->
				
				 <!--End employeenew.html-->
					<!---<a class="navbar-brand" href="#"></a>
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
			<!---</ul>
			<div style="align:right">
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
				<!---	<a class="dropdown-item" onclick="LogoutSession();">Log out</a>
				</div>
				<!-- your navbar here -->
				<!---</ul>
			</div>
			
		</div>
  </div>
</nav>--->
		<!-- End Navbar -->
		<!--Batch Launch Page-->
		<br></br>
		<div class="card card-nav-tabs">
				<h3 class="card-header card-header-primary text-center">Batch Launch</h3>
				<br></br>
		<div class="card-body">
				<form>
				<h3 style="background:grey margin-top:0px"></h3>
				<div class="form-row">
						<div class="col">
						<label for="firstname">Batch Name</label>
						<input class="form-control" type="text" placeholder="CRT-Computer Network 2020" readonly>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<label for="lastname">Lecture Duration (minutes)</label>
						<input type="text" class="form-control" placeholder="Last name"/>
						<a href="javascript:;" class="btn btn-primary" style="float:left">Set</a>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<label for="mobnum">Total Number of Lectures</label>
						<input class="form-control" type="text" placeholder="13" readonly>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<label for="email">Faculty</label>
						<input class="form-control" type="text" placeholder="Anjali" readonly>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<div class="form-group">
						 <label class="label-control">Time</label>
						 <input class="form-control" type="text" placeholder="Evening" readonly>
						 </div>
						 </div>
				</div>
				<div class="form-row">
						<div class="col">
						 <label class="label-control">Begin Date</label>
							<div class="form-group">
							<input type="text"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control" required>
								<!--<label class="label-control">Datetime Picker</label>-->
							</div>
						 </div>
				</div>
				<div class="form-row">
						<div class="col">
						 <label class="label-control">End Date</label>
						 <div class="form-group">
						 <input type="text"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control" required>
								<!--<label class="label-control">Datetime Picker</label>-->
						
						 </div>
						 </div>
				</div>
				
				<!--<div id="sliderRegular" class="slider"></div>-->
				</form>
			</div>
		</div>
			
			<div class="card-footer text-muted"><!--style="background:linear-gradient(60deg, #26c6da, #00acc1)-->
			<a href="javascript:;" class="btn btn-primary" style="float:left">Cancel</a>
			<!--<a href="javascript:;" class="btn btn-primary" style="float:right">Launch</a>-->
			<a href="javascript:;" class="btn btn-primary" style="float:right">Launch</a>
			
			</div>
		</div>
		<!--End batch launch Page-->

	</div>
	</div>
	</body>
</html>	