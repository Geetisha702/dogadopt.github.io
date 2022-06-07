<%@page  import="java.sql.PreparedStatement" %>
<%@page  import="java.sql.ResultSet" %>
<%@page  import="java.sql.Connection" %>
<%@page  import="java.sql.DriverManager" %>

<%
String id=request.getParameter("adminId");
String pass=request.getParameter("pass");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
PreparedStatement st=con.prepareStatement("insert into adminlogintable values(?,?)");
st.setString(1,id);
st.setString(2,pass);
st.executeUpdate();
response.sendRedirect("homepage.jsp");

%>