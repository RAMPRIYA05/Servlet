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
            width: 80px;
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
<form action="Form" method="post">
     <center> <h1>Add User</h1></center>
      Name: <input class="details" type="text" placeholder="Enter your name" name="name" required><br>
     <br> Phone Number: <input class="details" type="tel" placeholder="Enter your Phone Number" name="phoneNumber" required><br>
      <br>Email Id: <input class="details" type="email" placeholder="Enter your Email Id" name="emailId" required><br>
      <center><br><button style="color:brown;background-color:navajowhite;border:none;padding:5px 15px;text-align:center;text-decoration:none;display:inline-block;font-size:16px;margin:4px 2px;cursor:pointer;">Submit</button></center>
      
</form>
</fieldset>
</body>
</html>