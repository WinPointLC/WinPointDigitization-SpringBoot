<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Course Registration Page</title>
<meta charset="utf-8">
<meta
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0"
	name="viewport" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
<link rel="stylesheet" href="../assets/css/fontawesome.min.css">
<!-- Material Kit CSS -->
<link href="../assets/css/material-dashboard.css?v=2.1.1"
	rel="stylesheet" />
<link rel="stylesheet" href="../css/MainCoursePage.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
</head>
<body>


	<div class="container-fluid">
		<!-- your content here -->
		<div class="row">
			<div class="col-sm-12 col-md-12 col-lg-12">
				<div class="card-header heading">
					<h3>Course Registration</h3>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-11 col-lg-11">
				<!--     <div class="card"> -->
				<div class="card">
					<div class="card-header card-header-tabs card-header"
						style="background-color: rgb(148, 21, 193);">
						<div class="nav-tabs-navigation">
							<div class="nav-tabs-wrapper">

								<ul class="nav nav-tabs" data-tabs="tabs" id="nav-tab">

								</ul>
							</div>
						</div>
					</div>
					<div id="drop11" class="dropdown drop1"></div>
				</div>
				<div class="card" style="display: none;" id="CourseCard">
					<div class="card-body" id="courses">
						<div class="tab-content" id="tab-content">
							<div class="tab-pane active" id="profile">
								<br>
								<br>

								<div class="row" id='courseList'></div>
							</div>
							<div class="tab-pane active" id="registration">
								<h6 id="courseName"></h6>
								<a href="#" onclick="submitCourseRegistration()"><button
										class="Signbtn" type="button">Submit</button></a>
								<!-- <a href="#" onclick="alert('From Submit')"><button class="Signbtn" type="button">Submit</button></a> -->
							</div>
							<div class="tab-pane" id="messages">

								<div class="row">
									<div class="col-lg-3 col-md-6 col-sm-6 column1">
										<div class="card card-stats">
											<div class="card-header card-header-icon">
												<div class="card-icon"
													style="font-size: 20px; background-color: rgb(0, 208, 139);"
													id="row1-card1">
													<i class="material-icons">sort_by_alpha</i>
												</div>
												<a href="TestSelectPage.jsp"><p class="card-category">English
														Language Skills</p></a>
											</div>

										</div>
									</div>
									<div class="col-lg-3 col-md-6 col-sm-6 column2">
										<div class="card card-stats">
											<div class="card-header card-header-icon">
												<div class="card-icon"
													style="font-size: 20px; background-color: rgb(180, 3, 136);"
													id="row1-card1">
													<i class="material-icons">record_voice_over</i>
												</div>
												<a href="TestSelectPage.jsp"><p class="card-category">Oral
														Communication</p></a>
											</div>

										</div>
									</div>
									<div class="col-lg-3 col-md-6 col-sm-6 column3">
										<div class="card card-stats">
											<div class="card-header card-header-danger card-header-icon">

												<div class="card-icon">
													<i class="material-icons">how_to_reg</i>
												</div>
												<a href="TestSelectPage.jsp">
													<p class="card-category">Personality Development</p>
												</a>
											</div>
										</div>
									</div>
								</div>

							</div>
							<div class="tab-pane" id="settings">
								<!--  <div id="drop11" class="dropdown drop1">

                            </div><br> -->
								<div class="row">
									<div class="col-lg-3 col-md-6 col-sm-6 column1">
										<div class="card card-stats">
											<div class="card-header card-header-icon">
												<div class="card-icon"
													style="font-size: 20px; background-color: rgb(111, 209, 13)"
													id="row1-card1">
													<i class="material-icons">exposure</i>
												</div>
												<a href="TestSelectPage.jsp"><p class="card-category">Quantitative
														Aptitude</p></a>
											</div>

										</div>
									</div>
									<div class="col-lg-3 col-md-6 col-sm-6 column2">
										<div class="card card-stats">
											<div class="card-header card-header-info card-header-icon">
												<div class="card-icon" style="font-size: 20px;">
													<i class="material-icons">extension</i>
												</div>
												<a href="TestSelectPage.jsp"><p class="card-category">Logical
														Reasoning</p></a>
											</div>

										</div>
									</div>
									<div class="col-lg-3 col-md-6 col-sm-6 column3">
										<div class="card card-stats">
											<div class="card-header card-header-icon">

												<div class="card-icon"
													style="background-color: rgb(218, 113, 31);">
													<i class="material-icons">find_in_page</i>
												</div>
												<a href="TestSelectPage.jsp"><p class="card-category">Verbal
														Reasoning</p></a>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-md-6 col-sm-6 column4">
										<div class="card card-stats">
											<div class="card-header card-header-icon">
												<div class="card-icon"
													style="font-size: 20px; background-color: rgb(251, 26, 30);">
													<i class="material-icons">spellcheck</i>
												</div>
												<a href="TestSelectPage.jsp"><p class="card-category">Verbal
														Ability</p></a>
											</div>

										</div>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- End card div -->


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
	<!--  Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
	<script src="../assets/js/plugins/bootstrap-selectpicker.js"></script>
	<!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
	<script src="../assets/js/plugins/bootstrap-datetimepicker.min.js"></script>
	<!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
	<script src="../assets/js/plugins/jquery.dataTables.min.js"></script>
	<!--  Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
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
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
	<!-- Library for adding dinamically elements -->
	<script src="../assets/js/plugins/arrive.min.js"></script>
	<!--  Google Maps Plugin    -->
	<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
	<!-- Chartist JS -->
	<script src="../assets/js/plugins/chartist.min.js"></script>
	<!--  Notifications Plugin    -->
	<script src="../assets/js/plugins/bootstrap-notify.js"></script>
	<!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
	<script src="../assets/js/material-dashboard.js?v=2.1.1"
		type="text/javascript"></script>
	<!-- Material Dashboard DEMO methods, don't include it in your project! -->
	<script src="../assets/demo/demo.js"></script>

	<script>
		////alert(streamList[i].streamId + ":" + streamList[i].streamName);
		

		
		
		var courseList;
		var streamId = 1;
		var courseId = 1;
		var courseName;
		var courseTypeId;

		function getStreamId(stream_id) {
			alert("here stream");
			streamId = stream_id;

			var streamElem = document.getElementById(streamId + 'a');
			var elem;
			for (i = 0; i < streamIdList.length; i++) {
				elem = document.getElementById(streamIdList[i] + 'a');
				elem.className = 'nav-link';
			}

			var elem = document.getElementById('dropdownMenu_1');
			if (elem != null) {
				elem.parentNode.removeChild(elem);
			}

			var elem = document.getElementById('dropdownMenuButton_1');
			if (elem != null) {
				elem.parentNode.removeChild(elem);
			}

			streamElem.className = 'nav-link active';
alert("Before CourseType button");
			var btn = document.createElement('button');
			btn.className = 'btn btn-secondary dropdown-toggle';
			btn.id = 'dropdownMenuButton_1';
			btn.setAttribute('data-toggle', "dropdown");
			btn.setAttribute('aria-haspopup', "true");
			btn.setAttribute('aria-expanded', "false");
			btn.textContent = "Course Type";
			document.getElementById('drop-down').appendChild(btn);

			var dropdownMenu = document.createElement('div');
			dropdownMenu.className = 'dropdown-menu';
			dropdownMenu.id = 'dropdownMenu_1';
			dropdownMenu.setAttribute('aria-labelledby', "dropdownMenuButton");

			var cnt = 0;
			<c:forEach items="${streamList}" var="stream">//4.5
			if ('${stream.streamId}' == streamId) {

				//alert("'${stream.mappingCourseType}'");
				<c:forEach items="${stream.mappingCourseType}" var="det">
				//alert("COUNT STREAM : " + cnt);
				cnt++;
				var dropanchor = document.createElement('a');
				dropanchor.className = 'dropdown-item';
				dropanchor.id = '${det.courseTypeId}';

				if (cnt == 1) {
					courseTypeName = ('${det.courseTypeName}').toUpperCase();
					courseTypeId = ('${det.courseTypeId}');
				}
			//	alert("COURSE TYPE NAME : " + courseTypeName);
				dropanchor.textContent = ('${det.courseTypeName}')
						.toUpperCase();
				dropanchor.setAttribute('onclick',
						"displayStreamCourses(this.id, this.textContent)");
				dropdownMenu.appendChild(dropanchor);

				</c:forEach>
			}
			</c:forEach>

			document.getElementById('drop-down').appendChild(dropdownMenu);

			elem = document.getElementById('courseList');
			if (elem != null) {
				elem.parentNode.removeChild(elem);
			}

		}

		function displayStreamCourses(courseType_id, courseTypeName) {
			//var streamId = stream_id;
			var studentCoursesCourseIdList;
			var studentGACoursesCourseIdList;
			courseTypeId = courseType_id;
			//alert("stream_id = " + streamId + "courseType_id = "
				//	+ courseType_id);

			document.getElementById('dropdownMenuButton_1').textContent = courseTypeName;

			var myData = {
				streamId : streamId,
				courseTypeId : courseTypeId
			};

			$
					.ajax({
						type : 'POST',
						url : "/StreamCourseTypeCourses",
						data : jQuery.param(myData),
						dataType : 'json',
						contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
						traditional : true,
						success : function(jsonObj) {
							document.getElementById('CourseCard').style.display = "block";
							var responseJson = jsonObj;
							// var strResJSON = JSON.stringify(responseJson);

							var elem = document.getElementById('courseList');
							if (elem != null) {
								elem.parentNode.removeChild(elem);
							}
							//document.getElementById('profile').removeChild(document.getElementById('xyz'));

							for (i = 0; i < (responseJson.length); i = i + 3) {
								var row = document.createElement('div');
								row.className = 'row';
								row.id = "courseList";
								for (j = i; j < i + 3
										&& j < responseJson.length; j++) {
					//				alert("COURSE LIST" + courseList);
									//alert("course : " + responseJson[j].courseId + "," + responseJson[j].courseName + "," + responseJson[j].iconLocation);
									var column = document.createElement('div');
									column.className = 'col-lg-3 col-md-6 col-sm-6 column3';
									var cardstats = document
											.createElement('div');
									cardstats.className = 'card card-stats';
									var cardheader = document
											.createElement('div');
									cardheader.className = 'card-header  card-header-primary card-header-icon';
									var cardicon = document
											.createElement('div');
									cardicon.className = 'card-icon';
									var image = document.createElement('img');
									image.setAttribute('src',
											responseJson[j].iconLocation);
									image.setAttribute('style',
											" height: 60px; width: 60px; ");
									image.setAttribute('alt', "java");
									cardicon.appendChild(image);
									cardheader.appendChild(cardicon);
									var anchor = document.createElement('a');
									anchor.setAttribute('id',
											responseJson[j].courseId);

									var courseName = responseJson[j].courseName;

									var para = document.createElement('p');
									para.className = 'card-category';
									anchor.appendChild(para);

									if ((studentCoursesCourseIdList != null && studentCoursesCourseIdList
											.includes(responseJson[j].courseId))
											|| (studentGACoursesCourseIdList != null && studentGACoursesCourseIdList
													.includes(responseJson[j].courseId))) {
										//alert("Already Registered Course");
										anchor.removeAttribute('href');
										para.textContent = courseName
												+ '  Registered';
									} else {
										//alert("Course not registered");
										para.textContent = courseName;
										anchor.setAttribute('href', "#");
										anchor.setAttribute('onclick',
												"displayRegistrationForm(this.id,'"
														+ courseName + "',"
														+ streamId + " )");
									}
									cardheader.appendChild(anchor);
									cardstats.appendChild(cardheader);
									column.appendChild(cardstats);
									row.appendChild(column);
								}
								document.getElementById('profile').appendChild(
										row);
							}
							document.getElementById('profile').style.display = "block";
							document.getElementById('registration').style.display = "none";
						},
						error : function() {
							alert("Error");
							//document.getElementById("error").innerHTML = "Invalid email or password";
						}

					});
		}
		function displayRegistrationForm(selectedCourseId, selectedCourseName,
				selectedStreamId) {
			courseId = selectedCourseId;
			streamId = selectedStreamId;
			courseName = selectedCourseName;
			//alert("Register for the course " + courseName);
			document.getElementById('profile').style.display = "none";
			document.getElementById('courseName').innerHTML = "Registration for "
					+ courseName + " Course";
			document.getElementById('registration').style.display = "block";
		}
		function submitCourseRegistration() {
			alert("" + courseId + " " + streamId + " " + courseName + " " + courseTypeId );
			if(sessionStorage.getItem('ISENQUIRED')){
				alert("Enquired Student. . .");
				var enquiredStudentData = {
						streamId : streamId,
						courseTypeId : courseTypeId,
						courseId : courseId,
						Id : sessionStorage.getItem('ENQUIREDID'),
						feeStatus : "Paid",
						enquired : sessionStorage.getItem('ISENQUIRED')
				};  
				$.ajax({
					type : 'POST',
					url : "/UpdateStudentCourseDetails",
					data : JSON.stringify(enquiredStudentData),
					
					//data : jQuery.param(myData),
					//dataType : 'json',
					contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
					//contentType : 'application/json; charset=utf-8',
					
					traditional : true,
					success : function() {
					alert("Course Registration Successful");
					
					},
					error : function() {
						alert("Error in Course Registration");
						// document.getElementById("error").innerHTML = "Invalid email or password";
					}

				});
			
			}
			else{
				alert("REGISTER STUDENT . . .");
				var userStudentData = {
						streamId : streamId,
						courseTypeId : courseTypeId,
						courseId : courseId,
						Id : sessionStorage.getItem('USERID'),
						feeStatus : "Paid",
						enquired : sessionStorage.getItem('ISENQUIRED')
				};
				
				$.ajax({
					type : 'POST',
					url : "/UpdateStudentCourseDetails",
					data : JSON.stringify(userStudentData),
					
					//data : jQuery.param(myData),
					//dataType : 'json',
					contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
					//contentType : 'application/json; charset=utf-8',
					
					traditional : true,
					success : function() {
					alert("Course Registration Successful");
					
					},
					error : function() {
						alert("Error in Course Registration");
						// document.getElementById("error").innerHTML = "Invalid email or password";
					}

				});

			}
			
		}
		function displayTestSelect(courseId, courseName) {
			//alert("DisplayTestSelect Id = " + courseId);
			//var streamId = 1;
			//var courseTypeId = courseTypeId;
			var courseId = courseId;
			//alert(courseName);
			var myData = {
				streamId : streamId,
				courseTypeId : courseTypeId,
				courseId : courseId,
				courseName : courseName
			};

			$
					.ajax({
						type : 'POST',
						//url: servletURL + 'TestSelectServlet',
						url : "/TestSelect",
						data : jQuery.param(myData),
						dataType : 'json',
						contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
						traditional : true,
						success : function(jsonObj) {

							var responseJson1 = jsonObj[0];
							var locationJson = eval('(' + responseJson1 + ')');

							var responseJson2 = jsonObj[1];
							var strResJSON = JSON.stringify(responseJson2);
							for (i = 0; i < responseJson2.length; i++) {
								//alert("Test : " + responseJson2[i].evaluationTypeName + "," + responseJson2[i].courseName);
							}
							//window.location.href = locationJson.location;
							window.location.href = locationJson.location
									+ "?varid="
									+ encodeURIComponent(strResJSON)
									+ "&username=" + "Anjali" + "&password="
									+ "Anjali";
						},
						error : function() {
							alert("Error");
							// document.getElementById("error").innerHTML = "Invalid email or password";
						}

					});
		}
	</script>

	<script>
		var streamIdList = [];
		var courseTypeName;

		<c:forEach items="${streamList}" var="stream">
		var div1 = document.createElement('div');
		div1.id = "tab-div";
		streamIdList.push('${stream.streamId}');
		var li = document.createElement('li');
		li.className = 'nav-item';
		li.id = '${stream.streamId}' + 'l';

		var anchor = document.createElement('a');
		anchor.setAttribute('href', "#Profile");
		anchor.setAttribute('data-toggle', "tab");
		anchor.className = 'nav-link ';
		anchor.id = '${stream.streamId}' + 'a';
		anchor.textContent = '${stream.streamName}';
		li.id = '${stream.streamId}';
		li.appendChild(anchor);
		li.setAttribute('onclick', "getStreamId(this.id)");
		div1.appendChild(li);
		document.getElementById("nav-tab").appendChild(div1);
		</c:forEach>

		var dropdown = document.createElement('div');
		dropdown.className = "dropdown";
		dropdown.id = "drop-down";
		document.getElementById('drop11').appendChild(dropdown);

		var streamElem = document.getElementById('${firstStreamId}' + 'a');
		streamElem.className = 'nav-link active';

		getStreamId(${firstStreamId});
		displayStreamCourses(courseTypeId, courseTypeName);
	</script>
</body>
</html>
