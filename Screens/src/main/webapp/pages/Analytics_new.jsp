<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="./assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="./assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Analytics Page
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- CSS Files -->
  <link href="../assets/css/material-dashboard.css?v=2.1.1" rel="stylesheet"/>
  <link rel="stylesheet" href="../css/Analytics.css">
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
  <script type="text/javascript">
  
  var userId = location.search.substring(1).split("=")[1];
  //alert("User Id: " + userId);
  var studentCourseDetailsList;
  var studentGACourseDetailsList;

  
  
			var myData = {
						userId : userId
			};
            $.ajax({
              type: 'POST',
              //url: servletURL + 'AnalyticsServlet?getInfoParam=courseDetails&view=userModal',
              url:"/Analytics?getInfoParam=courseDetails&view=userModal",
              data: jQuery.param(myData),
              dataType: 'json',
              contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
              traditional: true,
              success: function (jsonObj) {
                studentCourseDetailsList=jsonObj[1];
				studentGACourseDetailsList=jsonObj[2];
				/*
				alert("1st courseName: " + studentCourseDetailsList[0].courseName);
				alert("Aggregate: " + studentCourseDetailsList[0].courseAggr);
				
				alert("1st GA courseName: " + studentGACourseDetailsList[0].courseName);
				alert("GA Aggregate: " + studentGACourseDetailsList[0].courseAggr);
				*/
			  }
			  
		  });
  
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart1);
    var value1;
    var value2;
    var courseId = 0;
    function drawChart1() {
      

      var techArray = [];// = [['Course', 'Marks'],['C', 10],['DS', 40],['Java', 70]];
      var header = ['Course', 'Marks'];
      techArray.push(header);
      for(var i=0; i<studentCourseDetailsList.length; i++){
            // alert(studentCourseDetailsList.courseName);
        var techData = [studentCourseDetailsList[i].courseName, studentCourseDetailsList[i].courseAggr];
        techArray.push(techData);
      }
      // alert("Techarray: "+  techArray);
      var data = new google.visualization.arrayToDataTable(techArray);

      //data.addRows(JSON.parse(technicalData));

      var options = {
        title: 'My Evaluation Scores'
      };
      var chart = new google.visualization.PieChart(document.getElementById('piechart'));

      function selectHandler() {
        var selectedItem = chart.getSelection()[0];
        if(selectedItem){

          value1 = data.getValue(selectedItem.row , 0);
          value2 = data.getValue(selectedItem.row,1);
          // alert("The user has selected "+" "+value1);
          // alert("The user has selected "+" "+value2);
          document.getElementById('clickedcontent1').textContent ="   Subject:   " + value1;
          document.getElementById('clickedcontent2').textContent = "   Marks:   " + value2;
          for(var i=0; i<studentCourseDetailsList.length; i++){
        	  if(studentCourseDetailsList[i].courseName ==value1){
        		  courseId = studentCourseDetailsList[i].courseId;
        	      break;
        	  }
          }
          drawChart2();
        }
      }
      google.visualization.events.addListener(chart,'select',selectHandler);
      chart.draw(data, options);
    }
  </script>

  <script type="text/javascript">
google.charts.load("current",{'packages':['corechart']});
//google.charts.setOnLoadCallback(drawChart2);
function drawChart2() {

 	 var myData = {
					userId:userId,
	     			courseId: courseId
    	    	  };
			$.ajax({
				type: 'POST',
				//url: servletURL + 'AnalyticsServlet?getInfoParam=topicDetails&view=userModal',
				url:"/Analytics?getInfoParam=topicDetails&view=userModal",
                data: jQuery.param(myData),
				//data: JSON.stringify(myData),
				dataType: 'json',
				contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
				traditional: true,
				success: function (jsonObj) {
					//alert("Success from AnalyticsForm");
					var responseJson1=jsonObj[0], responseJson2=jsonObj[1];
					
					alert("1st topicName: " + responseJson2[0].topicName);
					
			          var topicArray = [];// = [['Course', 'Marks'],['C', 10],['DS', 40],['Java', 70]];
			          var topicHeader = ['TopicName', 'TopicwiseMarks'];
			          topicArray.push(topicHeader);
			          for(var i=0; i<responseJson2.length; i++){
			            // alert(studentCourseDetailsList.courseName);
			            var topicData = [responseJson2[i].topicName , responseJson2[i].topicwiseNumberOfCorrectAns];
			            topicArray.push(topicData);
			          }

			          // alert("topicArray: "+  topicArray);
			          var data = new google.visualization.arrayToDataTable(topicArray);

					var options = {
						    title: 'Your Topicwise score in Evaluations',
						     width: 400,
						     height: 300,
					};
					var chart = new google.visualization.BarChart(document.getElementById('barchart'));
					chart.draw(data, options);
				},
				error: function(){
					//alert("Error");
					document.getElementById("error").innerHTML = "Invalid email or password";
				}

			});

}
</script>
<!-- Script for GA Section -->
<script type="text/javascript">
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart4);
    var value3;
    var value4;
    var courseId=0;
    function drawChart4() {
      var data = new google.visualization.DataTable();
      data.addColumn('string', 'Subject');
      data.addColumn('number', 'Marks');

   //   var GAData = '[["LR",30],["QA",26],["VR",39],["VA",32]]';
     // data.addRows(JSON.parse(GAData));

      if(studentGACourseDetailsList.length !=0){
      var generalAptitudeData = '[["';
		for(var i=0; i<studentGACourseDetailsList.length; i++){
			generalAptitudeData += studentGACourseDetailsList[i].courseName + '",' + studentGACourseDetailsList[i].courseAggr + '],["';
		}
		generalAptitudeData = generalAptitudeData.substring(0, generalAptitudeData.length-3) + ']';

        //alert(generalAptitudeData);
        data.addRows(JSON.parse(generalAptitudeData));
      }


      var options = {
        title: 'My Evaluation Scores'
      };
      var chart = new google.visualization.PieChart(document.getElementById('piechart2'));

      function selectHandler() {
        var selectedItem = chart.getSelection()[0];
        if(selectedItem){
          value3 = data.getValue(selectedItem.row , 0);
            value4 = data.getValue(selectedItem.row,1);
          //alert("The user has selected "+" "+value3);
          //alert("The user has selected "+" "+value4);
          document.getElementById('clickedcontent3').textContent ="   Subject:  " + value3;
          document.getElementById('clickedcontent4').textContent = "  Marks:  " + value4;

          for(var i=0; i<studentGACourseDetailsList.length; i++){
        	  if(studentGACourseDetailsList[i].courseName ==value1){
        		  courseId = studentGACourseDetailsList[i].courseId;
        	      break;
        	  }
          }
          drawChart3();
        }
      }
      google.visualization.events.addListener(chart,'select',selectHandler);
      chart.draw(data, options);
    }

  </script>
 <!--  <script type="text/javascript">
google.charts.load("current",{'packages':['corechart']});
//google.charts.setOnLoadCallback(drawChart3);
function drawChart3() {
// alert("drawChart2    " + value1);

var data = new google.visualization.DataTable();
data.addColumn('string', 'Topics');
data.addColumn('number', 'Marks');

 var myData = {
	     			courseId: courseId
    	    	  };
			$.ajax({
				type: 'POST',
				url: '/OnlineEvaluationSystem/CommonController?action=AnalyticsServlet',
				data: JSON.stringify(myData),
				dataType: 'json',
				contentType: 'application/json; charset=utf-8',
				traditional: true,
				success: function (jsonObj) {
					//alert("Success from AnalyticsForm");
					var responseJson1=jsonObj[0], responseJson2=jsonObj[1];
					alert(responseJson2);
					var topicArray = '[["';
					for(var i=0; i<responseJson2.length; i++){
						topicArray += responseJson2[i].topicName + '",' + responseJson2[i].topicwiseNumberOfCorrectAns + '],["';
					}
					topicArray = topicArray.substring(0, topicArray.length-3) + ']';
					alert("******* " + topicArray);
					data.addRows(JSON.parse(topicArray));
					var options = {
						    title: 'Your Topicwise score in Evaluations',
						     width: 400,
						     height: 300,
					};
					var chart = new google.visualization.BarChart(document.getElementById('barchart'));
					chart.draw(data, options);
				},
				error: function(){
					//alert("Error");
					document.getElementById("error").innerHTML = "Invalid email or password";
				}

			});


}
</script> -->

</head>
<body>
  <div class="row main-row" >
    <div class="col-sm-6 col-md-12 col-lg-12 col-xl-12 main-col">

      <div class="row row-header-1">
        <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 col-header-1">
          <div class="Rule-content-1">
            <div class="card card-plain">
              <div class="card card-header card-header-primary">
                <h3 class="card-title text-align mr-auto ml-auto">Analytics Section</h3>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="row row-header-2">
        <div class="card card-plain">
          <div class="col-sm-6 col-md-6 col-lg-8 col-xl-8 col-header-2" id="result-header-card2" style="margin:auto;">
            <div class="card card-header card-header-info">
              <h3 class="card-title text-align mr-auto ml-auto">Evaluation Details</h3>
            </div>
          </div>
        </div>
      </div>
      <!-- Inner Header  -->
      <div class="row row-inheader-1">

    
      </div>
      <!-- Natours Content -->
      <div class="row">
        <div class="col-md-12">
          <div class="main-body">

            <section class="section-book" id="Tech">
              <div class="row">
                <div class="left-side-heading">
                  <h2>Technical Section</h2>
                </div>
                <div class="book">
                  <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                      <div class="book__form">
                        <form action="#" class="form">
                          <div class="row">
                            <div class="col-sm-5 col-md-5 col-lg-5 col-xl-5">
                              <div id="piechart" style="width: 400px; height: 300px; margin-left:-50px;" class="chart"></div>
                            </div>
                            <div class="col-md-4" >
                              <div class="right-side-contents">
                                <div class="hover-content" >
                                <h2 align="center" style="margin-left:80%;">Contents</h2>
                                  <div class="row">
                                    <h3 id="graph-content"></h3>
                                    <div class="col-sm-5 col-md-5 col-lg-5 col-xl-5">
                                      <div class="right-side-inner-contents">
                                        <h6 id="clickedcontent1" style="margin-left:60%;"></h6>
                                        <h6 id="clickedcontent2" style="margin-left:60%;"></h6>
                                      </div>
                                      <div class="bar-graph">
                                        <div id="barchart"style="width: 300px;height:200px;"></div>
                                      </div>
                                    </div>

                                  </div>
                                </div>
                              </div>

                            </div>
                          </div>
                        </form>

                      </div>
                    </div>
                  </div>

                </div>
              </div>
            </section>
          </div>
        </div>
      </div>

      <!-- For GA Section -->
      <div class="row" id="GA">
        <div class="col-md-12">
          <div class="main-body">

            <section class="section-book">
              <div class="row">
                <div class="left-side-heading">
                  <h2>General Aptitude Section</h2>
                </div>
                <div class="book">
                  <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
                      <div class="book__form">
                        <form action="#" class="form">
                          <div class="row">
                            <div class="col-sm-5 col-md-5 col-lg-5 col-xl-5">
                              <div id="piechart2" style="width: 400px; height: 300px;" class="chart"></div>
                            </div>
                            <div class="col-md-6" >
                              <div class="right-side-contents">
                                <div class="hover-content" >
                                  <h2 align="center">Contents</h2>
                                  <div class="row">
                                    <h3 id="graph-content"></h3>
                                    <div class="col-sm-5 col-md-5 col-lg-5 col-xl-5">
                                      <!-- <div class="right-side-inner-contents"> -->
                                        <h6 id="clickedcontent3" style="margin-left:60%;"></h6>
                                        <h6 id="clickedcontent4" style="margin-left:60%;"></h6>
                                      <!--  </div> -->
                                      <div class="bar-graph">
                                        <div id="barchart2"style="width: 300px;height:200px;"></div>
                                      </div>
                                    </div>

                                  </div>
                                </div>
                              </div>

                            </div>
                          </div>
                        </form>

                      </div>
                    </div>
                  </div>

                </div>
              </div>
            </section>
          </div>
        </div>
      </div>

    </div>
  </div>
  <script>
  </script>
</body>
</html>
