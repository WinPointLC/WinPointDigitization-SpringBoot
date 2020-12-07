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
		<!--course select screen content -->
			<br></br>
	<div class="card card-nav-tabs">
		<div class="card-header card-header-primary">
				<h4 class="text-center" style="font-size:30px">Courseware Select Screen
			<!--<input type="button" id="btnhelp" class="text-right" value="" style="margin-left:80%;float:right;height:50px">-->
			<i class="material-icons" style="float:right;height:100%;
			font-size:40px;position:relative;margin-left:1120px;margin-top:-40px;">help_center</i></h4>	
		<!--<input type="button" id="btnback" class="text-right" value="Back1" style="float:right;height:50px">-->
		</div>

	<div style="margin-left:1%;margin-right:1%">
		<div class="card-body" style="width:100%">
		<table>
		<tr>
		<td>
			<div class="dropdown" id="stream-dropdown-div">
				<button style ="margin-left:100px; width:300px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonStream" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                   Select Stream 
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-stream-dropdown">

                </div>
            </div>
		</td>
		<td>
			<div class="dropdown" id="coursetype-dropdown-div">
				<button style ="margin-left:400px; width:300px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonCourseType" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Course Type
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-coursetype-dropdown">

                </div>
            </div>
		</td>
		</tr>
			
		</table>
			<table class="table">
				<td rowspan="3">
					<label for="exampleFormControlTextarea1"></label>
						<textarea class="form-control" id="exampleFormControlTextarea1" rows="20"></textarea>
				</td>		
			</table>
		</div>
	</div>
	</div>
		
		
		
		
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
			
		
		var streamId;
		var courseTypeId;
		
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
			
						
		    var myData = {
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

			});
		}

		function getCourseTypeId(courseType_id){
			courseTypeId = courseType_id.substring(0, courseType_id.length-2);
			
			courseTypeElem = document.getElementById(courseType_id);
			
			document.getElementById('dropdownMenuButtonCourseType').textContent = courseTypeElem.textContent;

			
		}

		</script>
	</body>
</html>	