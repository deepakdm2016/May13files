<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3308/";
String dbName = "web_student_tracker";
String userId = "webstudent";
String password = "webstudent";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>


<!--  put button -->
<input type="button" value="Add Participant"
onclick="window.location.href='add-participant.jsp';return false;"
class="add-student-button"
/>


<h2 align="center"><font color="#FF00FF"><strong>Turban Day 2018 participants list</strong></font></h2>
<table align="center" cellpadding="4" cellspacing="4">
<tr>

</tr>
<tr bgcolor="#008000">
<td><b>Si. No</b></td>
<td><b>Name</b></td>
<td><b>Gender</b></td>

</tr>
<%
try {
connection = DriverManager.getConnection(
connectionUrl + dbName, userId, password);
statement = connection.createStatement();
String sql = "SELECT  * FROM  `participants` order by  `id` ";

resultSet = statement.executeQuery(sql);
while (resultSet.next()) {
%>
<tr bgcolor="#8FBC8F">
<td><%=resultSet.getString("id")%></td>
<td><%=resultSet.getString("name")%></td>
<td><%=resultSet.getString("gender")%></td>

</tr>

<%
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

<p>

</p>