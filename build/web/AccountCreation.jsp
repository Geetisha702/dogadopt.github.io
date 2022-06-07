<%@page  import="java.sql.PreparedStatement" %>
<%@page  import="java.sql.ResultSet" %>
<%@page  import="java.sql.Connection" %>
<%@page  import="java.sql.DriverManager" %>

<%
String id=request.getParameter("userId");
String pass=request.getParameter("pass");
String cont=request.getParameter("contactno");
String mail=request.getParameter("emailid");
String addr=request.getParameter("address");
String city=request.getParameter("city");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
PreparedStatement st=con.prepareStatement("insert into usersignup values(?,?,?,?,?,?)");
st.setString(1,id);
st.setString(2,pass);
st.setString(3,cont);
st.setString(4,mail);
st.setString(5,addr);
st.setString(6,city);
st.executeUpdate();
response.sendRedirect("homepage.jsp");

%>