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
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />
	
	  <meta charset="utf-8" />
	  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	  <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	  <script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
	</head>
	<body>
		<!--batch feedback content -->
			<br></br>
	<div class="card card-nav-tabs">
			<div class="card-header card-header-primary">
			<h4 class="text-center" style="font-size:30px">Batch Feedback Screen
			<i class="material-icons" style="float:right;height:100%;
			font-size:40px;position:relative;margin-left:1120px;margin-top:-40px;">help_center</i></h4>
			<!--<table>
			<tr>
			<td><input type="button" id="btnback" class="text-left" value="Back" style="float:left;height:50px">
			</input></td>
			<input type="button" id="btnback" class="text-right" value="Back1" style="float:right;height:50px">
			
			<td></td>
			</tr>
			</table>-->
			</div>
	<div style="margin-left:1%;margin-right:1%">
		<div class="card-body" style="width:100%">
			<h5 style="color:black;margin-top:5px">Batch Name </h5>
		<table style="width:100%; border-collapse:collapse;border-color:#fffff">
		<tr>
           <!-- <td style="width:50%; padding:20px;vertical-align:top;" rowspan="3" colspan="4">
				<h5 align="center-left" style="color:black">Weighted objective response</h5>
				<label for="exampleFormControlTextarea1"></label>
						<textarea class="form-controls" id="exampleFormControlTextarea1" rows="20" cols="120"></textarea>
				<h5 align="center-left" style="color:black">Questions</h5>
			</td>-->
			<td>
			<div style="height:500px; width:500px;">
			<canvas id="barChart">
			</canvas>
			</div>
			<script>
			
			var marksList=[
			{
				fullName:"Pragya Korpal",
				marks:"70"
				
				
			},
			{
				fullName:"Abhishek Dixit",
				marks:"70"
				
				
			},
			{
				fullName:"Surbhi Joshi",
				marks:"70"
				
				
			}
			]
			
			var chartStudentName = new Array();
			var chartData= new Array();
			for(var j=0 ; j<marksList.length; j++){

			  chartStudentName.push(marksList[j].fullName);
			  chartData.push(marksList[j].marks);

			  }
			var ctx = document.getElementById("barChart").getContext('2d');
						var myChart = new Chart(ctx, {
							type: 'bar',
							data: {
								labels: chartStudentName,
								datasets: [{
									label: 'Marks of Students',
									data: chartData,
									backgroundColor: "#33AEEF",
									borderWidth: 3
								   
								}]
							},
							options: {
								scales: { 
									yAxes: [{
										ticks: {
											beginAtZero: true
										}
									}]
								}
							}
						});
						</script>
					</td>
			<td style="font-size:20px;width:50%;padding:20px;vertical-align:top;">
                <p style="color:black">Overall experiences :
				<input type="text" value="" size="3"></input>
				</p>
				<br></br>
				<br></br>
				<br></br>
				<p style="color:black">Total Feedback Received:
				<input type="text" value="" size="3"></input>
				</p>
			</td>
		</tr>
		<!--<tr>
			<br></br>
			<td></td>
			<td></td>
			<td></td>
		</tr>-->
		</table>
		<div style="text-align:center">
			<input type="button" class="btn btn-primary" value="Individual Feedback" style="width:200px;height:50px;"/>
		</div>
		</div>
	</div>
	</div>
		<!--batch feedback content end-->
		
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