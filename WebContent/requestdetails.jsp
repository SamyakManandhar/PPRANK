<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.mi.pprank.db.DConnection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="maincontent">
            <div class="content">

                <article class="topcontent">


                    <content>
                        
                         <%
                                    String username=(String)session.getAttribute("username");
                                     %>
                                        <table>
                                <tr>
                                    
                                    <td>From User</td>
                                    <td>To User</td>
                                    <td>Email</td>
                                    <td>Mobile</td>
                                    <td>Status</td>
                                    
                                </tr>
                                        <%
                                        try {
                                            Connection con = DConnection.getConnection();
                                            Statement st = con.createStatement();

                                            String sql = "select * from friend where username='"+username+"'";
                                            ResultSet rs = st.executeQuery(sql);
                                     if (rs.next()) {%>
                                <tr>
                                    
                                    <td><%=rs.getString("fromusername")%></td>
                                    <td><%=rs.getString("username")%></td>
                                     <td><%=rs.getString("email")%></td>
                                     <td><%=rs.getString("phone_number")%></td>
                                     <td><a href="request_accept.jsp?fromuser=<%=rs.getString("fromuser")%>&id=<%=rs.getString("id")%>"><%=rs.getString("status")%></a></td>
                                     
                                </tr>
                                <%
                                    String msg1=request.getParameter("msg");
                                    if(msg1!=null)
                                    {
                                %>
                                <tr>
                                    <td colspan="6"><%=msg1%></td>
                                </tr>
                                 
                                <%}}
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }%>
                                    </table>
                               
                        
                    </content>
                </article>

            </div>
        </div>


</body>
</html>