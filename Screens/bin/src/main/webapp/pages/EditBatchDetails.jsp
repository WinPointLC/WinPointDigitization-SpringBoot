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
	  
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />
	
	  <meta charset="utf-8" />
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	  <script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
	</head>
	<body>
		<!-- edit batch content -->
		<div class="container-fluid" id="main-batch-content">
			<div class="card card-plain">
				<div class="card-header card-header-primary">
				  <h3 class="card-title mt-0" style="text-align:center">Edit Batch Details</h3>
				</div>
			</div>
			<div class="card card-plain">
				<div class="card-header" style="background-color:#000080;width:500px;margin-left:30%">
				  <h4 class="card-title mt-0" style="text-align:center; color:white" >MODULAR-C-2020-1</h4>
				</div>
			</div>
			
			<div class="row" style="margin-top:-20px;">
			<div class="col-md-4">
			  <div class="card" style="height:350px;">
				  
				  <div class="card-body">
					    <div class="form-group" style="width:250px; margin-left:12%">
						  <label class="bmd-label-floating">Start Date</label>
						  <input type="text"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control" required>
						</div><br>
						
						<div class="form-group" style="width:250px; margin-left:12%">
						  <label class="bmd-label-floating">End Date</label>
						  <input type="text"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control" required>
						</div><br>
						
						<div class="form-group" style="width:250px; margin-left:12%">
						  <label class="bmd-label-floating">Lecture Duration</label>
						  <input type="number" class="form-control" required><br><br>
						</div>
						
						<button type="submit" class="btn btn-primary" style="margin-left:11%">Add Student</button>
						<button type="submit" class="btn btn-primary" style="margin-left:6%">Save</button>
					   
				  </div>
			  </div>
			</div>
			
			<div class="col-md-8">
			  <div class="card">
				  <div class="card-body"><br>
					    <div class="stats" style="margin-left:40%">
						  <div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonLecture" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							  Select Lecture
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="lecture-dropdown">

							</div>
						  </div>
						</div><br>
						
						<div class="row">
							<div class="column">
								<div class="form-group" style="width:200px; margin-left:72px">
								  <label class="bmd-label-floating">Lecture Date</label>
								  <input type="text"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control"  id="lecDate" required>
								</div><br>
							</div>
							<div class="column">
								<div class="form-group" style="width:200px; margin-left:50px;">
								  <label class="bmd-label-floating">Start Time</label>
								  <input type="text"  onfocus="this.type='time'" onblur="if(this.value==='')this.type='text'" class="form-control" id="startTime" required>
								</div>
							</div>
							<div class="column">
							    <div class="form-group" style="width:200px; margin-left:50px">
								  <label class="bmd-label-floating">Session Duration</label>
								  <input type="number" class="form-control" id="sessionDuration" required><br><br>
								</div>
							</div>
						</div>		
							<div  style="width:700px; margin-left:55px;">
								<label>Comments</label>
								<textarea class="form-control" rows="3" id="comments" required></textarea>
							</div> <br><br> 
							
							<div  style="width:700px; margin-left:55px;">
								<label>Lecture Coverage:</label>
								<textarea class="form-control" rows="3" id="coverage" required></textarea>
								<p></p>
							</div>  
							<br>
							<button type="submit" class="btn btn-primary" style="margin-left:45%">Save</button>
                                
						
				  </div>
			  </div>
			</div>
			</div>
		
		</div>
		<!-- edit batch content end -->
		
	    <!--   Core JS Files   -->
		<script src="../assets/js/core/jquery.min.js"></script>
		<script src="../assets/js/core/popper.min.js"></script>
		<script src="../assets/js/core/bootstrap-material-design.min.js"></script>
		<script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
		<!-- Plugin for the momentJs  -->
		<script src="../assets/js/plugins/moment.min.js"></script>
		<!--  Plugin for Sweet Alert -->
		<script src="../assets/js/plugins/sweetalert2.js"></script>
		<!-- Forms Validations Plugin -->
		<script src="../assets/js/plugins/jquery.validate.min.js"></script>
		<!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->
		<script src="../assets/js/plugins/jquery.bootstrap-wizard.js"></script>
		<!--	Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
		<script src="../assets/js/plugins/bootstrap-selectpicker.js"></script>
		<!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
		<script src="../assets/js/plugins/bootstrap-datetimepicker.min.js"></script>
		<!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
		<script src="../assets/js/plugins/jquery.dataTables.min.js"></script>
		<!--	Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
		<script src="../assets/js/plugins/bootstrap-tagsinput.js"></script>
		<!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
		<script src="../assets/js/plugins/jasny-bootstrap.min.js"></script>
		<!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->
		<script src="../assets/js/plugins/fullcalendar.min.js"></script>
		<!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->
		<script src="../assets/js/plugins/jquery-jvectormap.js"></script>
		<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
		<script src="../assets/js/plugins/nouislider.min.js"></script>
		<!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
		<!-- Library for adding dinamically elements -->
		<script src="../assets/js/plugins/arrive.min.js"></script>
		<!--  Google Maps Plugin    -->
		<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
		<!-- Chartist JS -->
		<script src="../assets/js/plugins/chartist.min.js"></script>
		<!--  Notifications Plugin    -->
		<script src="../assets/js/plugins/bootstrap-notify.js"></script>
		<!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
		<script src="../assets/js/material-dashboard.js?v=2.1.1" type="text/javascript"></script>
		<!-- Material Dashboard DEMO methods, don't include it in your project! -->
		<script src="../assets/demo/demo.js"></script>
		
		<script>

		    <c:forEach items="${lectureDetailsList}" var="lecture">
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = '${lecture.lectureId}';
				anchor.textContent='${lecture.lectureName}'.toUpperCase().replace("_"," ");
				anchor.setAttribute('onclick', "getLectureId(this.id)");
				document.getElementById('lecture-dropdown').appendChild(anchor);
			</c:forEach>  

			var lectureElem;
			var lectureId;
			function getLectureId(lecture_id){
				alert("in get lecture");
				lectureId = lecture_id;
				
				lectureElem = document.getElementById(lectureId);
				
				document.getElementById('dropdownMenuButtonLecture').textContent = lectureElem.textContent;
				
							
			    var myData = {
			    		lectureId: lectureId
				};
				
				$.ajax({
					type: 'POST',
					url: "/LectureDetails",
					data: jQuery.param(myData),
					dataType: 'json',
					contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function (jsonObj) {
						lectureDetailsList=jsonObj;
						
						document.getElementById("lecDate").setAttribute('value',lectureDetailsList.lectureDate);
						document.getElementById("startTime").setAttribute('value',lectureDetailsList.startTime);
						document.getElementById("sessionDuration").setAttribute('value',lectureDetailsList.duration);
						document.getElementById("comments").textContent=lectureDetailsList.comments;
						document.getElementById("coverage").textContent=lectureDetailsList.lectureCoverage;
						
						
					},
					error: function(){
						alert("Error");
						//document.getElementById("error").innerHTML = "Invalid email or password";
					}

				});
			}
			
			
			
			/* var today = new Date();
			var dd = String(today.getDate()).padStart(2, '0');
			var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
			var yyyy = today.getFullYear();

			today = dd + '-' + mm + '-' + yyyy;
			alert(today); */
		</script>
	</body>
</html>	