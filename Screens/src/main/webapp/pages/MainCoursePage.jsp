<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Main Course Page</title>
    <meta charset="utf-8">
      <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
          <link rel="stylesheet" href="../assets/css/fontawesome.min.css">
            <!-- Material Kit CSS -->
            <link href="../assets/css/material-dashboard.css?v=2.1.1" rel="stylesheet"/>
            <link rel="stylesheet" href="../css/MainCoursePage.css">
            <script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
            </head>
            <body>
              <div class="container-fluid">
                <!-- your content here -->
                <div class="row">
                  <div class="col-sm-12 col-md-12 col-lg-12">
                    <div class="card-header heading">
                      <h3>Tests Offered</h3>
                    </div>
                  </div>
                </div>

                <div class="row">
                  <div class="col-md-11 col-lg-11">
                    <!--     <div class="card"> -->
                    <div class="card">
                      <div class="card-header card-header-tabs card-header" style="background-color:rgb(148, 21, 193);">
                        <div class="nav-tabs-navigation">
                          <div class="nav-tabs-wrapper">

                            <ul class="nav nav-tabs" data-tabs="tabs" id="nav-tab">

                            </ul>
                          </div>
                        </div>
                      </div>
                      <div id="drop11" class="dropdown drop1">

                      </div>
                    </div>
                    <div class="card" style="display:none;" id="CourseCard" >
                      <div class="card-body" id="courses">
                        <div class="tab-content" id="tab-content">
                          <div class="tab-pane active" id="profile"><br><br>
                            
                             <div class="row" id='courseList'></div>
                         
                          </div>

                              <div class="tab-pane" id="messages">
                              
                              <div class="row">
                                <div class="col-lg-3 col-md-6 col-sm-6 column1">
                                  <div class="card card-stats">
                                    <div class="card-header card-header-icon">
                                      <div class="card-icon" style="font-size:20px; background-color:rgb(0, 208, 139);" id="row1-card1">
                                        <i class="material-icons">sort_by_alpha</i>
                                      </div>
                                      <a href="TestSelectPage" ><p class="card-category">English Language Skills</p></a>
                                    </div>

                                  </div>
                                </div>
                                <div class="col-lg-3 col-md-6 col-sm-6 column2">
                                  <div class="card card-stats">
                                    <div class="card-header card-header-icon">
                                      <div class="card-icon" style="font-size:20px; background-color:rgb(180, 3, 136);" id="row1-card1">
                                        <i class="material-icons">record_voice_over</i>
                                      </div>
                                      <a href="TestSelectPage" ><p class="card-category">Oral Communication</p></a>
                                    </div>

                                  </div>
                                </div>
                                <div class="col-lg-3 col-md-6 col-sm-6 column3">
                                  <div class="card card-stats">
                                    <div class="card-header card-header-danger card-header-icon">

                                      <div class="card-icon">
                                        <i class="material-icons">how_to_reg</i>
                                      </div>
                                      <a href="TestSelectPage" >    <p class="card-category">Personality Development</p></a>
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
                                    <div class="card-icon" style="font-size:20px; background-color:rgb(111, 209, 13)" id="row1-card1">
                                      <i class="material-icons">exposure</i>
                                    </div>
                                    <a href="TestSelectPage" ><p class="card-category">Quantitative Aptitude</p></a>
                                  </div>

                                </div>
                              </div>
                              <div class="col-lg-3 col-md-6 col-sm-6 column2">
                                <div class="card card-stats">
                                  <div class="card-header card-header-info card-header-icon">
                                    <div class="card-icon" style="font-size:20px;">
                                      <i class="material-icons">extension</i>
                                    </div>
                                    <a href="TestSelectPage" ><p class="card-category">Logical Reasoning</p></a>
                                  </div>

                                </div>
                              </div>
                              <div class="col-lg-3 col-md-6 col-sm-6 column3">
                                <div class="card card-stats">
                                  <div class="card-header card-header-icon">

                                    <div class="card-icon" style="background-color:rgb(218, 113, 31);">
                                      <i class="material-icons">find_in_page</i>
                                    </div>
                                    <a href="TestSelectPage" ><p class="card-category">Verbal Reasoning</p></a>
                                  </div>
                                </div>
                              </div>
                              <div class="col-lg-3 col-md-6 col-sm-6 column4">
                                <div class="card card-stats">
                                  <div class="card-header card-header-icon">
                                    <div class="card-icon" style="font-size:20px; background-color:rgb(251, 26, 30);">
                                      <i class="material-icons">spellcheck</i>
                                    </div>
                                    <a href="TestSelectPage" ><p class="card-category">Verbal Ability</p></a>
                                  </div>

                                </div>

                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div><!-- End card div -->


                  </div>
                </div>
              </div>
              <script>
             
		  			//streamList = eval('(' + '${streamlist}' + ')');
		  			//streamList = '${streamList}';
		  			
		  			var streamIdList=[];
		  			
		  			<c:forEach items="${streamList}" var="stream">
			  			  var div1 = document.createElement('div');
			              div1.id="tab-div";
			              streamIdList.push('${stream.streamId}');
			              var li = document.createElement('li');
			              li.className='nav-item';
			              li.id = '${stream.streamId}' + 'l';
			
			              var anchor =document.createElement('a');
			              anchor.setAttribute('href',"#Profile");
			              anchor.setAttribute('data-toggle',"tab");
			              anchor.className='nav-link ';
			              anchor.id = '${stream.streamId}' + 'a';
			              anchor.textContent='${stream.streamName}';
			              li.id = '${stream.streamId}';
			             // alert("Li id = " + li.id);
			              li.appendChild(anchor);
			              li.setAttribute('onclick', "getStreamId(this.id)");
			              div1.appendChild(li);
			              document.getElementById("nav-tab").appendChild(div1);
					</c:forEach>   
		
		            var streamElem = document.getElementById('${firstStreamId}' + 'a');
		            streamElem.className='nav-link active';
		            
		            var drop1 = document.getElementsByClassName('drop1');
		            var btn = document.createElement('button');
		            btn.className='btn btn-secondary dropdown-toggle';
		            btn.id='dropdownMenuButton';
		            btn.setAttribute('data-toggle', "dropdown");
		            btn.setAttribute('aria-haspopup', "true");
		            btn.setAttribute('aria-expanded',"false");
		            btn.textContent="Course Category";
		            document.getElementById('drop11').appendChild(btn);
		           
		            var dropdownMenu = document.createElement('div');
		            dropdownMenu.className='dropdown-menu';
		            dropdownMenu.id='dropdownMenu';
		            dropdownMenu.setAttribute('aria-labelledby',"dropdownMenuButton");
		            
		            //Start- Extract Course Type List
		            /* var courseTypes = decodedData.substring(decodedData.indexOf(']')+1, decodedData.length);
		            var courseTypesList = eval('(' + courseTypes + ')');
		            // var arr2 = ['Modular','TBC','CRT'];
		            for(i=0; i<courseTypesList.length; i++){
		              var dropanchor = document.createElement('a');
		              dropanchor.className='dropdown-item';
		              dropanchor.setAttribute('href',"#");
		              dropanchor.id=courseTypesList[i].courseTypeId;
		              dropanchor.textContent=(courseTypesList[i].courseTypeName).toUpperCase();
		              dropanchor.setAttribute('onclick',"displayStreamCourses(this.id, this.textContent)");
		
		              dropdownMenu.appendChild(dropanchor);
		              // alert(courseTypesList[i].courseTypeId + ":" + courseTypesList[i].courseTypeName)
		            } */

		           <c:forEach items="${courseTypesList}" var="courseType">  	 
		              var dropanchor = document.createElement('a');
		              dropanchor.className='dropdown-item';
		              dropanchor.setAttribute('href',"#");
		              dropanchor.id='${courseType.courseTypeId}';
		           
		              dropanchor.textContent=('${courseType.courseTypeName}').toUpperCase();
		              dropanchor.setAttribute('onclick',"displayStreamCourses(this.id, this.textContent)");
		              dropdownMenu.appendChild(dropanchor);
				  </c:forEach>
				 
		          document.getElementById('drop11').appendChild(dropdownMenu);
		         
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
      
      //alert(streamList[i].streamId + ":" + streamList[i].streamName);
     
      var streamId=1;
      var courseTypeId;

      function getStreamId(stream_id){
    	  streamId = stream_id;
        
        var streamElem = document.getElementById(streamId + 'a');
        var elem;
         for(i=0; i<streamIdList.length; i++){
        	elem = document.getElementById(streamIdList[i] + 'a');
        	 elem.className = 'nav-link';
        } 

        /* <c:forEach items="${streamList}" var="stream">
		     elem = document.getElementById('${stream.streamId}' + 'a');
		   	 elem.className = 'nav-link';
	    </c:forEach>   */
	    
        streamElem.className = 'nav-link active';
       
        elem = document.getElementById('courseList');
        if(elem != null){
        	elem.parentNode.removeChild(elem);
        }        
        
        var myData = {
        	streamId: streamId	
        };
        $.ajax({
            type: 'POST',
           // url: servletURL + 'StreamCourseTypeServlet',
            url: "/StreamCourseType",
            data: jQuery.param(myData),
            dataType: 'json',
            contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
            traditional: true,
            success: function (jsonObj) {
              var courseTypesList=jsonObj;
             // alert(courseTypesList.length);
             
	            elem = document.getElementById('dropdownMenu');
	            if(elem != null){
	            	elem.parentNode.removeChild(elem);
	            }
	            
	            var elem = document.getElementById('dropdownMenuButton');
	            elem.parentNode.removeChild(elem);
	            
	            //var drop1 = document.getElementsByClassName('drop1');
	            var btn = document.createElement('button');
	            btn.className='btn btn-secondary dropdown-toggle';
	            btn.id='dropdownMenuButton';
	            btn.setAttribute('data-toggle', "dropdown");
	            btn.setAttribute('aria-haspopup', "true");
	            btn.setAttribute('aria-expanded',"false");
	            btn.textContent="Course Category";
	            document.getElementById('drop11').appendChild(btn);

			 
              var dropdownMenu = document.createElement('div');
              dropdownMenu.className='dropdown-menu';
              dropdownMenu.id='dropdownMenu';
              dropdownMenu.setAttribute('aria-labelledby',"dropdownMenuButton");
              for(i=0; i<courseTypesList.length; i++){
            	//  alert(courseTypesList[i].courseTypeName);
                  var dropanchor = document.createElement('a');
                  dropanchor.className='dropdown-item';
                  dropanchor.setAttribute('href',"#");
                  dropanchor.id=courseTypesList[i].courseTypeId;
                  var courseTypeName = (courseTypesList[i].courseTypeName).toUpperCase();
                  //alert(courseTypeName);
                  dropanchor.textContent=courseTypeName;
                  dropanchor.setAttribute('onclick',"displayStreamCourses(this.id, this.textContent)");

                  dropdownMenu.appendChild(dropanchor);
                  // alert(courseTypesList[i].courseTypeId + ":" + courseTypesList[i].courseTypeName)
                }

              document.getElementById('drop11').appendChild(dropdownMenu);
            },
            error: function(){
              alert("Error");
              //document.getElementById("error").innerHTML = "Invalid email or password";
            }


          });
        
      }

      function displayStreamCourses(courseType_id, courseTypeName ){

    	  var responseJson=[
  			{
  				courseId:"1",
  				courseName:"c"
  				
  				
  			},
  			{
  				courseId:"2",
  				courseName:"ds"
  				
  				
  			}
  			
  			]
          //var streamId = stream_id;
          courseTypeId = courseType_id;
          //alert("stream_id = " + streamId + "courseType_id = " + courseType_id);
          
            document.getElementById('dropdownMenuButton').textContent = courseTypeName;
          
         
              document.getElementById('CourseCard').style.display="block";
              //var responseJson=jsonObj;
             
              var elem = document.getElementById('courseList');
              if(elem != null){
              	elem.parentNode.removeChild(elem);
              }
              //document.getElementById('profile').removeChild(document.getElementById('xyz'));

              for(i=0; i<(responseJson.length); i=i+3){
                var row  = document.createElement('div');
                row.className='row';
                row.id="courseList";
                for(j=i; j<i+3 && j<responseJson.length; j++){
                  //alert("course : " + responseJson[j].courseId + "," + responseJson[j].courseName + "," + responseJson[j].iconLocation);
                  var column = document.createElement('div');
                  column.className='col-lg-3 col-md-6 col-sm-6 column3';
                  var cardstats = document.createElement('div');
                  cardstats.className='card card-stats';
                  var cardheader = document.createElement('div');
                  cardheader.className='card-header  card-header-primary card-header-icon';
                  var cardicon = document.createElement('div');
                  cardicon.className='card-icon';
                  //var image =document.createElement('img');
                  //image.setAttribute('src', responseJson[j].iconLocation);
                 // image.setAttribute('style', " height: 60px; width: 60px; ");
                 // image.setAttribute('alt',"java");
  			    //cardicon.appendChild(image);
  				cardheader.appendChild(cardicon);
                  var anchor = document.createElement('a');
                  anchor.setAttribute('id', responseJson[j].courseId);
                  anchor.setAttribute('href', "#");
                  var courseName =responseJson[j].courseName;
                 // alert("CourseName = "+courseName);
                  anchor.setAttribute('onclick',"displayTestSelect(this.id,'" +  courseName + "')");
                  var para = document.createElement('p');
                  para.className='card-category';
                  para.textContent=responseJson[j].courseName;
                  anchor.appendChild(para);
                  cardheader.appendChild(anchor);
                  cardstats.appendChild(cardheader);
                  column.appendChild(cardstats);
                  row.appendChild(column);
                }
                  document.getElementById('profile').appendChild(row);
              
        }
      }

      function displayTestSelect(courseId, courseName){
          //alert("DisplayTestSelect Id = " + courseId);
         
         	var responseJson=[
	  			{
	  				evaluationTypeName:"Test1",
	  				courseName:"c",
	  				testDetailId:1,
	  				feeStatus:true,
	  				attempted:false,
	  			},
	  			{
	  				evaluationTypeName:"Test2",
	  				courseName:"c",
	  				testDetailId:1,
	  				feeStatus:false,
	  				attempted:false,
	  				
	  			}
  			
  			]
         
              window.location.href = "TestSelectPage" + "?varid="+encodeURIComponent(JSON.stringify(responseJson));
           
        } 

      /* function displayStreamCourses(courseType_id, courseTypeName ){
        //var streamId = stream_id;
        courseTypeId = courseType_id;
        //alert("stream_id = " + streamId + "courseType_id = " + courseType_id);
        
          document.getElementById('dropdownMenuButton').textContent = courseTypeName;
        
        var myData = {
          streamId: streamId,
          courseTypeId: courseTypeId
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
            document.getElementById('CourseCard').style.display="block";
            var responseJson=jsonObj;
           
            var elem = document.getElementById('courseList');
            if(elem != null){
            	elem.parentNode.removeChild(elem);
            }
            //document.getElementById('profile').removeChild(document.getElementById('xyz'));

            for(i=0; i<(responseJson.length); i=i+3){
              var row  = document.createElement('div');
              row.className='row';
              row.id="courseList";
              for(j=i; j<i+3 && j<responseJson.length; j++){
                //alert("course : " + responseJson[j].courseId + "," + responseJson[j].courseName + "," + responseJson[j].iconLocation);
                var column = document.createElement('div');
                column.className='col-lg-3 col-md-6 col-sm-6 column3';
                var cardstats = document.createElement('div');
                cardstats.className='card card-stats';
                var cardheader = document.createElement('div');
                cardheader.className='card-header  card-header-primary card-header-icon';
                var cardicon = document.createElement('div');
                cardicon.className='card-icon';
                var image =document.createElement('img');
                image.setAttribute('src', responseJson[j].iconLocation);
                image.setAttribute('style', " height: 60px; width: 60px; ");
                image.setAttribute('alt',"java");
			    cardicon.appendChild(image);
				cardheader.appendChild(cardicon);
                var anchor = document.createElement('a');
                anchor.setAttribute('id', responseJson[j].courseId);
                anchor.setAttribute('href', "#");
                var courseName =responseJson[j].courseName;
               // alert("CourseName = "+courseName);
                anchor.setAttribute('onclick',"displayTestSelect(this.id,'" +  courseName + "')");
                var para = document.createElement('p');
                para.className='card-category';
                para.textContent=responseJson[j].courseName;
                anchor.appendChild(para);
                cardheader.appendChild(anchor);
                cardstats.appendChild(cardheader);
                column.appendChild(cardstats);
                row.appendChild(column);
              }
                document.getElementById('profile').appendChild(row);
            }
          },
          error: function(){
            alert("Error");
            //document.getElementById("error").innerHTML = "Invalid email or password";
          }


        });
      }
      function displayTestSelect(courseId, courseName){
        //alert("DisplayTestSelect Id = " + courseId);
       
        var courseId = courseId;
        var myData = {
          streamId: streamId,
          courseTypeId: courseTypeId,
          courseId: courseId,
          courseName: courseName
        };

        $.ajax({
          type: 'POST',
          //url: servletURL + 'TestSelectServlet',
          url: "/TestSelect",
          data: jQuery.param(myData),
          dataType: 'json',
          contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
          traditional: true,
          success: function (jsonObj) {

            var responseJson = jsonObj;
            window.location.href = "TestSelectPage" + "?varid="+encodeURIComponent(JSON.stringify(responseJson));
          },
          error: function(){
            alert("Error");
           // document.getElementById("error").innerHTML = "Invalid email or password";
          }


        });
      } */
      </script>
    </body>
  </html>
