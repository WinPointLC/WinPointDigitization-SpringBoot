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
	  <link href="C:/Users/Admin/Desktop/screendevlopment/WebContent/jsp/buttonsize.css" rel="stylesheet"/>
	  <link href="../css/employee_new_2.css" rel="stylesheet" />
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />
	
	  <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />


	<style>
		#myProgress {
		  width: 100%;
		  background-color: gray;
		}
	
		#myBar {
		  width: 25%;
		  height: 10px;
		  background-color: green;
		}
	</style>

    <link href="../assets/css/bootstrap.css" rel="stylesheet" />

	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	<script src="../assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="../assets/js/bootstrap.js" type="text/javascript"></script>
	</head>
	<body>
	
		<!--Lecture View Page-->
			<div class="card card-plain">
				<div class="card-header card-header-primary">
				  <h3 class="card-title mt-0" style="margin-left:42%">Lecture View</h3>
				</div><br>
			</div>
			 <div class="row">
			
              <div class="col-md-3">
                <div class="stats">
                  <div class="dropdown" id="stream-dropdown-div">
				  
                    <button style ="margin-left:0px; width:100%;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonStream" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                    <button style ="margin-left:0px; width:100%;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonCourseType" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                    <button style ="margin-left:0px; width:100%;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonCourse" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Select Course
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-course-dropdown">

                    </div>
                  </div>
                </div>
              </div>

              <div class="col-md-3">
                <div class="stats">
                  <div class="dropdown" id="batch-dropdown-div">
                    <button style ="margin-left:0px; width:100%;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonBatch" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Select Batch
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-batch-dropdown">

                    </div>
                  </div>
                </div>
               </div>
			   
			
              </div><br>
			<div class="card card-nav-tabs" style="display: none;" id="lec_view_card">
				<!--<h3 class="card-header card-header-primary text-center">Lecture View</h3>-->
				<br></br>
				<!--<h4 class="text-left">Current Lectures : 10</h4>-->
					<div class="table-responsive" id="table-lecture-view" >
				
					</div> 
					<div id="currentlec-label" style="margin-left:5%;" >
					
					</div>
					<table>
						<tr>
							<td><div id="start-date-btn" style="margin-left:10%;">
					
							</div></td>
							
							<td>
							<div id="myProgress" style="width:150%;">
							  <div id="myBar"></div>
							</div>
							
							</td>
							<td><div id="end-date-btn" style="margin-left:-550px;" >
					
							</div></td>
						</tr>
						
						<tr>
							
							<td><button type="button" class="btn btn-secondary"  style="width:60%;margin-left:10%;">
							Progress<br> Tracker</button>
							</td>
							
							<td><div id="lecture-view-controls">
					
							</div></td>		
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Fees Records</button></td>
							<td rowspan="3">
								<label for="exampleFormControlTextarea1">Course Plan</label>
						<textarea class="form-control" id="exampleFormControlTextarea1" style="width:150%" rows="10"></textarea>
						
							</td>
						
						<td><div id="lecture-date-label" style="margin-left:-550px;">
					
							</div></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Attendance<br>Records</button></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Assignments</button></td>
							<td><div id="session-duration-label" style="margin-left:-550px;">
					
							</div></td>
							
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Feedback</button></td>
							<td rowspan="3">
								<label for="exampleFormControlTextarea1">Lecture Coverage</label>
						<textarea class="form-control" id="exampleFormControlTextarea1" style="width:150%" rows="10"></textarea>
							</td>
							<td><div id="start-time-label" style="margin-left:-550px;">
					
							</div></td>
							

						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Evaluation</button></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Edit Batch<br>Details</button></td>
					
							<td><div id="class-strength-label" style="margin-left:-550px;">
					
							</div></td>
						</tr>
					</table>
					<br>
			</div>
		
		<!--End Lecture View Page-->

		<script>
			var streamId;

			<c:forEach items="${streamList}" var="stream">
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = '${stream.streamId}';
				anchor.textContent='${stream.streamName}'.toUpperCase().replace("_"," ");
				anchor.setAttribute('onclick', "getStreamId(this.id)");
				document.getElementById('select-stream-dropdown').appendChild(anchor);
			</c:forEach>  

			var streamElem;
			function getStreamId(stream_id){
				
				streamId = stream_id;
				
				streamElem = document.getElementById(streamId);
				
				document.getElementById('dropdownMenuButtonStream').textContent = streamElem.textContent;
				
				document.getElementById('dropdownMenuButtonCourseType').textContent = 'Select Course Type ';
				document.getElementById('dropdownMenuButtonCourse').textContent = 'Select Course ';
				document.getElementById('dropdownMenuButtonBatch').textContent = 'Select Batch ';

				var courseTypeDropDown=document.getElementById('select-coursetype-dropdown');
				while (courseTypeDropDown.hasChildNodes()) {  
					courseTypeDropDown.removeChild(courseTypeDropDown.firstChild);
				}

				var courseDropDown=document.getElementById('select-course-dropdown');
				while (courseDropDown.hasChildNodes()) {  
					courseDropDown.removeChild(courseDropDown.firstChild);
				}

				var batchDropDown=document.getElementById('select-batch-dropdown');
				while (batchDropDown.hasChildNodes()) {  
					batchDropDown.removeChild(batchDropDown.firstChild);
				}

				<c:forEach items="${streamList}" var="stream">
				if('${stream.streamId}'==streamId)
					{
						//alert("'${stream.mappingCourseType}'");
						<c:forEach items="${stream.mappingCourseType}" var="det">
							 //alert('${course.courseName}')
							var anchor2 = document.createElement('a');
							anchor2.className="dropdown-item";
							anchor2.setAttribute('href', "#");
							anchor2.id = '${det.courseTypeId}' + 'CT';
							//alert("courseType Name  " + courseTypeList[i].courseTypeName);
							anchor2.textContent = '${det.courseTypeName}'.toUpperCase().replace("_"," ");
							anchor2.setAttribute('onclick', "getCourseTypeId(this.id)");
							document.getElementById('select-coursetype-dropdown').appendChild(anchor2);
							 
						</c:forEach>
					}
		    </c:forEach>     
							
			  /*   var myData = {
					streamId: streamId
				};
				
				$.ajax({
					type: 'POST',
					//url: servletURL + 'StreamCourseTypeServlet',
					url: "/StreamCourseType",
					//data: JSON.stringify(myData),
					data: jQuery.param(myData),
					dataType: 'json',
					//contentType: 'application/json; charset=utf-8',
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

				}); */
			}
			
			var courseTypeElem;
			var coursesList;

			function getCourseTypeId(courseType_id){
				courseTypeId = courseType_id.substring(0, courseType_id.length-2);
				
				courseTypeElem = document.getElementById(courseType_id);
				
				document.getElementById('dropdownMenuButtonCourseType').textContent = courseTypeElem.textContent;
				document.getElementById('dropdownMenuButtonCourse').textContent = 'Select Course ';

				var myData = {
					streamId: streamId,
					courseTypeId:courseTypeId
				};
				$.ajax({
					type: 'POST',
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

						var batchDropDown=document.getElementById('select-batch-dropdown');
						while (batchDropDown.hasChildNodes()) {  
							batchDropDown.removeChild(batchDropDown.firstChild);
						}
						
						//alert("coursesList.length = "+coursesList.length);
						for (var i = 0; i < coursesList.length; i++) {
							var anchor4 = document.createElement('a');
							anchor4.className="dropdown-item";
							anchor4.setAttribute('href', "#");
							anchor4.id = coursesList[i].courseId + 'C';
							anchor4.textContent = coursesList[i].courseName.toUpperCase().replace("_"," ");
							//alert("course Name  " + coursesList[i].courseName);
							anchor4.setAttribute('course_index', i);
							anchor4.setAttribute('onclick', "getCourseId(this.id,this.getAttribute('course_index'))");
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
			
			
			var courseElem;
			
			function getCourseId(course_id,course_index){
				courseId = course_id.substring(0, course_id.length - 1);
				courseElem = document.getElementById(course_id);
				
				document.getElementById('dropdownMenuButtonCourse').textContent = courseElem.textContent;

				var myData = {
						courseId: courseId,
						
					};
				$.ajax({
					type: 'POST',
					
					url: "/BatchNames",
					data: jQuery.param(myData),
					dataType: 'json',
					contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function (jsonObj) {
						batchesList=jsonObj;
						
						var batchDropDown=document.getElementById('select-batch-dropdown');
						while (batchDropDown.hasChildNodes()) {  
							batchDropDown.removeChild(batchDropDown.firstChild);
						}
						
						
						for (var i = 0; i < batchesList.length; i++) {
							var anchor4 = document.createElement('a');
							anchor4.className="dropdown-item";
							anchor4.setAttribute('href', "#");
							anchor4.id = batchesList[i].batchId + 'B';
							anchor4.textContent = batchesList[i].batchName.toUpperCase().replace("_"," ");
							anchor4.setAttribute('onclick', "getBatchId(this.id)");
							document.getElementById('select-batch-dropdown').appendChild(anchor4);
						}
						
					},
					error: function(){
						alert("Error");
						
					}

					});			
				
			}

			var lectureDetails;
			function getBatchId(batch_id){
				
				batchId = batch_id.substring(0, batch_id.length - 1);
				
				batchElem = document.getElementById(batch_id);

				document.getElementById('dropdownMenuButtonBatch').textContent = batchElem.textContent;

				/* document.getElementById('lec_view_card').style.display = "block";

				var elem = document.getElementById('details-lectureview');
				if(elem!=null){
					elem.parentNode.removeChild(elem);
				}
				
				var table = document.createElement('table');
				table.className="table table-hover";
				table.id="details-lectureview";
				var thead = document.createElement('thead');
							
				var tbody = document.createElement('tbody');
					
				var td=document.createElement('td');
				var h4=document.createElement('h4');
				td.appendChild(h4);
				var currentlec=document.createElement('h4');
				currentlec.textContent="Current Lecture: 10";
				h4.appendChild(currentlec);
					
				document.getElementById('currentlec-label').appendChild(td);
					
				var td1=document.createElement('td');
				var h4=document.createElement('h4');
				td1.appendChild(h4);
				var u=document.createElement('u');
				u.textContent="Lecture Number : ";
				
				h4.appendChild(u);
				
				document.getElementById('lecture-view-controls').appendChild(td1);
				
				var td2=document.createElement('td');
				var startdateBtn=document.createElement('btn');
				startdateBtn.className="btn btn-secondary";
				startdateBtn.textContent="Start Date : 2nd Oct2019";
				//startdateBtn.style.width="50";
				startdateBtn.style.height="60px";
				startdateBtn.style.backgroundColor="gray";
				startdateBtn.style.color="white";
				td2.appendChild(startdateBtn);
				
				document.getElementById('start-date-btn').appendChild(td2);
				
				var td3=document.createElement('td');
				var enddateBtn=document.createElement('btn');
				enddateBtn.className="btn btn-secondary";
				enddateBtn.textContent="End Date : 2nd Jan 2020";
				enddateBtn.style.height="60px";
				enddateBtn.style.marginLeft="740px";
				enddateBtn.style.backgroundColor="gray";
				enddateBtn.style.color="white";
				td3.appendChild(enddateBtn);
				
				document.getElementById('end-date-btn').appendChild(td3);
				
				var td4=document.createElement('td');
				var lectdate=document.createElement('label');
					//td.appendChild(lectdate);
					lectdate.textContent="Lecture Date : ";
					lectdate.style.marginLeft="740px";
					td4.appendChild(lectdate);
					//tbody.appendChild(lectdate);
					
				document.getElementById('lecture-date-label').appendChild(td4);
				
				var td5=document.createElement('td');
				var sessionduration=document.createElement('label');
					//td.appendChild(lectdate);
					sessionduration.textContent="Session Duration : 2 hours";
					sessionduration.style.marginLeft="740px";
					td5.appendChild(sessionduration);
					//tbody.appendChild(lectdate);
					
				document.getElementById('session-duration-label').appendChild(td5);
				
				var td6=document.createElement('td');
				var starttime=document.createElement('label');
					//td.appendChild(lectdate);
					starttime.textContent="Start Time : 5.30 pm ";
					starttime.style.marginLeft="740px";
					td6.appendChild(starttime);
					//tbody.appendChild(lectdate);
					
				document.getElementById('start-time-label').appendChild(td6);
				
				var td7=document.createElement('td');
				var strength=document.createElement('label');
					//td.appendChild(lectdate);
					strength.textContent="Class Strength : 10";
					strength.style.marginLeft="740px";
					td7.appendChild(strength);
					//tbody.appendChild(lectdate);
					
				document.getElementById('class-strength-label').appendChild(td7);
				
				table.appendChild(tbody);
				
				document.getElementById('table-lecture-view').appendChild(table); */

			 	var myData = {
					batchId: batchId
					
				};
				$.ajax({
					type: 'POST',
					url: "/LectureViewDetails",
					data: jQuery.param(myData),
					dataType: 'json',
					contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					traditional: true,
					success: function (jsonObj) {
							//alert(jsonObj.mappingCourse.mappingCoursePlans[0].mappingCourse);
							//alert(jsonObj.mappingCourse.mappingCoursePlans[0].coursePlansId);
							
							lectureDetails=jsonObj;
							document.getElementById('lec_view_card').style.display = "block";

							var elem = document.getElementById('details-lectureview');
							if(elem!=null){
								elem.parentNode.removeChild(elem);
							}
							
							var table = document.createElement('table');
							table.className="table table-hover";
							table.id="details-lectureview";
							var thead = document.createElement('thead');
										
							var tbody = document.createElement('tbody');
								
							var td=document.createElement('td');
							var h4=document.createElement('h4');
							td.appendChild(h4);
							var currentlec=document.createElement('h4');
							//currentlec.textContent="Current Lecture: 10";
							currentlec.textContent="Current Lecture: " + lectureDetails.currentLectureNumber;
							h4.appendChild(currentlec);
								
							document.getElementById('currentlec-label').appendChild(td);
								
							var td1=document.createElement('td');
							var h4=document.createElement('h4');
							td1.appendChild(h4);
							var u=document.createElement('u');
							u.textContent="Lecture Number : ";
							
							h4.appendChild(u);
							
							document.getElementById('lecture-view-controls').appendChild(td1);
							
							var td2=document.createElement('td');
							var startdateBtn=document.createElement('btn');
							startdateBtn.className="btn btn-secondary";
							startdateBtn.textContent="Start Date : 2nd Oct2019";
							startdateBtn.textContent="Start Date : "+ lectureDetails.beginDate.slice(0,-19) ;
							var startdate = lectureDetails.beginDate.slice(0,-19) ;
							alert(format(startdate))
							
							//startdateBtn.style.width="50";
							startdateBtn.style.height="60px";
							startdateBtn.style.backgroundColor="gray";
							startdateBtn.style.color="white";
							td2.appendChild(startdateBtn);
							
							document.getElementById('start-date-btn').appendChild(td2);
							
							var td3=document.createElement('td');
							var enddateBtn=document.createElement('btn');
							enddateBtn.className="btn btn-secondary";
							//enddateBtn.textContent="End Date : 2nd Jan 2020";
							enddateBtn.textContent="End Date : "+lectureDetails.endDate ;
							enddateBtn.style.height="60px";
							enddateBtn.style.marginLeft="740px";
							enddateBtn.style.backgroundColor="gray";
							enddateBtn.style.color="white";
							td3.appendChild(enddateBtn);
							
							document.getElementById('end-date-btn').appendChild(td3);
							
							var td4=document.createElement('td');
							var lectdate=document.createElement('label');
								//td.appendChild(lectdate);
								lectdate.textContent="Lecture Date : ";
								lectdate.style.marginLeft="740px";
								td4.appendChild(lectdate);
								//tbody.appendChild(lectdate);
								
							document.getElementById('lecture-date-label').appendChild(td4);
							
							var td5=document.createElement('td');
							var sessionduration=document.createElement('label');
								//td.appendChild(lectdate);
								sessionduration.textContent="Session Duration : 2 hours";
								sessionduration.style.marginLeft="740px";
								td5.appendChild(sessionduration);
								//tbody.appendChild(lectdate);
								
							document.getElementById('session-duration-label').appendChild(td5);
							
							var td6=document.createElement('td');
							var starttime=document.createElement('label');
								//td.appendChild(lectdate);
								starttime.textContent="Start Time : 5.30 pm ";
								starttime.style.marginLeft="740px";
								td6.appendChild(starttime);
								//tbody.appendChild(lectdate);
								
							document.getElementById('start-time-label').appendChild(td6);
							
							var td7=document.createElement('td');
							var strength=document.createElement('label');
								//td.appendChild(lectdate);
								strength.textContent="Class Strength : 10";
								strength.style.marginLeft="740px";
								td7.appendChild(strength);
								//tbody.appendChild(lectdate);
								
							document.getElementById('class-strength-label').appendChild(td7);
							
							table.appendChild(tbody);
							
							document.getElementById('table-lecture-view').appendChild(table);

							
					}

				}); 
			}

			function format(inputDate) {
			    var date = new Date(inputDate);
			    if (!isNaN(date.getTime())) {
			        // Months use 0 index.
			        return date.getDate()  + '-' + date.getMonth()+1 + '-' + date.getFullYear();
			    }
			}
		</script>
	
		
		
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

	</body>
</html>	