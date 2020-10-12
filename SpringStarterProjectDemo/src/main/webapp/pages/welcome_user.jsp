<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.3.min.js"></script>
</head>



<h2>Users are:</h2>

<div id="users"></div>

<script>
	var SearchString = window.location.search.substring(1);
	
	var arr = SearchString.split('&');
	var data= arr[0].split('=')[1];
	var decodedData = decodeURIComponent(data);
	userData=JSON.parse(decodedData);
	//alert(JSON.parse(decodedData));
	for(var i=0;i<userData.length;i++){
		//alert(userData[i].name);
		var user = document.createElement('p');
		user.textContent = userData[i].name;
		document.getElementById('users').appendChild(user);
		
		
	}

	sendDataList();
	function sendDataList(){

		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "users",
			data : JSON.stringify(userData),
			//dataType : 'json',				
			success : function() {
				alert("JSON OBJ LIST SENT");
				
				
				
			}
		});

	}
	
</script>