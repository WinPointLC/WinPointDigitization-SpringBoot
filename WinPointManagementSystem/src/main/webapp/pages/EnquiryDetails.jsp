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
	  <link href="../css/employee_new_2.css" rel="stylesheet" />
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	  <link rel="stylesheet" href="../assets/css/magnific-popup.css" media="screen" />
	 
	  <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />



    <link href="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/css/bootstrap.css" rel="stylesheet" />

	<link href="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/css/login-register.css" rel="stylesheet" />
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">

	<script src="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/js/bootstrap.js" type="text/javascript"></script>
	<script src="C:/Users/Admin/Desktop/screendevlopment/WebContent/login-register-master/assets/js/login-register.js" type="text/javascript"></script>
	

	</head>
	<body>
		
		
		<!--Enquiry details  Page-->
		<br></br>
			<div class="card card-nav-tabs">
				<h3 class="card-header card-header-primary text-center">Enquiry Details</h3>
				<div class="card-body">
			<div class="card">
					<br><br>
				<div class="card-body">
					<div class="table-responsive" id="table-enquiry-details">
				
					</div>
					
		</div>
		</div>
			<div class="card-footer text-muted"><!--style="background:linear-gradient(60deg, #26c6da, #00acc1)-->
			<!-- <a href="javascript:;" class="btn btn-primary" style="float:left;height:35px">Cancel</a> -->
			<a href="javascript:;" class="btn btn-primary" style="float:right;height:35px">Submit</a>
			</div>
		</div>
		</div>
	
		<!--End enquiry details Page-->
		<script>

			var elem = document.getElementById('details-enquiry');
			if(elem!=null){
				elem.parentNode.removeChild(elem);
			}
			
			var table = document.createElement('table');
			table.className="table table-hover";
			table.id="details-enquiry";
			var thead = document.createElement('thead');
			
			var th1 = document.createElement('th');
			th1.textContent = "Name";
			var th2 = document.createElement('th');
			th2.textContent = "Course";
			var th3 = document.createElement('th');
			th3.textContent = "Eligibility";
			var th4 = document.createElement('th');
			th4.textContent = "Suggestion";
			var th5 = document.createElement('th');
			th5.textContent = "Update";
			
			thead.appendChild(th1);
			thead.appendChild(th2);
			thead.appendChild(th3);
			thead.appendChild(th4);
			thead.appendChild(th5);
			//thead.appendChild(th6);
			table.appendChild(thead);
			
			var tbody = document.createElement('tbody');
			
			<c:forEach items="${enquiryList}" var="det">
					var tr = document.createElement('tr');
					var td1 = document.createElement('td');
					td1.textContent = '${det.firstName}'+" "+ '${det.lastName}' ;
					var td2 = document.createElement('td');
					td2.textContent = '${det.courseInterestedIn}';
					var td3 = document.createElement('td');
					td3.textContent = '${det.eligibility}';
					var td4 = document.createElement('td');
					td4.textContent = '${det.suggestion}';
					
					var td5 = document.createElement('td');	
					var addStudentBtn = document.createElement('btn');
					addStudentBtn.className="btn btn-primary"
					addStudentBtn.textContent = "Update";
					addStudentBtn.setAttribute('enq','${det.enquiryId}');
					
					addStudentBtn.setAttribute('onclick',"updateForm(this.getAttribute('enq'))");
					td5.appendChild(addStudentBtn);

					tr.appendChild(td1);
					tr.appendChild(td2);
					tr.appendChild(td3);
					tr.appendChild(td4);
					tr.appendChild(td5);
					
					tbody.appendChild(tr);
		
			</c:forEach>  
			
			table.appendChild(tbody);
			
			document.getElementById('table-enquiry-details').appendChild(table);

			function updateForm(enquiry){
				//alert(enquiry);
				
				window.location.href = "UpdateForm" + "?enquiryid="+enquiry;
			}
		</script>

	</body>
</html>	