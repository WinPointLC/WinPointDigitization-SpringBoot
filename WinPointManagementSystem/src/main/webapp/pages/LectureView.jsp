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
		
		 input[type='range'] {
		 /*  box-sizing: border-box; */
		  border: 0px solid transparent;
		  padding: 0px;
		  margin: 20px;
		  width: 420px;
		  height: 50px;
		 /*  cursor: pointer;
		  background: -webkit-repeating-linear-gradient(90deg, #777, #777 1px, transparent 1px, transparent 40px) no-repeat 10% 10%;
		  background: -moz-repeating-linear-gradient(90deg, #777, #777 1px, transparent 1px, transparent 40px) no-repeat 10% 10%;
		  background: repeating-linear-gradient(90deg, #777, #777 1px, transparent 1px, transparent 40px) no-repeat 10% 10%; */
		  
		  /* background-size:0px 0px; */
		  font-size: 16px;
		} 
		input[type='range'],
		input[type='range']::-webkit-slider-runnable-track,
		input[type='range']::-webkit-slider-thumb {
		  -webkit-appearance: none;
		}
		input[type='range']::-webkit-slider-runnable-track {
		
		  width: 50%;
		  height: 5px;
		  border-radius: 2px;
		  background: #777;
		  
		}
		input[type='range']::-moz-range-track {
		 
		  width: 50%;
		  height: 5px;
		  border-radius: 2px;
		  padding: 0px;
		  background: #777;
		}
		input[type='range']::-moz-range-thumb {
		 // box-sizing: border-box;
		  padding: 0px;
		  height: 20px;
		  width: 10px;
		  border-radius: 2px;
		  border: 1px solid;
		  background: #EEE;
		}
		input[type='range']::-ms-track {
		
		  width: 50%;
		  height: 5px;
		  border-radius: 2px;
		  padding: 0px;
		  background: #777;
		  color: #777;
		}
		input[type='range']::-webkit-slider-thumb {
		  box-sizing: border-box;
		  padding: 0px;
		  height: 20px;
		  width: 10px;
		  border-radius: 2px;
		  border: 1px solid;
		  margin-top: -8px;
		  background: #EEE;
		}
		input[type='range']::-ms-thumb {
		  box-sizing: border-box;
		  padding: 0px;
		  height: 20px;
		  width: 10px;
		  border-radius: 2px;
		  border: 1px solid;
		  background: #EEE;
		}
		input[type="range"]::-ms-fill-lower {
		  background: transparent;
		}
		
		input[type='range']:focus {
		  outline: none;
		}
		
		
		.container:after {
		  position: absolute;
		  color: #777;
		 // content: '1 2 3 4 5';
		  padding: 40px;
		  word-spacing: 20px;
		  left: 0px;
		  top: 0px;
		  z-index: 100;
		}
		.container {
		  padding: 0px;
		  position: relative;
		}
		
		 
		
		output{
		  display: block;
		  margin-top: 20px;
		  color: #777;
		}
		output:before{
		  content:"Lecture Number:   ";
		 // margin-top:40%;
		  font-weight: bold;
		  color:white;
		  font-size:16px;
		 text-decoration: underline;
		}
		/* body {
		  font-family: Calibri, Arial;
		} */
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
			<div class="card card-nav-tabs" style="display: none;background:#9C38AE;" id="lec_view_card" >
				<!--<h3 class="card-header card-header-primary text-center">Lecture View</h3>-->
				<br></br>
				<!--<h4 class="text-left">Current Lectures : 10</h4>-->
					<div class="table-responsive" id="table-lecture-view" >
				
					</div> 
					<div id="currentlec-label" style="margin-left:5%;color:white" >
					
					</div>
					<table>
						<tr>
							<td><div id="start-date-btn" style="margin-left:10%;">
					
							</div></td>
							
							<td>
							<!-- <div id="myProgress" style="width:150%;">
							  <div id="myBar"></div>
							</div> -->
							<div class="container" id="slider_lec"  ></div>
							</td>
							<td><div id="end-date-btn" style="margin-left:-750px;" >
					
							</div><br></td>
						</tr>
						
						<tr>
							
							<td><button type="button" class="btn btn-secondary"  style="width:60%;margin-left:10%;" onclick="progressTracker()">
							Progress<br> Tracker</button>
							</td>
							
							<td><div id="lecture-view-controls" >
					
							</div></td>		
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Fees Records</button></td>
							<td rowspan="3">
								<label for="exampleFormControlTextarea1" style="color:white" >Course Plan</label>
						<textarea class="form-control" id="courseplan" style="width:100%;background:white" rows="10"></textarea>
						
							</td>
						
						<td><div id="lecture-date-label" style="margin-left:-700px;color:white;">
					
							</div></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;" onclick="AttendanceScreen()">Attendance<br>Records</button></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;" onclick="AssignmentsScreen()">Assignments</button></td>
							<td><div id="session-duration-label" style="margin-left:-700px;color:white;">
					
							</div></td>
							
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;">Feedback</button></td>
							<td rowspan="3">
								<label for="exampleFormControlTextarea1" style="color:white">Lecture Coverage</label>
						<textarea class="form-control" id="lec_coverage" style="width:100%;background:white" rows="10"></textarea>
							</td>
							<td><div id="start-time-label" style="margin-left:-700px;color:white;">
					
							</div></td>
							

						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;" >Evaluation</button></td>
						</tr>
						<tr>
							<td><button type="button" class="btn btn-secondary" style="width:60%;margin-left:10%;" onclick="EditBatchDetails()">Edit Batch<br> Details</button></td>
							
							<td><div id="class-strength-label" style="margin-left:-700px;color:white;">
					
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
			var batchId;
			var total_lecs;
			var current_lec;
			var lec_date;
			var session_duration;
			var class_strength;
			var start_time;
			var lectdate;
			var sessionduration;
			var starttime;
			var jsonObj;
			function getBatchId(batch_id){
				
				batchId = batch_id.substring(0, batch_id.length - 1);
				
				batchElem = document.getElementById(batch_id);

				document.getElementById('dropdownMenuButtonBatch').textContent = batchElem.textContent;
				document.getElementById('lec_view_card').style.display = "block";

			
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
							//alert(jsonObj.mappingCourse.mappingCoursePlans[0].mappingLecutreTopicPlan);
							//alert(jsonObj.mappingCourse.mappingCoursePlans[1].mappingLecutreTopicPlan);
							//alert(jsonObj.mappingStudentCourseDetails);
							//alert(jsonObj.mappingLecture[0].mappingTopicsCovered);
							
							
							lectureDetails=jsonObj;
							document.getElementById('lec_view_card').style.display = "block";

							current_lec=lectureDetails.currentLectureNumber;

							var elem = document.getElementById('details-lectureview');
							if(elem!=null){
								elem.parentNode.removeChild(elem);
							}

							
							
							var table = document.createElement('table');
							table.className="table table-hover";
							table.id="details-lectureview";
							var thead = document.createElement('thead');
										
							var tbody = document.createElement('tbody');

							document.getElementById('courseplan').textContent='';
							
						 	for(var i=0;i<jsonObj.mappingCourse.mappingCoursePlans.length;i++)
							{
								
								if(jsonObj.mappingCourse.mappingCoursePlans[i].lectureNumber==current_lec)
								{
									//alert(i);
									//alert(jsonObj.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan);
									for(var j=0;j<jsonObj.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan.length;j++)
									{
										var topicName=jsonObj.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan[j].topicName;
										//alert(jsonObj.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan[j].topicName);
										document.getElementById('courseplan').textContent=document.getElementById('courseplan').textContent+topicName+'\n';
										//document.getElementById('courseplan').style.color="white";
									}
									
									//alert(jsonObj.mappingStudentCourseDetails.length);
									
								}
						
							}
							
							
 

						 for(var i=0;i<jsonObj.mappingLecture.length;i++)
							{
								//alert(jsonObj.mappingLecture[i].lectureNumber);
								if(jsonObj.mappingLecture[i].lectureNumber==current_lec)
								{
									
									for(var j=0;j<jsonObj.mappingLecture[i].mappingTopicsCovered.length;j++)
									{
										var topicName=jsonObj.mappingLecture[i].mappingTopicsCovered[j].topicName;
										//alert(topicName);
										document.getElementById('lec_coverage').textContent=document.getElementById('lec_coverage').textContent+topicName+'\n';
										//document.getElementById('lec_coverage').style.color="white";
									}
									
									lec_date=jsonObj.mappingLecture[i].lectureDate;
									session_duration=jsonObj.mappingLecture[i].lectureDuration;
									start_time=jsonObj.mappingLecture[i].startTime;
									
								}
						
							}

 							class_strength=lectureDetails.mappingStudentCourseDetails.length;
							total_lecs=lectureDetails.totalNumberOfLectures;
							
							var range_slider=document.createElement('input');
							range_slider.setAttribute('type','range');
							//range_slider.setAttribute('style',"width:600px");
							range_slider.setAttribute('min',0);
							range_slider.setAttribute('max',total_lecs);
							range_slider.setAttribute('value',current_lec);		
							
							range_slider.setAttribute('step',1);
							
							range_slider.id='rangeInput';
							document.getElementById('slider_lec').appendChild(range_slider);
							
							var range_slider_output=document.createElement('output');
							document.getElementById('slider_lec').appendChild(range_slider_output);
							range_slider_output.setAttribute('for',"rangeInput");
							range_slider_output.id="output";
							range_slider_output.textContent=current_lec;
							range_slider_output.style.color="white";
							
							document.getElementById('lecture-view-controls').appendChild(range_slider_output);
							//range_slider.setAttribute('oninput',range_slider_output.value = range_slider.value);
							range_slider.setAttribute('oninput',"sliderVal()");
								
							var td=document.createElement('td');
							var h4=document.createElement('h4');
							td.appendChild(h4);
							var currentlec=document.createElement('h4');
							//currentlec.textContent="Current Lecture: 10";
							currentlec.textContent="Current Lecture: " + lectureDetails.currentLectureNumber;
							//currentlec.style.text-decoration = "underline";
							currentlec.setAttribute('style', "text-decoration: underline")
							h4.appendChild(currentlec);
								
							document.getElementById('currentlec-label').appendChild(td);		
							
							var td2=document.createElement('td');
							var startdateBtn=document.createElement('btn');
								startdateBtn.className="btn btn-secondary";
								//startdateBtn.textContent="Start Date 2nd Oct2019";
								startDate=format(lectureDetails.beginDate);
								startdateBtn.textContent="Start Date : "+startDate;
								//startdateBtn.style.width="50";
								startdateBtn.style.height="60px";
								startdateBtn.style.backgroundColor="secondary";
								startdateBtn.style.color="black";
								startdateBtn.style.fontSize="16px";
								td2.appendChild(startdateBtn);
							
							document.getElementById('start-date-btn').appendChild(td2);
							
							var td3=document.createElement('td');
							var enddateBtn=document.createElement('btn');
								enddateBtn.className="btn btn-secondary";
								//enddateBtn.textContent="End Date 2nd Jan 2020";
								endDate=format(lectureDetails.endDate);
								enddateBtn.textContent="End Date : "+endDate;
								enddateBtn.style.marginLeft="334%";
								enddateBtn.style.marginTop="30px";
								enddateBtn.style.height="60px";
								enddateBtn.style.backgroundColor="secondary";
								enddateBtn.style.color="black";
								enddateBtn.style.fontSize="16px";
								td3.appendChild(enddateBtn);
							
							document.getElementById('end-date-btn').appendChild(td3);
							
							var td4=document.createElement('td');
							lectdate=document.createElement('label');
								//td.appendChild(lectdate);
								lectdate.textContent="Lecture Date : "+lec_date;
								lectdate.id="lecDate"
								lectdate.style.marginLeft="740px";
								
								lectdate.style.color="white";
								td4.appendChild(lectdate);
								//tbody.appendChild(lectdate);
								
							document.getElementById('lecture-date-label').appendChild(td4);
							
							var td5=document.createElement('td');
							sessionduration=document.createElement('label');
								//td.appendChild(lectdate);
								sessionduration.textContent="Session Duration : "+session_duration;
								sessionduration.style.marginLeft="740px";
								
								sessionduration.id="lec_duration";
								sessionduration.style.color="white";
								td5.appendChild(sessionduration);
								//tbody.appendChild(lectdate);
								
							document.getElementById('session-duration-label').appendChild(td5);
							
							var td6=document.createElement('td');
							starttime=document.createElement('label');
								//td.appendChild(lectdate);
								starttime.textContent="Start Time : "+start_time;
								starttime.id="startTime"
								starttime.style.marginLeft="740px";
								starttime.style.color="white";
								td6.appendChild(starttime);
								//tbody.appendChild(lectdate);
								
							document.getElementById('start-time-label').appendChild(td6);
							
							var td7=document.createElement('td');
							var strength=document.createElement('label');
								//td.appendChild(lectdate);
								strength.textContent="Class Strength : "+class_strength;
								strength.style.marginLeft="740px";
								strength.style.color="white";
								td7.appendChild(strength);
								//tbody.appendChild(lectdate);
							document.getElementById('class-strength-label').appendChild(td7);
							
							table.appendChild(tbody);
							
							document.getElementById('table-lecture-view').appendChild(table);

							
					}

				});  
			}

			function progressTracker() {
				//alert(batchId);
			   window.location.href="ProgressTracker?batchId="+batchId;
			}

			function AttendanceScreen() {
				//alert(batchId);
			   window.location.href="AttendaceRecordsPage?batchId="+batchId;
			}

			function EditBatchDetails() {
				//alert(batchId);
			   window.location.href="EditBatchDetailsPage?batchId="+batchId;
			}

			function AssignmentsScreen() {
				//alert(batchId);
			   window.location.href="CoursewareAndAssignmentPage?batchId="+batchId;
			}

			function format(inputDate) {
			    var date = new Date(inputDate);
			    if (!isNaN(date.getTime())) {
			        // Months use 0 index.
			        return date.getDate()  + '-' + (parseInt(date.getMonth())+1 )+ '-' + date.getFullYear();
			    }
			}

			function sliderVal(){
				//alert(lectureDetails);
				//alert(document.getElementById('rangeInput').value);
				document.getElementById('output').textContent=document.getElementById('rangeInput').value;
				
				document.getElementById('courseplan').textContent='';
				
				 for(var i=0;i<lectureDetails.mappingCourse.mappingCoursePlans.length;i++)
				{
					if(lectureDetails.mappingCourse.mappingCoursePlans[i].lectureNumber==document.getElementById('rangeInput').value)
					{
						//alert(lectureDetails.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan);
						for(var j=0;j<lectureDetails.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan.length;j++)
						{
							var topicName=lectureDetails.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan[j].topicName;
							//alert(lectureDetails.mappingCourse.mappingCoursePlans[i].mappingLecutreTopicPlan[j].topicName);
							document.getElementById('courseplan').textContent=document.getElementById('courseplan').textContent+topicName+'\n';
							
						}
					}
			
				} 
				
				document.getElementById('lec_coverage').textContent='';
				//lectdate.id="lecDate"
				document.getElementById('lecDate').textContent="Lecture Date : ";
				sessionduration.textContent="Session Duration : ";
				starttime.textContent="Start Time : ";
				
				for(var i=0;i<lectureDetails.mappingLecture.length;i++)
				{
					if(lectureDetails.mappingLecture[i].lectureNumber==document.getElementById('rangeInput').value)
					{
						
						for(var j=0;j<lectureDetails.mappingLecture[i].mappingTopicsCovered.length;j++)
						{
							var topicName=lectureDetails.mappingLecture[i].mappingTopicsCovered[j].topicName;
							//alert(topicName);
							
							document.getElementById('lec_coverage').textContent=document.getElementById('lec_coverage').textContent+topicName+'\n';
							
						}
						
						lec_date=lectureDetails.mappingLecture[i].lectureDate;
						session_duration=lectureDetails.mappingLecture[i].lectureDuration;
						start_time=lectureDetails.mappingLecture[i].startTime;
						lecDate.style.color="white";
						lecDate.textContent="Lecture Date : "+lec_date;
						//document.getElementById(lecDate).textContent=lec_date;
						sessionduration.textContent="Session Duration : "+session_duration;
						sessionduration.style.color="white";
						starttime.textContent="Start Time : "+start_time;
						starttime.style.color="white";
						
						
						
						
					}
		
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