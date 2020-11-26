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
	
		<!-- Manage Revenue content -->
		<div class="container-fluid" id="manage-revenue-content">
			<div class="card card-plain">
				<div class="card-header card-header-primary">
				  <h3 class="card-title mt-0" style="margin-left:40%">Manage Revenue</h3>
				</div><br>
			</div>
			
			<div class="row">
				<div class="column">
                <div class="stats">
                  <div class="dropdown" id="segment-dropdown-div">
				  
                    <button style ="margin-left:15px; width:200px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonSegment" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Segment Type
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-segment-dropdown">

                    </div>
                  </div>
                </div>
              </div>

		      <div class="column" style ="margin-left:100px; width:250px;">
                <div class="form-group">
                  <label class="bmd-label-floating">Receipt No.</label>
                  <input type="text" class="form-control" id="receiptNo" required>
                </div>
              </div>
			 
			  <div class="column" style ="margin-left:100px; width:250px;">
                <div class="form-group">
                  <label class="bmd-label-floating">Date</label>
                  <input type="text"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control" id="date1" required>
                </div>
              </div>
			  
			  <div class="column" style ="margin-left:100px; width:245px;">
                <div class="form-group">
                  <label class="bmd-label-floating">Course</label>
                  <input type="text" class="form-control" id="course"  required>
                </div>
              </div>
			  
			  
			</div><br>
			
			<div class="row">
              <div class="col-md-12">
                <div class="form-group">
                  <label>Payer Description</label>
                  <div class="form-group">
                    <label></label>
                    <textarea class="form-control" rows="1" id="payer_desc" required></textarea>
                  </div>
                </div>
              </div>
            </div><br>
			
			<div class="row">
			  <div class="col-md-4">
                <div class="stats">
                  <div class="dropdown" id="revenueType-dropdown-div">
				  
                    <button style ="margin-left:0px; width:300px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonRevenueType" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Revenue Type
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-revenue-type-dropdown">

                    </div>
                  </div>
                </div>
              </div>
			  
			  <div class="col-md-4">
                <div class="stats">
                  <div class="dropdown" id="organisation-dropdown-div">
				  
                    <button style ="margin-left:50px; width:300px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonOrganisation" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Organisation Type
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-organisation-dropdown">

                    </div>
                  </div>
                </div>
              </div>
			  
			  <div class="col-md-4">
                <div class="stats">
                  <div class="dropdown" id="paymentMode-dropdown-div">
				  
                    <button style ="margin-left:100px; width:300px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButtonPaymentMode" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Mode of Payment
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" id="select-paymentMode-dropdown">

                    </div>
                  </div>
                </div>
              </div>
  
			</div><br><br>
			
			
			<div class="row">
			  <div class="col-md-3" style="margin-left:0px; width:300px;">
                <div class="form-group">
                  <label class="bmd-label-floating">Cheque No.</label>
                  <input type="text" class="form-control" id="chequeNo" required>
                </div>
               </div>
				
				<div class="col-md-3" style ="margin-left:160px; width:300px;">
               <div class="form-group">
                  <label class="bmd-label-floating">Revenue Amount</label>
                  <input type="text" class="form-control" id="revenueAmt"  required>
                </div>
              </div>
			  
			  <div class="col-md-3" style ="margin-left:155px; width:300px;">
                <div class="form-group">
                  <label class="bmd-label-floating">Date</label>
                  <input type="text"  onfocus="this.type='date'" onblur="if(this.value==='')this.type='text'" class="form-control" id="date2" required>
                </div>
              </div>	  
            </div><br><br>
			 <button type="submit" class="btn btn-primary" onclick="addRevenue()">Submit</button>
			</div>
					
					
		<!-- Manage Revenue content end -->
		
	

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
			var SearchString = window.location.search.substring(1);
			
			var arr = SearchString.split('&');
			var data= arr[0].split('=')[1];
			var decodedData = decodeURIComponent(data);
			var segmentList=JSON.parse(decodedData);

			var data= arr[1].split('=')[1];
			var decodedData = decodeURIComponent(data);
			var revenueTypeList=JSON.parse(decodedData);

			var data= arr[2].split('=')[1];
			var decodedData = decodeURIComponent(data);
			var organisationTypeList=JSON.parse(decodedData);

			var data= arr[3].split('=')[1];
			var decodedData = decodeURIComponent(data);
			var paymentModeList=JSON.parse(decodedData);

		</script>
		
		<script type="text/javascript">
			/* var segmentList;
			segmentList = '${segmentList}'; */

			for (var i = 0; i < segmentList.length; i++) {
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = segmentList[i].segmentId;
				anchor.textContent = segmentList[i].segmentName.toUpperCase().replace("_"," ");
				anchor.setAttribute('onclick', "getSegmentId(this.id)");
				document.getElementById('select-segment-dropdown').appendChild(anchor);
			}

			var segmentElem;
			var segmentId;
			function getStreamId(segment_id){
				segmentId = segment_id;
				
				segmentElem = document.getElementById(segmentId);
				
				document.getElementById('dropdownMenuButtonSegment').textContent = segmentElem.textContent;
				
			}	
		</script>
		
		<script type="text/javascript">
			/* var revenueTypeList;
			revenueTypeList = '${revenueTypeList}'; */

			for (var i = 0; i < revenueTypeList.length; i++) {
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = revenueTypeList[i].revenueTypeId;
				anchor.textContent = revenueTypeList[i].revenueTypeName.toUpperCase().replace("_"," ");
				anchor.setAttribute('onclick', "getRevenueTypeId(this.id)");
				document.getElementById('select-revenue-type-dropdown').appendChild(anchor);
			}

			var revenueTypeElem;
			var revenueTypeId;
			function getRevenueTypeId(revenueType_id){
				revenueTypeId = revenueType_id;
				
				revenueTypeElem = document.getElementById(revenueTypeId);
				
				document.getElementById('dropdownMenuButtonRevenueType').textContent = revenueTypeElem.textContent;
				
			}	
		</script>
		
		<script type="text/javascript">
			/* var organisationTypeList;
			organisationTypeList = '${organisationTypeList}';*/
			
			for (var i = 0; i < organisationTypeList.length; i++) {
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = organisationTypeList[i].organisationTypeId;
				anchor.textContent = organisationTypeList[i].organisationTypeName.toUpperCase().replace("_"," ");
				anchor.setAttribute('onclick', "getOrganisationTypeId(this.id)");
				document.getElementById('select-organisation-dropdown').appendChild(anchor);
			}

			var organisationTypeElem;
			var organisationTypeId;
			function getRevenueTypeId(organisationType_id){
				organisationTypeId = organisationType_id;
				
				organisationTypeElem = document.getElementById(organisationTypeId);
				
				document.getElementById('dropdownMenuButtonOrganisation').textContent = organisationTypeElem.textContent;
				
			}	
		</script>
		
		<script type="text/javascript">
			/* var paymentModeList;
			paymentModeList = '${paymentModeList}'; */

			for (var i = 0; i < paymentModeList.length; i++) {
				var anchor = document.createElement('a');
				anchor.className="dropdown-item";
				anchor.setAttribute('href', "#");
				anchor.id = paymentModeList[i].paymentModeId;
				anchor.textContent = paymentModeList[i].paymentModeName.toUpperCase().replace("_"," ");
				anchor.setAttribute('onclick', "getPaymentModeId(this.id)");
				document.getElementById('select-paymentMode-dropdown').appendChild(anchor);
			}

			var paymentModeElem;
			var paymentModeId;
			function getPaymentModeId(paymentMode_id){
				paymentModeId = paymentMode_id;
				
				paymentModeElem = document.getElementById(paymentModeId);
				
				document.getElementById('dropdownMenuButtonPaymentMode').textContent = paymentModeElem.textContent;
				
			}	
		</script>
		
		<script>
			function addRevenue(){
				
				var receiptNo = document.getElementById('receiptNo').value;
				var date1 = document.getElementById('date1').value;
				var date2 = document.getElementById('date2').value;
				var course = document.getElementById('course').value;
				var payerDescription = document.getElementById('payer_desc').value;
				var chequeNo = document.getElementById('chequeNo').value;
				var revenueAmount = document.getElementById('revenueAmt').value;
				
				var myData = {
						segmentId:segmentId,
						receiptNo:receiptNo,
						date1:date1,
						course:course,
						payerDescription:payerDescription,
						revenueTypeId:revenueTypeId,
						organisationTypeId:organisationTypeId,
						paymentModeId:paymentModeId,
						chequeNo:chequeNo,
						revenueAmount:revenueAmount,
						date2:date2
				};
				//alert(myData);
				$.ajax({
					type: 'POST',
					url: "/AddRevenue",
					data: JSON.stringify(myData),
					dataType: 'json',
					contentType: 'application/json; charset=utf-8',
					traditional: true,
					success: function (jsonObj) {
						alert("Revenue added successfully");
						
					},
					error: function(){
						alert("Error");
						//document.getElementById("error").innerHTML = "Invalid email or password";
					}
	
				});
				alert("After AJAX");
			}

		</script>
		
	</body>
</html>	