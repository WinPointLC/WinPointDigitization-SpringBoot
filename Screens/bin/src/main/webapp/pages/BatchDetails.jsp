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
		<!--batch details content -->
		<div class="container-fluid" id="batch-details">
			<div class="card card-plain">
				<div class="card-header card-header-primary">
				  <h3 class="card-title mt-0" style="margin-left:42%">Batch Details</h3>
				</div><br>
			</div>
			
			<div class="row">
				<div class="col-md-3">
                <div class="stats">
                  <div class="dropdown" id="stream-dropdown-div">
				  
                    <button style ="margin-left:0px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonStream" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Select Stream
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-stream-dropdown">

                    </div>
                  </div>
                </div>
              </div>

              <div class="col-md-3">
                <div class="stats">
                  <div class="dropdown" id="coursetype-dropdown-div">
                    <button style ="margin-left:0px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonCourseType" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Select Course Type
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-coursetype-dropdown">

                    </div>
                  </div>
                </div>
              </div>

              <div class="col-md-3">
                <div class="stats">
                 <div class="dropdown" id="course-dropdown-div">
                    <button style ="margin-left:0px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonCourse" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Select Course
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-course-dropdown">

                    </div>
                  </div>
                </div>
              </div>
			</div><br>
			
			<div class="card">
				<div class="card-body">
				  <div class="table-responsive" id="table-batch-details">
					
				  </div>
			    </div>
			</div>
			
		</div>
		<!-- batch details content end -->
		
	

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
		
		<script type="text/javascript">
			var streamList;
			var streamId;
			var courseTypeId;
			var courseId;
			var batchId;
			
			//streamList = eval('(' + '${streamlist}' + ')');
			//streamList = '${streamList}';
			
			var SearchString = window.location.search.substring(1);
	
			var arr = SearchString.split('&');
			var data= arr[0].split('=')[1];
			var decodedData = decodeURIComponent(data);
			streamList=JSON.parse(decodedData);
					
			//alert("From AllUser streamList.length = "+streamList.length);
			for (var i = 0; i < streamList.length; i++) {
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = streamList[i].streamId;
				//alert(streamList[i]);
				anchor.textContent = streamList[i].streamName.toUpperCase().replace("_"," ");
				//anchor.textContent = streamList[i];
				//alert("From AllUser Stream Name  " + streamList[i].streamName);
				anchor.setAttribute('onclick', "getStreamId(this.id)");
				document.getElementById('select-stream-dropdown').appendChild(anchor);
			}
			
			var streamElem;
			function getStreamId(stream_id){
				streamId = stream_id;
				
				streamElem = document.getElementById(streamId);
				
				document.getElementById('dropdownMenuButtonStream').textContent = streamElem.textContent;
				
				document.getElementById('dropdownMenuButtonCourseType').textContent = 'Select Course Type ';
				document.getElementById('dropdownMenuButtonCourse').textContent = 'Select Course ';
				document.getElementById('dropdownMenuButtonBatch').textContent = 'Select Batch ';
							
			    var myData = {
					streamId: streamId
				};
				
				$.ajax({
					type: 'POST',
					//url: servletURL + 'StreamCourseTypeServlet',
					url: "/StreamCourseType",
					data: jQuery.param(myData),
					dataType: 'json',
					contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function (jsonObj) {
						courseTypeList=jsonObj;
						
						var courseTypeDropDown=document.getElementById('select-coursetype-dropdown');
						while (courseTypeDropDown.hasChildNodes()) {  
							courseTypeDropDown.removeChild(courseTypeDropDown.firstChild);
						}
		
						//alert("courseTypeList.length = "+courseTypeList.length);
						for (var i = 0; i < courseTypeList.length; i++) {
							var anchor2 = document.createElement('a');
							anchor2.className="dropdown-item";
							anchor2.setAttribute('href', "#");
							anchor2.id = courseTypeList[i].courseTypeId + 'CT';
							//alert("courseType Name  " + courseTypeList[i].courseTypeName);
							anchor2.textContent = courseTypeList[i].courseTypeName.toUpperCase().replace("_"," ");
							anchor2.setAttribute('onclick', "getCourseTypeId(this.id)");
							document.getElementById('select-coursetype-dropdown').appendChild(anchor2);
						}
						//document.getElementById('coursetype-dropdown-div').appendChild(dropdownMenu_coursetype);
						  //var elem = document.getElementById('dropdownMenuButtonCourseType');
							//elem.parentNode.removeChild(elem);
					},
					error: function(){
						alert("Error");
						//document.getElementById("error").innerHTML = "Invalid email or password";
					}
	
				});
			}
			
			var courseTypeElem;
			var coursesList;
	
			function getCourseTypeId(courseType_id){
				courseTypeId = courseType_id.substring(0, courseType_id.length-2);
				
				courseTypeElem = document.getElementById(courseType_id);
				
				document.getElementById('dropdownMenuButtonCourseType').textContent = courseTypeElem.textContent;
	
				var myData = {
					streamId: streamId,
					courseTypeId:courseTypeId
				};
				$.ajax({
					type: 'POST',
					//url: servletURL + 'StreamCourseTypeCoursesServlet',
					url: "/StreamCourseTypeCourses",
					data: jQuery.param(myData),
					dataType: 'json',
					contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function (jsonObj) {
						coursesList=jsonObj;
						
						var courseDropDown=document.getElementById('select-course-dropdown');
						while (courseDropDown.hasChildNodes()) {  
							courseDropDown.removeChild(courseDropDown.firstChild);
						}
						
						//alert("coursesList.length = "+coursesList.length);
						for (var i = 0; i < coursesList.length; i++) {
							var anchor4 = document.createElement('a');
							anchor4.className="dropdown-item";
							anchor4.setAttribute('href', "#");
							anchor4.id = coursesList[i].courseId + 'C';
							anchor4.textContent = coursesList[i].courseName.toUpperCase().replace("_"," ");
							//alert("course Name  " + coursesList[i].courseName);
							//anchor4.setAttribute('course_index', i);
							anchor4.setAttribute('onclick', "getCourseId(this.id)");
							document.getElementById('select-course-dropdown').appendChild(anchor4);
						}
						//document.getElementById('course-dropdown-div').appendChild(dropdownMenu_course);
						  /*var elem = document.getElementById('dropdownMenuButtonCourseType');
							elem.parentNode.removeChild(elem);*/
					},
					error: function(){
						alert("Error");
						//document.getElementById("error").innerHTML = "Invalid email or password";
					}
	
				});
			}

			var batchDetailsList;
			function getCourseId(course_id){
				courseId = courseType_id.substring(0, courseType_id.length-1);
				
				courseElem = document.getElementById(course_id);
				
				document.getElementById('dropdownMenuButtonCourse').textContent = courseElem.textContent;
	
				var myData = {
					streamId: streamId,
					courseTypeId: courseTypeId,
					courseId: courseId
				};
				$.ajax({
					type: 'POST',
					//url: servletURL + 'StreamCourseTypeCoursesServlet',
					url: "/StreamCourseTypeCourseBatches",
					data: jQuery.param(myData),
					dataType: 'json',
					contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function (jsonObj) {
						batchDetailsList=jsonObj;

						var elem = document.getElementById('details-batch');
						if(elem!=null){
							elem.parentNode.removeChild(elem);
						}
						
						var table = document.createElement('table');
						table.className="table table-hover";
						table.id="details-batch";
						var thead = document.createElement('thead');
						
						var th1 = document.createElement('th');
						th1.textContent = "Batch Name";
						var th2 = document.createElement('th');
						th2.textContent = "Faculty";
						var th3 = document.createElement('th');
						th3.textContent = "Time";
						var th4 = document.createElement('th');
						th4.textContent = "Begin Date";
						var th5 = document.createElement('th');
						th5.textContent = "End Date";
						var th6 = document.createElement('th');
						th6.textContent = "Add Student";
						
						thead.appendChild(th1);
						thead.appendChild(th2);
						thead.appendChild(th3);
						thead.appendChild(th4);
						thead.appendChild(th5);
						thead.appendChild(th6);
						table.appendChild(thead);
						
						var tbody = document.createElement('tbody');
						
						for(var i=0;i<batchDetailsList.length;i++){
							
							var tr = document.createElement('tr');
							var td1 = document.createElement('td');
							td1.textContent = batchDetailsList[i].batchName;
							var td2 = document.createElement('td');
							td2.textContent = batchDetailsList[i].faculty;
							var td3 = document.createElement('td');
							td3.textContent = batchDetailsList[i].time;
							var td4 = document.createElement('td');
							td4.textContent = batchDetailsList[i].startDate;
							var td5 = document.createElement('td');
							td5.textContent = batchDetailsList[i].endDate;
							
							var td6  = document.createElement('td');
							var addStudentBtn = document.createElement('btn');
							addStudentBtn.className="btn btn-primary"
							addStudentBtn.textContent = "Add";
							td6.appendChild(addStudentBtn);

							
							tr.appendChild(td1);
							tr.appendChild(td2);
							tr.appendChild(td3);
							tr.appendChild(td4);
							tr.appendChild(td5);
							tr.appendChild(td6);
							
							tbody.appendChild(tr);
						}
						table.appendChild(tbody);
						
						document.getElementById('table-batch-details').appendChild(table);
						
					},
					error: function(){
						alert("Error");
						//document.getElementById("error").innerHTML = "Invalid email or password";
					}
	
				});
			}

		</script>
				
	</body>
</html>	