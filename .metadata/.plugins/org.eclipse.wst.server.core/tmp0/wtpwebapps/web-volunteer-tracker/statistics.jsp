<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://166.62.28.96:3306/";
String dbName = "sikhsny";
String userId = "deepakdm";
String password = "deepakdm";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font color="#FF00FF"><strong>Volunteer Statistics</strong></font></h2>
<table align="center" cellpadding="4" cellspacing="4">
<tr>

</tr>
<tr bgcolor="#008000">
<td><b>Task</b></td>
<td><b>Count</b></td>

</tr>
<%
try {
connection = DriverManager.getConnection(
connectionUrl + dbName, userId, password);
statement = connection.createStatement();
String sql = "SELECT  `volunteers_Option` , COUNT( 1 ) AS volunteer_count FROM  `volunteers` where `T18Attendence` =  'checked' GROUP BY  `volunteers_Option` ";

resultSet = statement.executeQuery(sql);
while (resultSet.next()) {
%>
<tr bgcolor="#8FBC8F">

<td><%=resultSet.getString("volunteers_Option")%></td>
<td><%=resultSet.getString("volunteer_count")%></td>

</tr>

<%
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

<p>

<a href="StudentControllerServlet">Back to List</a>
</p>