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


	<style>body{padding-top: 60px;}</style>

    <link href="../assets/css/bootstrap.css" rel="stylesheet" />

	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	<script src="../assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="../assets/js/bootstrap.js" type="text/javascript"></script>
	
	</head>
	<body>
	
		<!--Course Name Page-->
			<br></br>
			<div class="card card-nav-tabs">
				<h3 class="card-header card-header-primary text-center">Course Name</h3>
			<div class="card-body">
				<div class="card">
					<br><br>
					<div class="card-body">
						<div class="table-responsive" id="table-course-name">
					
						</div>
				
					</div>
				</div>
				<div class="card-footer text-muted">
				<a href="javascript:;" class="btn btn-primary" style="float:left">Submit</a>
				</div>
			</div>
	<!--End Course Name Page-->

	</div>

		<script>
			
			var courseNameList=[
			{
				student:"pragya",
				enquired:"true",
				registered:"true",
				emailsent:"yes",
				//endDate:"2020-11-30"
			},
			{
				student:"surbhi",
				enquired:"true",
				registered:"false",
				emailsent:"no",
				//endDate:"2020-11-30"
			},
			{
				student:"abhishek",
				enquired:"false",
				registered:"true",
				emailsent:"no",
				//endDate:"2020-11-30"
			}
			]
			
			var elem = document.getElementById('details-course');
			if(elem!=null){
				elem.parentNode.removeChild(elem);
			}
			
			var table = document.createElement('table');
			table.className="table table-hover";
			table.id="details-course";
			var thead = document.createElement('thead');
			
			var th1 = document.createElement('th');
			th1.textContent = "Student";
			var th2 = document.createElement('th');
			th2.textContent = "Enquired";
			var th3 = document.createElement('th');
			th3.textContent = "Registered";
			var th4 = document.createElement('th');
			th4.textContent = "Email to be sent";
			var th5 = document.createElement('th');
			th5.textContent = "Add";
			
			thead.appendChild(th1);
			thead.appendChild(th2);
			thead.appendChild(th3);
			thead.appendChild(th4);
			thead.appendChild(th5);
			//thead.appendChild(th6);
			table.appendChild(thead);
			
			var tbody = document.createElement('tbody');
			
			for(var i=0;i<courseNameList.length;i++){
				
				var tr = document.createElement('tr');
				var td1 = document.createElement('td');
				td1.textContent = courseNameList[i].student;
				var td2 = document.createElement('td');
				td2.textContent = courseNameList[i].enquired;
				var td3 = document.createElement('td');
				td3.textContent = courseNameList[i].registered;
				var td4 = document.createElement('td');
				td4.textContent = courseNameList[i].emailsent;
				
				var td5 = document.createElement('td');
				//td5.textContent = batchDetailsList[i].endDate;
				
				//var td6  = document.createElement('td');
				var addStudentBtn = document.createElement('btn');
				addStudentBtn.className="btn btn-primary"
				addStudentBtn.textContent = "Add Student";
				td5.appendChild(addStudentBtn);

				
				tr.appendChild(td1);
				tr.appendChild(td2);
				tr.appendChild(td3);
				tr.appendChild(td4);
				tr.appendChild(td5);
				//tr.appendChild(td6);
				
				tbody.appendChild(tr);
			}
			table.appendChild(tbody);
			
			document.getElementById('table-course-name').appendChild(table);
		</script>

		
	</body>
</html>	