<%@page  import="java.sql.PreparedStatement" %>
<%@page  import="java.sql.ResultSet" %>
<%@page  import="java.sql.Connection" %>
<%@page  import="java.sql.DriverManager" %>

<%

String owner=request.getParameter("userId");
String dogname=request.getParameter("dogname");
String dogbreed=request.getParameter("dogbreed");
String emailid=request.getParameter("emailid");
String city=request.getParameter("city");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
PreparedStatement st=con.prepareStatement("insert into profiletable values(?,?,?,?,?)");

st.setString(1,owner);
st.setString(2,dogname);
st.setString(3,dogbreed);
st.setString(4,emailid);
st.setString(5,city);
st.executeUpdate();

response.sendRedirect("homepage.jsp");

  
%>