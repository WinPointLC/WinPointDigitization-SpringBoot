<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="./assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="./assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
     Sign-Up Form
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- CSS Files -->
  <link href="../assets/css/material-dashboard.css?v=2.1.1" rel="stylesheet"/>
  <!-- <link rel="stylesheet" href="../css/Signup-form.css"> -->
  <link rel="stylesheet" href="../css/SignUp-form.css">
  <script src="https://cdn.anychart.com/releases/8.0.0/js/anychart-base.min.js"></script>
  
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/WinPointScripts.js"></script>
</head>
<body>
  <!-- Large modal -->
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bd-example-modal-lg" id="modal-btn">Sign Up form</button>

  <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="container-fluid">
          <div class="col-sm-4 col-md-4 col-lg-12 text-left ml-auto mr-auto" id="form-outter">
            <form name="form1">
              <h3 class="form-signup-heading text-center">SignUP Form</h3>
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
                <select class="form-control" id="gender" required>
                  <option value="">Gender</option>
                  <option>Male</option>
                  <option>Female</option>
                </select>
              </div>
              <div class="form-group">
                <%-- <input type="text" id="mobileNumber" class="form-control" placeholder="Mobile Number" pattern="[0-9]{10}" title="You can enter 10 digits only"> --%>
                  <input type="text" id="mobileNumber" class="form-control" placeholder="Mobile Number">
              </div>
              <div class="form-group">
                <select class="form-control" id="securityQuestion" required>
                <option value="">Security Question</option>
              </select>
                </div>
                <script> var selectVar = document.getElementById('securityQuestion');</script>
                <c:forEach var="securityQuestion" items= "${securityQuestions}" varStatus="i">
                <script>

                   var option = document.createElement('option');
                   option.textContent = "${securityQuestion.securityQuestion}";
                   selectVar.appendChild(option);
                   </script>
                </c:forEach>

                 <div class="form-group">
                <input class="form-control" type="text" id="securityAnswer" placeholder="Security Answer" required>
              </div>
              <br>
              <a href="#" onclick="submitSignUpDetails()"><button class="Signbtn" type="button">Submit</button></a>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script>
     function submitSignUpDetails(){
       //alert("Submit Sign Up Details");
       var firstName = $('#firstName').val();
       var lastName = $('#lastName').val();
       var email = $('#email').val();
       var password = $('#password').val();
       var gender = $('#gender').val();
       var mobileNumber = $('#mobileNumber').val();
       var securityQuestion = $('#securityQuestion').val();
       var securityAnswer =  $('#securityAnswer').val();
       var userCategoryId = 1;
       //alert(gender);
       var myData = {

           firstName: firstName,
           lastName: lastName,
           email: email,
           password: password,
           gender:gender,
           mobileNumber: mobileNumber,
           securityQuestion: securityQuestion,
           securityAnswer: securityAnswer,
           userCategoryId: userCategoryId
         };
     //alert("*** " + JSON.stringify(myData));
     //console.log(myData);
     $.ajax({
         type: 'POST',
         //url: servletURL + 'SignUpServlet',
         url: "/SignUp",
         data: JSON.stringify(myData),
         dataType: 'json',
         contentType: 'application/json; charset=utf-8',
         traditional: true,
         success: function (jsonObj) {
          //alert("Success from LoginForm");
             var responseJson1=jsonObj[0], responseJson2=jsonObj[1];
             var locationJson = eval('(' + responseJson1 + ')');
             //var studentJson = eval('(' + responseJson2 + ')');
              if (locationJson.success) {
            var strResJSON = JSON.stringify(responseJson2);
            //alert("studentEmail : " + responseJson2.email);
              window.location.href = locationJson.location + "?varid=" + encodeURIComponent(strResJSON) +"&username=" + "Anjali" +"&password=" + "Anjali";
          } else {
                 $('#ajaxGetUserServletResponse').text(responseText);
          }
         },
         error: function(){
          alert("Error: Emailid already exists");
          //document.getElementById("error").innerHTML = "Invalid email or password";
         }

     });
     validator();
  }

  function validator() {
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
  <!--  End Modal -->
  <script src="../MaterialKitHomePage/assets/js/core/jquery.min.js" type="text/javascript"></script>
  <script src="../MaterialKitHomePage/assets/js/core/bootstrap-material-design.min.js" type="text/javascript"></script>
</body>
</html>
