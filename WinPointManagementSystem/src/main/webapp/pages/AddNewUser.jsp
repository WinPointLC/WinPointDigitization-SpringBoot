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
            <link rel="stylesheet" href="../css/Dashboard.css">
              <!-- <link rel="stylesheet" href="../css/EmployeeDashboard.css"> -->
              <script type="text/javascript" src="../js/WinPointScripts.js"></script>
            </head>

            <body>
              <div class="add-new-user-content" id="add-new-user-content">
                <div class="container-fluid">
                  <div class="col-sm-4 col-md-4 col-lg-12 text-left ml-auto mr-auto" id="form-outter">
                    <form name="form1">
                      <h3 class="form-signup-heading text-center">SignUP Form</h3>
                    <!--   <div class="form-group">
                        <select class="form-control AddUser" name="dropdown" required>
                          <option>Select which user to create</option>
                          <option>Add Admin</option>
                          <option>Add Student</option>
                        </select>
                      </div> -->
                      <div class="form-group">
                        <input class="form-control" type="text" id="firstName" placeholder="Enter first name" required>
                        </div>
                        <div class="form-group">
                          <input class="form-control" type="text" id="lastName" placeholder="Enter last name" required>
                          </div>

                          <div class="form-group">
                            <input class="form-control" type="email" id="email" placeholder="Enter email" required>
                            </div>

                            <div class="form-group">
                              <input class="form-control form-control-sm" type="text" id="userName" placeholder="Enter user name" required>
                              </div>

                              <div class="form-group">
                                <input  type="password" id="password" class="form-control" placeholder="Password" required>
                                </div>
                                <div class="form-group">
                                 <label class="label-control">Gender</label>
                                  <select class="form-control" id="gender" required>
                                    <!--  <option value="">Gender</option>-->
                                    <option>Male</option>
                                    <option>Female</option>
                                  </select>
                                </div>
                                <div class="form-group">
                                  <%-- <input type="text" id="mobileNumber" class="form-control" placeholder="Mobile Number" pattern="[0-9]{10}" title="You can enter 10 digits only"> --%>
                                  <input type="text" id="mobileNumber" class="form-control" placeholder="Mobile Number">
                                  </div>
                                  
                               
                                  <div class="form-group">
                                  <label class="label-control">Security Question</label>
                                    <select class="form-control" id="securityQuestion" required>
                                      <!--  <option value="">Security Question</option>-->
                                    </select>
                                  </div>
                                  <script> var selectVar = document.getElementById('securityQuestion');</script>
                                  <c:forEach var="securityQuestion" items= "${securityQuestions}" varStatus="i">
                                    <script>

                                    var option = document.createElement('option');
                                    option.textContent = "${securityQuestion.securityQuestion}";
                                    option.value="${securityQuestion.securityQuestion}"
                                    selectVar.appendChild(option);
                                    </script>
                                  </c:forEach>
                                  

                                <div class="form-group">
                                  <input class="form-control" type="text" id="securityAnswer" placeholder="Security Answer" required>
                                  </div>
                                  
                                    <div class="form-group">
                                  <label class="label-control">Available Time</label>
                                    <select class="form-control" id="avail_time" required>
                                      
                                    </select>
                                  </div>
                                  
                                    <script> var selectVar = document.getElementById('avail_time');</script>
                                  <c:forEach var="availableTime" items= "${availableTimeList}" varStatus="i">
                                    <script>

                                    var option = document.createElement('option');
                                    option.textContent = "${availableTime.timeSlotsDescription}";
                                    option.value="${availableTime.timeSlotsDescription}"
                                    selectVar.appendChild(option);
                                    </script>
                                  </c:forEach>
                                  
                                   <div class="form-group">
                                  <label class="label-control">Segment Type</label>
                                    <select class="form-control" id="Seg_type" required>
                                      
                                    </select>
                                  </div>
                                  <script> var selectVar = document.getElementById('Seg_type');</script>
                                  <c:forEach var="segmentType" items= "${segmentTypeList}" varStatus="i">
                                    <script>

                                    var option = document.createElement('option');
                                    option.textContent = "${segmentType.segmentTypeName}";
                                    option.value="${segmentType.segmentTypeName}"
                                    selectVar.appendChild(option);
                                    </script>
                                  </c:forEach>
                                  <br>
                                    <a href="#" onclick="submitSignUpDetails()"><button class="Signbtn" type="button">Submit</button></a>
                                  </form>
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
                              <script>
                              $(document).ready(function() {
                                $().ready(function() {
                                  $sidebar = $('.sidebar');

                                  $sidebar_img_container = $sidebar.find('.sidebar-background');

                                  $full_page = $('.full-page');

                                  $sidebar_responsive = $('body > .navbar-collapse');

                                  window_width = $(window).width();

                                  fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();

                                  if (window_width > 767 && fixed_plugin_open == 'Dashboard') {
                                    if ($('.fixed-plugin .dropdown').hasClass('show-dropdown')) {
                                      $('.fixed-plugin .dropdown').addClass('open');
                                    }

                                  }

                                  $('.fixed-plugin a').click(function(event) {
                                    // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active
                                    if ($(this).hasClass('switch-trigger')) {
                                      if (event.stopPropagation) {
                                        event.stopPropagation();
                                      } else if (window.event) {
                                        window.event.cancelBubble = true;
                                      }
                                    }
                                  });

                                  $('.fixed-plugin .active-color span').click(function() {
                                    $full_page_background = $('.full-page-background');

                                    $(this).siblings().removeClass('active');
                                    $(this).addClass('active');

                                    var new_color = $(this).data('color');

                                    if ($sidebar.length != 0) {
                                      $sidebar.attr('data-color', new_color);
                                    }

                                    if ($full_page.length != 0) {
                                      $full_page.attr('filter-color', new_color);
                                    }

                                    if ($sidebar_responsive.length != 0) {
                                      $sidebar_responsive.attr('data-color', new_color);
                                    }
                                  });

                                  $('.fixed-plugin .background-color .badge').click(function() {
                                    $(this).siblings().removeClass('active');
                                    $(this).addClass('active');

                                    var new_color = $(this).data('background-color');

                                    if ($sidebar.length != 0) {
                                      $sidebar.attr('data-background-color', new_color);
                                    }
                                  });

                                  $('.fixed-plugin .img-holder').click(function() {
                                    $full_page_background = $('.full-page-background');

                                    $(this).parent('li').siblings().removeClass('active');
                                    $(this).parent('li').addClass('active');


                                    var new_image = $(this).find("img").attr('src');

                                    if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
                                      $sidebar_img_container.fadeOut('fast', function() {
                                        $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
                                        $sidebar_img_container.fadeIn('fast');
                                      });
                                    }

                                    if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
                                      var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

                                      $full_page_background.fadeOut('fast', function() {
                                        $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
                                        $full_page_background.fadeIn('fast');
                                      });
                                    }

                                    if ($('.switch-sidebar-image input:checked').length == 0) {
                                      var new_image = $('.fixed-plugin li.active .img-holder').find("img").attr('src');
                                      var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

                                      $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
                                      $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
                                    }

                                    if ($sidebar_responsive.length != 0) {
                                      $sidebar_responsive.css('background-image', 'url("' + new_image + '")');
                                    }
                                  });

                                  $('.switch-sidebar-image input').change(function() {
                                    $full_page_background = $('.full-page-background');

                                    $input = $(this);

                                    if ($input.is(':checked')) {
                                      if ($sidebar_img_container.length != 0) {
                                        $sidebar_img_container.fadeIn('fast');
                                        $sidebar.attr('data-image', '#');
                                      }

                                      if ($full_page_background.length != 0) {
                                        $full_page_background.fadeIn('fast');
                                        $full_page.attr('data-image', '#');
                                      }

                                      background_image = true;
                                    } else {
                                      if ($sidebar_img_container.length != 0) {
                                        $sidebar.removeAttr('data-image');
                                        $sidebar_img_container.fadeOut('fast');
                                      }

                                      if ($full_page_background.length != 0) {
                                        $full_page.removeAttr('data-image', '#');
                                        $full_page_background.fadeOut('fast');
                                      }

                                      background_image = false;
                                    }
                                  });

                                  $('.switch-sidebar-mini input').change(function() {
                                    $body = $('body');

                                    $input = $(this);

                                    if (md.misc.sidebar_mini_active == true) {
                                      $('body').removeClass('sidebar-mini');
                                      md.misc.sidebar_mini_active = false;

                                      $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();

                                    } else {

                                      $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');

                                      setTimeout(function() {
                                        $('body').addClass('sidebar-mini');

                                        md.misc.sidebar_mini_active = true;
                                      }, 300);
                                    }

                                    // we simulate the window Resize so the charts will get updated in realtime.
                                    var simulateWindowResize = setInterval(function() {
                                      window.dispatchEvent(new Event('resize'));
                                    }, 180);

                                    // we stop the simulation of Window Resize after the animations are completed
                                    setTimeout(function() {
                                      clearInterval(simulateWindowResize);
                                    }, 1000);

                                  });
                                });
                              });
								</script>
								
								<script>

								var securityQuestionId;
								var timeSlotsId;
								var securityQuestion
								var timeSlotsDescription;
								var segmentTypeName;
								var segmentTypeId;
								 var createdBy = null;
							     var createdDate=null;
		     function submitSignUpDetails(){
		       alert("Submit Sign Up Details");
		       //alert($('#securityQuestion').val());
		    	 <c:forEach items="${availableTimeList}" var="availableTime">
					if(document.getElementById("avail_time").value=='${availableTime.timeSlotsDescription}'){
						
						timeSlotsId='${availableTime.timeSlotsId}';
						timeSlotsDescription='${availableTime.timeSlotsDescription}';
					}
				</c:forEach>   
		
				var mappingTimeSlots={
						timeSlotsId:timeSlotsId,
						timeSlotsDescription:timeSlotsDescription
		
				}


				 <c:forEach items="${segmentTypeList}" var="segmentType">
				if(document.getElementById("Seg_type").value=='${segmentType.segmentTypeName}'){
					
					segmentTypeId='${segmentType.segmentTypeId}';
					segmentTypeName='${segmentType.segmentTypeName}';
				}
			</c:forEach>   
	
			var mappingSegmentType={
					segmentTypeId:segmentTypeId,
					segmentTypeName:segmentTypeName
	
			}
			
				<c:forEach items="${securityQuestions}" var="securityQuestion">
				if(document.getElementById("securityQuestion").value=='${securityQuestion.securityQuestion}'){
					//	alert('${securityQuestion.securityQuestionId}');
					securityQuestionId='${securityQuestion.securityQuestionId}';
					securityQuestion='${securityQuestion.securityQuestion}';
				}
			</c:forEach>   

			var mappingSecurityQuestions={
					securityQuestionId:securityQuestionId,
					securityQuestion:securityQuestion
	
			}
		       
		       var firstName = $('#firstName').val();
		       var lastName = $('#lastName').val();
		       var email = $('#email').val();
		       var password = $('#password').val();
		       var gender = $('#gender').val();
		       var mobileNumber = $('#mobileNumber').val();
		       var securityQuestion = $('#securityQuestion').val();
		       var securityAnswer =  $('#securityAnswer').val();
		      // alert(securityAnswer);
		       var userCategoryId = 2;
		       var userCategoryName="Admin";
		      

		       var mappingUserCategory={
		    		   userCategoryId:userCategoryId,
		    		   userCategoryName:userCategoryName,
		    		   createdBy:createdBy,
		    			createdDate:createdDate
		
				}
		       //alert(gender);
		       var myData = {
		
		    	   firstName: firstName,
		    	   lastName: lastName,
		    	   emailId: email,
		    	   password: password,
		           gender:gender,
		           mobileNumber: mobileNumber,
		           securityQuestion: securityQuestion,
		           securityAnswer: securityAnswer,
		           mappingSecurityQuestions:mappingSecurityQuestions,
		           mappingSegmentType:mappingSegmentType,
		           mappingTimeSlots:mappingTimeSlots,
		           mappingUserCategory:mappingUserCategory
		         //  userCategoryId: userCategoryId
		         };
		     //alert("*** " + JSON.stringify(myData));
		     //console.log(myData);
		     $.ajax({
		         type: 'POST',
		         //url: servletURL + 'SignUpServlet',
		         url: "/saveNewUser",
		         data: JSON.stringify(myData),
		        // dataType: 'json',
		         contentType: 'application/json; charset=utf-8',
		         traditional: true,
		         success: function () {
		          
		          }
		
		     });
			
		     location.reload();

		     validator();
		  }
		
		  function validator() {
			  //alert("here");
		    var ffname = document.getElementById('firstName').value;
		    var llname = document.getElementById('lastName').value;
		    var email = document.getElementById('email').value;
		    var uname = document.getElementById('userName').value;
		    var pass = document.getElementById('password').value;
		    var mobileNumber = document.getElementById('mobileNumber').value;
		
		    if (ffname == "") {
		      alert("Enter the firstName");
		    }
		    else if(llname==""){
		      alert("Enter the LastName");
		    }
		    else if(email==""){
		      alert("Enter the emailName");
		    }
		    else if(uname==""){
		      alert("Enter the UserName");
		    }
		    else if(pass==""){
		      alert("Enter the Password");
		    }
		    else if(mobileNumber==""){
		      alert("Enter the Mobile Number");
		    }
		    Mobilevalidator();
		  }
		  //code for Mobile Validation
		  function Mobilevalidator() {
		
		       var mobile = document.getElementById("mobileNumber").value;
		       var pattern = /^[7-9][0-9]{9}$/;
		       if (pattern.test(mobile)) {
		           return true;
		       }
		       return false;
		
		   }
		  </script>
                              </body>
