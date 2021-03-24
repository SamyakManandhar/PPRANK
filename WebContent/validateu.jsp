<%@page import="com.mi.pprank.db.DConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="garima" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
String username = (String) request.getParameter("username");
String sql = "update usersignup set auth = '1' where username= '" + username + "'";
System.out.println("Query " + sql);
DConnection.getConnection().createStatement().executeUpdate(sql);
response.sendRedirect("user.jsp");


%>

</body>
</html>