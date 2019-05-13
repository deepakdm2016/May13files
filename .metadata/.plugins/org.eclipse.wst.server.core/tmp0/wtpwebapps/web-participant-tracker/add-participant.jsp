<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>


<head>
<title>Add Volunteer</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.class">

</head>
<body>



<jsp:useBean id="volunteer" class="com.jdbc.connection.Student" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="volunteer"/>



<div id="container">

<img src="https://www.eventcombo.com/Images/ECImages/e8ec5ce2-3dd0-44a8-ad0f-6cb74bb3e896.jpg" alt="Mountain View" width="500" height="400">

<h3>Thanks for participating in Turban Day 2018. Please record your participation</h3>
 <form name="myForm"  action="StudentControllerServlet" method="POST">
<input type="hidden" name="command" value="ADD">

<table>
<tbody>
<tr>
<td><label>Name:</label></td>
<td><input type="text" name="name" required value="<jsp:getProperty name="volunteer" property="name" />"></td>
</tr>


<tr>
<td><label>Gender</label></td>
<td><input type="radio" name="gender" value="male" required>Male</td>
<td><input type="radio" name="gender" value="female" required>Female</td>
</tr>



<tr>

<tr>
<td><label></label></td>



<td><input type="Submit" value="save" class="save"></td>
</tr>
</tbody>
</table>

<a href="StudentControllerServlet">Back to List</a>

</form>
<div style="clear:both;"> </div>
<p>

</p>
</div>
</body>
</html>