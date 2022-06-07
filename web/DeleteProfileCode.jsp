<%@page  import="java.sql.PreparedStatement" %>
<%@page  import="java.sql.ResultSet" %>
<%@page  import="java.sql.Connection" %>
<%@page  import="java.sql.DriverManager" %>

<%

String id=request.getParameter("userId");


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
PreparedStatement st=con.prepareStatement("delete from profiletable  where userId=? ");

st.setString(1,id);

int i=st.executeUpdate();
if(i>0)
{
    response.sendRedirect("viewprofile.jsp");
}
else
{
    response.sendRedirect("homepage.jsp");
}
%>