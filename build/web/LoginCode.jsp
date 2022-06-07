<%@page  import="java.sql.PreparedStatement" %>
<%@page  import="java.sql.ResultSet" %>
<%@page  import="java.sql.Connection" %>
<%@page  import="java.sql.DriverManager" %>

<%

String id=request.getParameter("aId");
String pass=request.getParameter("pwd");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
PreparedStatement st=con.prepareStatement("select * from adminlogintable where adminid=? and password=?");
st.setString(1,id);
st.setString(2,pass);
ResultSet rs=st.executeQuery();
if(rs.next())
{
    response.sendRedirect("AdminMenu.jsp");
}
else
{
    response.sendRedirect("homepage.jsp");
}
%>