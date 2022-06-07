<%@page  import="java.sql.PreparedStatement" %>
<%@page  import="java.sql.ResultSet" %>
<%@page  import="java.sql.Connection" %>
<%@page  import="java.sql.DriverManager" %>

<%

String id=request.getParameter("userId");
String pass=request.getParameter("oldPwd");
String passs=request.getParameter("newPwd");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
PreparedStatement st=con.prepareStatement("select * from usersignup where userid='"+id+"'and password='"+pass+"'");
//st.setString(1,id);
//st.setString(2,pass);
        
ResultSet rs=st.executeQuery();

if(rs.next())
{
PreparedStatement st1=con.prepareStatement("update usersignup set password='"+passs+"' where userid='"+id+"'");
//st1.setString(1,id);
//st1.setString(2,passs);
  
st1.executeUpdate();
response.sendRedirect("UserMenu.jsp");
}
else
{
    response.sendRedirect("homepage.jsp");
}

%>