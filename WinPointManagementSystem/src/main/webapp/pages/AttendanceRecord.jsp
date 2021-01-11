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
		<!--Attendance records page -->
	<br></br>
	<div class="card card-nav-tabs">
	<div class="card-header card-header-primary">
			<h4 class="text-center" style="font-size:30px">Attendance Record Screen
				<!--<input type="button" id="btnback" class="text-right" value="Back1" style="float:right;height:50px">-->
			<i class="material-icons" style="float:right;height:100%;
			font-size:40px;position:relative;margin-left:1120px;margin-top:-40px;">help_center</i></h4>
	</div>
	<div class="card-body">
	<h5 style="font-size:18px;margin-top:5px" id="batch_name"></h5>
	<div class="row" style="height:100%">
		<div class="col-md-6">

		<div class="card">
			<div>
				<div class="card-body primary">
				<div class="dropdown" align="left" id="stream-dropdown-div">
					<button class="btn btn-primary dropdown-toggle"style="margin-left:25%;"
					type="button" id="dropdownMenuButtonLecture" data-toggle="dropdown" 
					aria-haspopup="true" aria-expanded="false">
						Select Lecture :
					</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="lecture-dropdown"> 
					
				</div>
				</div>
				
				</div>
			</div>
			<div class="card-body-primary">
				<p style="color:gray;margin-left:1px;" id="lecDate"></p>
			<div class="card-body">
				  <div class="table-responsive" id="table-batch-add-student">
					
				  </div>
			</div>
	
			</div>
		</div>
		</div>
		
		<div class="col-md-6">
		<div class="card">
			<div>
				<div class="card-body primary">
				
				
				</div>
			</div>
			<div class="card-body-primary">
				<div class="table-responsive" id="table-attendance-details">
				
				</div>
			
			</div>
		</div>
		</div>
		<div style="text-align:center;margin-left:600px">
			<input type="button" class="btn btn-primary" value="SAVE" style="width:140px;height:40px;"/>
		</div>
	</div>
	
	</div>
</div>
<!--End attendance record page content -->
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
		document.getElementById('batch_name').textContent='${batchDetailsObject.batchName}';
		 lecNums=[];
			//lecIds=[];
			<c:forEach items="${batchDetailsObject.mappingLecture}" var="lecture">
				lecNums.push('${lecture.lectureNumber}');
				//lecIds.push('${lecture.lectureId}');
			</c:forEach>  
			lecNums.sort();
			for(var i=0;i<lecNums.length;i++)
			{
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = lecNums[i];
				anchor.textContent=lecNums[i];
				anchor.setAttribute('onclick', "getLectureId(this.id)");
				document.getElementById('lecture-dropdown').appendChild(anchor);

			}

			var lectureElem;
			var lectureId;
			function getLectureId(lecture_number){
				
				lectureNumber = lecture_number;
				
				lectureElem = document.getElementById(lectureNumber);
				
				document.getElementById('dropdownMenuButtonLecture').textContent ="Lecture Number :  "+ lectureElem.textContent;

				var elem = document.getElementById('details-batch');
				if(elem!=null){
					elem.parentNode.removeChild(elem);
				}
				
				var table = document.createElement('table');
				table.className="table table-hover";
				table.id="details-batch";
				var thead = document.createElement('thead');
				
				var th1 = document.createElement('th');
				th1.textContent = "Student";
				var th2 = document.createElement('th');
				th2.textContent = "Attendance";
						
				thead.appendChild(th1);
				thead.appendChild(th2);
				
				table.appendChild(thead);
				
				var tbody = document.createElement('tbody');

				<c:forEach items="${batchDetailsObject.mappingLecture}" var="lecture">

					if('${lecture.lectureNumber}'==lectureNumber)
					{
						document.getElementById("lecDate").textContent="Lecture Date : " +'${lecture.lectureDate}';

						<c:forEach items="${allStudentList}" var="student">
							//alert("User"+'${student.userId}');
							var tr = document.createElement('tr');
							var td1 = document.createElement('td');
							td1.textContent = '${student.firstName}'+" "+'${student.lastName}';
							
							var td2 = document.createElement('td');
							var input=document.createElement('input');
							input.className="form-control"
							
							<c:forEach items='${lecture.mappingAbsentUsersList}' var="user">
								//alert("Absent user"+'${user.userId}');
								
								if('${user.userId}'=='${student.userId}')
								{
									input.value = "A";
								}
								else
								{	
									input.value = "P";
								}
								td2.appendChild(input);
								tr.appendChild(td1);
								tr.appendChild(td2);

								tbody.appendChild(tr);
								
							
							</c:forEach>  
						</c:forEach>  
						table.appendChild(tbody);
						
						document.getElementById('table-batch-add-student').appendChild(table);
					}
						
				</c:forEach>  
				
				
			}
		</script>
		
		<script>
			
			var elem = document.getElementById('details-attendance');
			if(elem!=null){
				elem.parentNode.removeChild(elem);
			}
			
			var table = document.createElement('table');
			table.className="table table-hover";
			table.id="details-attendance";
			var thead = document.createElement('thead');
			
			var th1 = document.createElement('th');
			th1.textContent = "Name";
			thead.appendChild(th1);

			var lectures="${batchDetailsObject.currentLectureNumber}";

			for(var i=1;i<=lectures;i++){
				var th = document.createElement('th');
				th.textContent = "Lecture "+ i;
				thead.appendChild(th);

			}
		
			table.appendChild(thead);
			
			var tbody = document.createElement('tbody');
			
			<c:forEach items="${allStudentList}" var="student">
			//alert("User"+'${student.userId}');
				var tr = document.createElement('tr');
				
				var td1 = document.createElement('td');
				td1.textContent = '${student.firstName}'+" "+'${student.lastName}';
				tr.appendChild(td1);
				for(var i=1;i<=lectures;i++){
					var td = document.createElement('th');

					<c:forEach items="${batchDetailsObject.mappingLecture}" var="lecture">

					if('${lecture.lectureNumber}'==i){
					
						<c:forEach items='${lecture.mappingAbsentUsersList}' var="user">
							//alert("Absent user"+'${user.userId}');
							
							 if('${user.userId}'=='${student.userId}')
							{
								 td.textContent= "A";
							}
							else
							{	
								td.textContent = "P";
							} 
							
							tr.appendChild(td);
							tbody.appendChild(tr);	
						</c:forEach>
					}
					</c:forEach>  
					
				}
				
				
		    </c:forEach>  
			table.appendChild(tbody);
			
			document.getElementById('table-attendance-details').appendChild(table);
		</script>

		
		
	</body>
</html>	