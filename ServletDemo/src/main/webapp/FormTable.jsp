<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import=" com.chainsys.model.FormDetails" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><table border="1">
<thead>
<tr>
<td style="background-color:sienna;">Id</td>
<td style="background-color:sienna;">Name</td>
<td style="background-color:sienna;">EmailId</td>
<td style="background-color:sienna;">PhoneNumber</td>
<td style="background-color:sienna;">Update</td>
<td style="background-color:sienna;">Delete</td>
</tr>
<% ArrayList<FormDetails> list=(ArrayList<FormDetails>)request.getAttribute("list");
for(FormDetails obj:list)
{
%>
<tr>
<th style="background-color:khaki;"><%=obj.getId() %></th>
<th style="background-color:khaki;"><%=obj.getName() %></th>
<th style="background-color:khaki;"><%=obj.getEmailId() %></th>

<th style="background-color:khaki;"><%=obj.getPhoneNumber() %></th>
<th><a href=""><button>Delete</button></a></th>
<th><a href=""><button>Update</button></a></th>
<th><input type="hidden" name="emailId" value="<%=obj.getEmailId()%>"><a href="UpdateName.jsp?editName<%=obj.getEmailId() %>>"><button style="color:brown;background-color:navajowhite;" type="button">Update</button></a></th>
<th><a href="http://localhost:8080/ServletDemo/Delete.jsp"><button style="color:brown;background-color:navajowhite;" type="button">Delete</button></a></th>

</tr>
<% 
}
 %>
 </table></center>
</body>
</html>