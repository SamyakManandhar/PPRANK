<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="garima"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<div class = "tables">

			
				 <table align="center" border="1">
					
					<tr>
					
						<th>From Username</th>
						<th>Username</th>
						
						<th>Email</th>
						
						<th>Phone</th>
						<th>Authentication</th>
						<!-- <th>Password</th> -->
						
					</tr>
					<garima:forEach items="${friendrequestList }" var="friend">
						<tr>
						
							<td><garima:out value="${friend.fromusername}"/></td>
							<td><garima:out value="${friend.username}" /></td>
							
							<td><garima:out value="${friend.email}" /></td>
							
							<td><garima:out value="${friend.phone_number}" /></td>
							
							<garima:choose>
							
							<garima:when test = "${friend.auth==0}">
							<td><a href="validateuser.jsp?username=${friend.username}&name=${friend.fromusername}">Waiting</a></td>
							</garima:when>
							<garima:otherwise>
							<td>Authenticated</td>
							</garima:otherwise>
							</garima:choose>				
							
							<%-- <td><c:out value="${use.password}" /></td> --%>
							<%-- <td><a href="servlet?formName=editUser&username=${use.username }">Edit</a></td>
							<td><a href="Delete?username=${use.username}"> Delete </a></td> --%>

						</tr>

					</garima:forEach>
				</table>
			

</div>
		</div>

</body>
</html>