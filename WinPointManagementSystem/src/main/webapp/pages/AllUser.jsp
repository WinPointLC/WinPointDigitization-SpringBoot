<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
            <!-- own CSS -->
			<!--
            <link rel="stylesheet" href="../css/Dashboard.css">
            <link rel="stylesheet" href="../css/EmployeeDashboard.css">-->
			<link rel="stylesheet" href="../css/analytics_modal.css">
			<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
    
  </head>

  <body>
    <!-- All USer content -->
    <div class="container-fluid" id="all-user-content">
      <div class="row">
        <div class="col-md-12">
          <div class="card card-plain">
            <div class="card-header card-header-primary">
              <h4 class="card-title mt-0">List of all user </h4>
            </div><br>
            
			
			<div class="card-body">
          
            <div class="row">
			
              <div class="col-md-3">
                <div class="stats">
                  <div class="dropdown" id="stream-dropdown-div">
				  
                    <button style ="margin-left:10px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonStream" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                    <button style ="margin-left:10px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonCourseType" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                    <button style ="margin-left:10px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonCourse" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                    <button style ="margin-left:10px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonBatch" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Select Batch
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-batch-dropdown">

                    </div>
                  </div>
                </div>
               </div>
			   
			
              </div>
			</div>
			
			
			
			
            <div class="card-body">
              <div class="table-responsive" id="table-users">
                
              </div>
            </div>
          </div>
        </div>

      </div>
    </div>
	
	<div class="modal fade" id="mymodal_analytics" style="margin-left:-10px;">
		<div class="modal-dialog modal-dialog-full-width"  role="document">
			<div class="modal-content ">
			    
				<div class="Include-jsp" id="iframediv">
					<iframe style ="margin-left:-140px;" width="1000" height="700" id="Analytics-jsp"></iframe>
				</div>
				
			</div>
	    </div>
	</div>
    <!-- End of All USer content  -->
		
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
   <!-- Js for All user  -->
			
		var streamList;
		var streamId;
		var courseTypeId;
		var courseId;
		var batchId;
		//alert('${fn:length(streamList)}');
		
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
		
		var batchElem;
		//var username;

		function getBatchId(batch_id){
			batchId = batch_id.substring(0, batch_id.length - 1);
			
			batchElem = document.getElementById(batch_id);

			//alert(batchElem.textContent);
			
			document.getElementById('dropdownMenuButtonBatch').textContent = batchElem.textContent;

			var myData = {
				batchId: batchId
				
			};
			$.ajax({
				type: 'POST',
				//url: servletURL + 'BatchDetailsServlet?batchInfoParam=studentDetails',
				url: "/BatchDetails",
				data: jQuery.param(myData),
				dataType: 'json',
				contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
				traditional: true,
				success: function (jsonObj) {
					userList=jsonObj;
					//alert("Userlist length " + userList.length);
					
					var counter;
					
					var elem = document.getElementById('user-details');
					if(elem!=null){
						elem.parentNode.removeChild(elem);
					}
			
					var table = document.createElement('table');
					table.className="table table-hover";
					table.id="user-details";
					var thead = document.createElement('thead');
					
					var th0 = document.createElement('th');
					th0.textContent = 'Sr no.';
					var th1 = document.createElement('th');
					th1.textContent = "Username";
					var th2 = document.createElement('th');
					th2.textContent = "Email";
					var th3 = document.createElement('th');
					th3.textContent = "College";
					var th4 = document.createElement('th');
					th4.textContent = "Mobile No";
					//var th5 = document.createElement('th');
					//th5.textContent = "Courses Done";
					var th6 = document.createElement('th');
					th6.textContent = "Analytics";
					thead.appendChild(th0);
					thead.appendChild(th1);
					thead.appendChild(th2);
					thead.appendChild(th3);
					thead.appendChild(th4);
					//thead.appendChild(th5);
					thead.appendChild(th6);
					table.appendChild(thead);
					
					var tbody = document.createElement('tbody');
					
					for(var i=0;i<userList.length;i++){

						/* for(var j=0;j<userList.mappingUserCoursesAlreadyDone.length;j++){
								alert(mappingUserCoursesAlreadyDone[j].courseName);
						}
					 */
						counter=i+1;
						
						var tr = document.createElement('tr');
						var td0 = document.createElement('td');
						td0.textContent = counter;
						var td1 = document.createElement('td');
						td1.textContent = userList[i].firstName + " " + userList[i].lastName;
						//var username = userList[i].firstName + " " + userList[i].lastName;
						var user_id = userList[i].userId;
						var td2 = document.createElement('td');
						td2.textContent = userList[i].emailId;
						var td3 = document.createElement('td');
						td3.textContent = userList[i].college;
						var td4 = document.createElement('td');
						td4.textContent = userList[i].mobileNumber;
						//var td5 = document.createElement('td');
						//td5.textContent = userList[i].courseAlreadyDone;
						//creating Analytics and Result Button for all user.
						var td6  = document.createElement('td');
						var analyticsLink = document.createElement('a');
						analyticsLink.textContent = "Go to Analytics";
						analyticsLink.setAttribute('data-toggle',"modal");
				        analyticsLink.setAttribute('data-target',"#mymodal_analytics");
						//analyticsLink.setAttribute('username', username);
						analyticsLink.setAttribute('userid', user_id);
						analyticsLink.setAttribute('onclick',"getAnalyticsModal(this.getAttribute('userid'))");
						td6.appendChild(analyticsLink);

						tr.appendChild(td0);
						tr.appendChild(td1);
						tr.appendChild(td2);
						tr.appendChild(td3);
						tr.appendChild(td4);
						//tr.appendChild(td5);
						tr.appendChild(td6);
						
						tbody.appendChild(tr);
					}
					table.appendChild(tbody);
					
					//document.getElementById("Analytics-jsp").src = "Analytics_new.jsp?&username=" + username;
					
					document.getElementById('table-users').appendChild(table);
				},
				error: function(){
					alert("Error");
					//document.getElementById("error").innerHTML = "Invalid email or password";
				}

			});
		}
		
		function getAnalyticsModal(userid){
			
			document.getElementById("Analytics-jsp").src = "Analytics_new?&userid=" + userid;
			
		}
		
		
  </script>
	
	
  </body>
</html>
