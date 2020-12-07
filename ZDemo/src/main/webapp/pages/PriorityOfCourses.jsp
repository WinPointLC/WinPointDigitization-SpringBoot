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
		<!--priority of courses content -->
		<div class="container-fluid" id="priority-courses-content">
			<div class="card card-plain">
				<div class="card-header card-header-primary">
				  <h3 class="card-title mt-0" style="margin-left:40%">Priority of Courses</h3>
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

			</div><br>
			
			
			<div class="card-body">
			  <div class="table-responsive" id="priority-courses">
				
			  </div>
			</div>
			
			
		</div>
		
		<!--batch exists modal start-->
		<div class="modal fade" id="mymodal_error" >
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h2 id="modal-title" class="modal-title" tabindex="0" style="color:red">Batch Exists!</h2>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						  <h4>Sorry! New Batch for this criteria cannot be launched.</h4>
					</div>						 
				</div>
			</div>
		</div>
		<!--batch exists modal end-->
									
		<!-- priority of courses content end -->
		
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
			var streamList;
			var streamId;
			var courseTypeId;
			var courseId;
			
			//streamList = eval('(' + '${streamlist}' + ')');
			streamList = '${streamList}';
						
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
					data: JSON.stringify(myData),
					dataType: 'json',
					contentType: 'application/json; charset=utf-8',
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
					url: "/PriorityCourses",
					data: JSON.stringify(myData),
					dataType: 'json',
					contentType: 'application/json; charset=utf-8',
					traditional: true,
					success: function (jsonObj) {

						priorityCourseList=jsonObj;

						var elem = document.getElementById('priority-table');
						if(elem!=null){
							elem.parentNode.removeChild(elem);
						}
						
						var table = document.createElement('table');
						table.className="table table-hover";
						table.id="priority-table";
						var thead = document.createElement('thead');
						
						var th1 = document.createElement('th');
						th1.textContent = "Course Name";
						var th2 = document.createElement('th');
						th2.textContent = "Segment Type";
						var th3 = document.createElement('th');
						th3.textContent = "No of Students";
						var th4 = document.createElement('th');
						th4.textContent = "Begin Date";
						var th5 = document.createElement('th');
						th5.textContent = "Available Time";
						var th6 = document.createElement('th');
						th6.textContent = "Faculty Name";
						var th7 = document.createElement('th');
						th7.textContent = "Total Revenue";
						
						thead.appendChild(th1);
						thead.appendChild(th2);		
						thead.appendChild(th4);
						thead.appendChild(th5);
						thead.appendChild(th6);
						thead.appendChild(th3);
						thead.appendChild(th7);
						table.appendChild(thead);
						
						var tbody = document.createElement('tbody');
						
						for(var i=0;i<priorityCourseList.length;i++){
							
							var tr = document.createElement('tr');
							var td1 = document.createElement('td');
							td1.textContent = priorityCourseList[i].courseName;
							var td2 = document.createElement('td');
							td2.textContent = priorityCourseList[i].segmentType;
							var td3 = document.createElement('td');
							var numStudLink = document.createElement('a');
							numStudLink.id = "numStudents"
							numStudLink.textContent = 0+"/"+priorityCourseList[i].noOfStudents;
							numStudLink.setAttribute('href',"noOfStudents");
							//numStudLink.setAttribute('onclick', "noOfStudPage()");
							td3.appendChild(numStudLink);
							var td4 = document.createElement('td');
							td4.textContent = priorityCourseList[i].startDate;
							
							var td5 = document.createElement('td');
							var dropdown_at = document.createElement('div');
							dropdown_at.className="dropdown";
							var button_at = document.createElement('button');
							button_at.className="btn btn-secondary dropdown-toggle";
							button_at.setAttribute('data-toggle',"dropdown");
							button_at.setAttribute('aria-haspopup', "true");
							button_at.setAttribute('aria-expanded', "false");
							button_at.textContent = 'Time';
							button_at.id = 'availableTimeDropdown';
							var dropdownmenu_at = document.createElement('div');
							dropdownmenu_at.className="dropdown-menu";
							dropdownmenu_at.setAttribute('aria-labelledby',"dropdownMenuButton");	
							//var availableTime=['Morning','Evening','Weekend'];
							for (var k = 0; k < priorityCourseList[i].availableTime.length; k++) {
								var anchor  = document.createElement('a');
								anchor.className="dropdown-item";
								anchor.id = priorityCourseList[i].availableTime[k];
								anchor.textContent = priorityCourseList[i].availableTime[k];
								anchor.setAttribute('totalStudents', priorityCourseList[i].noOfStudents);
								anchor.setAttribute('totalRevenue', priorityCourseList[i].totalRevenue);
								anchor.setAttribute('onclick',"getAvailableTime(this.id,this.getAttribute('totalStudents'),this.getAttribute('totalRevenue'))");
								//anchor.setAttribute('onclick', "getAvailableTime(this.id)");
								dropdownmenu_at.appendChild(anchor);	
							}
							dropdown_at.appendChild(dropdownmenu_at);
							dropdown_at.appendChild(button_at);
							td5.appendChild(dropdown_at);
							
							var td6 = document.createElement('td');
							var dropdown_fac = document.createElement('div');
							dropdown_fac .className="dropdown";
							var button_fac = document.createElement('button');
							button_fac.className="btn btn-secondary dropdown-toggle";
							button_fac.setAttribute('data-toggle',"dropdown");
							button_fac.setAttribute('aria-haspopup', "true");
							button_fac.setAttribute('aria-expanded', "false");
							button_fac.textContent = 'Faculty';
							var dropdownmenu_fac = document.createElement('div');
							dropdownmenu_fac.className="dropdown-menu";
							dropdownmenu_fac.id="dropdown-menu-faculty";
							dropdownmenu_fac.setAttribute('aria-labelledby',"dropdownMenuButton");	
							//var faculty=['Anjali Parkhi','Makarand Parkhi'];
							/* for (var k = 0; k < priorityCourseList[i].faculty.length; k++) {
								var anchor  = document.createElement('a');
								anchor.className="dropdown-item";
								anchor.textContent = priorityCourseList[i].faculty[k];
								dropdownmenu_fac.appendChild(anchor);	
							}
							dropdown_fac .appendChild(dropdownmenu_fac); */
							dropdown_fac .appendChild(button_fac);
							td6.appendChild(dropdown_fac);
							
							var td7 = document.createElement('td');
							td7.id = "revenue";
							td7.textContent = 0+"/"+priorityCourseList[i].totalRevenue;
							
							var td8  = document.createElement('td');
							var launchBtn = document.createElement('btn');
							launchBtn.className="btn btn-primary"
							launchBtn.textContent = "Launch";
							launchBtn.setAttribute('data-toggle',"modal");
							launchBtn.setAttribute('data-target',"#mymodal_error");
							td8.appendChild(launchBtn);

							
							tr.appendChild(td1);
							tr.appendChild(td2);
							
							tr.appendChild(td4);
							tr.appendChild(td5);
							tr.appendChild(td6);
							tr.appendChild(td3);
							tr.appendChild(td7);
							tr.appendChild(td8);
							
							tbody.appendChild(tr);
						}
						table.appendChild(tbody);
						
						document.getElementById('priority-courses').appendChild(table);
						
					},
					error: function(){
						alert("Error");
						//document.getElementById("error").innerHTML = "Invalid email or password";
					}
	
				});
			}


			function getAvailableTime(available_time,totalStudents,totalRevenue){
				availableTime = available_time;
				
				availableTimeElem = document.getElementById(available_time);
				
				document.getElementById('availableTimeDropdown').textContent = availableTimeElem.textContent;
	
				var myData = {
						availableTime: availableTime
				};
				$.ajax({
					type: 'POST',
					//url: servletURL + 'StreamCourseTypeCoursesServlet',
					url: "/AvailableTime",
					data: JSON.stringify(myData),
					dataType: 'json',
					contentType: 'application/json; charset=utf-8',
					traditional: true,
					success: function (jsonObj) {
						timeWiseList=jsonObj;
						for (var i = 0; i < timeWiseList.length; i++) {
							for (var k = 0; k < timeWiseList[i].faculty.length; k++) {
								var anchor  = document.createElement('a');
								anchor.className="dropdown-item";
								anchor.textContent = timeWiseList[i].faculty[k];
								dropdownmenu_fac.appendChild(anchor);	
							}
							
							document.getElementById("dropdown-menu-faculty").appendChild(dropdownmenu_fac);
							document.getElementById("numStudents").textContent = timeWiseList[i].numberOfStudents+"/"+totalStudents;
							document.getElementById("revenue").textContent = timeWiseList[i].revenue+"/"+totalRevenue;
						}
						
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