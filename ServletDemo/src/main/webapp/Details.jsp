<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form action="Details">
      Name:<input type="text" placeholder="Enter your name" name="name" required><br>
      Phone Number:<input type="number" placeholder="Enter your Phone Number" name="phoneNumber" required><br>
      Email Id:<input type="email" placeholder="Enter your Email Id" name="emailId" required><br>
      Password:<input type="password" placeholder="Enter your Password" name="password" required><br>
      Address:<input type="text" placeholder="Enter your Address" name="address" required><br>
      City:<input type="text" placeholder="Enter your City" name="city" required><br>
      Pin Code:<input type="number" placeholder="Enter your PinCode" name="pinCode" required><br>
      District:<input type="text" placeholder="Enter your District" name="district" required><br>
      State:<input type="text" placeholder="Enter your State" name="state" required><br>
      <label for="gender">Gender:</label><br>
      <label for="gender"><input type="radio" id="gender" name="gender" required>1.Female</label><br>
      <label for="gender"><input type="radio" id="gender" name="gender" required>2.Male</label><br>
      <label for="gender"><input type="radio" id="gender" name="gender" required>3.Other</label><br>
      <input type="submit" name="click">
      
      
      </form>
</body>
</html>