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
<table border="1">
<thead>
<tr>
<td>id</td>
<td>name</td>
<td>emailId</td>
<td>phoneNumber</td>
</tr>
<% ArrayList<FormDetails> list=(ArrayList<FormDetails>)request.getAttribute("list");
for(FormDetails obj:list)
{
%>
<tr>
<th><%=obj.getId() %></th>
<th><%=obj.getName() %></th>
<th><%=obj.getEmailId() %></th>
<th><%=obj.getPhoneNumber() %></th>
</tr>
<% 
}
 %>
 </table>
</body>
</html>