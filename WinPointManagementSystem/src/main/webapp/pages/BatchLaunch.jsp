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
	 
	  <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

    <link href="../assets/css/bootstrap.css" rel="stylesheet" />

	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	<script src="../assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="../assets/js/bootstrap.js" type="text/javascript"></script>
	
	</head>
	<body>
		
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
						<input class="form-control" type="text" id="batch_name"  readonly>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<label for="lastname">Lecture Duration (minutes)</label>
						<input type="text" class="form-control" id="lec_duration" />
						<a href="javascript:;" class="btn btn-primary" style="float:left">Set</a>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<label for="mobnum">Total Number of Lectures</label>
						<input class="form-control" type="text" id="total_no_lecs" readonly>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<label for="email">Faculty</label>
						<input class="form-control" type="text" id="faculty" readonly>
						</div>
				</div>
				<div class="form-row">
						<div class="col">
						<div class="form-group">
						 <label class="label-control">Time</label>
						 <input class="form-control" type="text" id="time" readonly>
						 </div>
						 </div>
				</div>
				<div class="form-row">
						<div class="col">
						 <label class="label-control">Begin Date</label>
							<div class="form-group">
							<input type="text" id="Begin_Date" class="form-control inputFileVisible" required/>
								
							</div>
						 </div>
				</div>
				<div class="form-row">
						<div class="col">
						 <label class="label-control">End Date</label>
						 <div class="form-group">
							<input type="text" id="End_Date" class="form-control inputFileVisible" required/>
						
						 </div>
						 </div>
				</div>
				
				</form>
			</div>
		</div>
			
			<div class="card-footer text-muted">
				<a href="javascript:;" class="btn btn-primary" onclick="launch()" style="float:left">Launch</a>	
			</div>
		
		<!--End batch launch Page-->
		
		<script>
			function launch(){
					batch_name=document.getElementById("batch_name").value;
					lec_duration=document.getElementById("lec_duration").value;
					total_no_lecs=document.getElementById("total_no_lecs").value;
					faculty=document.getElementById("faculty").value;
					time=document.getElementById("time").value;
					begin_date=document.getElementById("Begin_Date").value;
					end_date=document.getElementById("End_Date").value;
			}
		</script>

	</body>
</html>	