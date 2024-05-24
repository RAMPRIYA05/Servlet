<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

        .details{
            font-style: oblique;
            color:darkblue;
            font-size:10px;
            width: 95px;
            
           
        }
        fieldset{
            margin-top:50%;
            background-color:salmon;
            width:250px;
            height: 220px;
            padding:10px; 
            margin:20px;
            margin-left:30%;
            border-radius: 20px;
            
        }
        
     </style>
</head>
<body>

<fieldset>
<form action="UpdateForm" method="get">
      <center><h1>Update Form</h1></center>
      <center>Name: <input class="details" type="text" placeholder="Enter your new name" name="name" required></center><br>
      <center>EmailId: <input class="details" type="text" placeholder="Enter your new emailId" name="emailId" required></center><br>
      <center>Phone Number: <input class="details" type="text" placeholder="Enter your new phoneNumber" name="phoneNumber" required></center><br>
      
   <!--    <center><br>Email Id: <input class="details" type="email" placeholder="Enter your Email Id" name="emailId" required><br></center> -->
     
<!--       <center><br><a href="http://localhost:8080/ServletDemo/Form"><button style="color:brown;background-color:navajowhite;border:none;padding:5px 15px;text-align:center;text-decoration:none;display:inline-block;font-size:16px;margin:4px 2px;cursor:pointer;">Submit</button></a></center> -->
     <input type="hidden" name="id" value="<%=request.getParameter("editId") %>">
     <input type="submit" style="color:brown;background-color:navajowhite;border:none;padding:5px 15px;text-align:center;text-decoration:none;display:inline-block;font-size:16px;margin:4px 2px;cursor:pointer;"  name="update">
</form>
</fieldset>

</body>
</html>