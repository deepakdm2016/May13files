
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>



<head>
<title>Update Volunteer</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.class">

</head>
<body>

<div id="wrapper">
<div id="header">
<h2>Administration update</h2>
</div>
</div>

<div id="container">

<h3>Update Student</h3>
<form name="myForm" onsubmit="return validateForm()" action="StudentControllerServlet" method="GET">
<input type="hidden" name="command" value="UPDATE">
<input type="hidden" name="studentId" value="${THE_STUDENT.id}">

<table>
<tbody>
<tr>
<td><label>Name:</label></td>
<td><input type="text" name="name" value="${THE_STUDENT.name}" required></td>
</tr>

<tr>
<td><label>Email</label></td>
<td><input type="text" name="email" value="${THE_STUDENT.email}"></td>
</tr>


<tr>
<td><label>Phone Number</label></td>
<td><input type="text" name="phonenum" value="${THE_STUDENT.phonenum}"></td>
</tr>

<tr>


<tr>
<td><label>Which Volunteering you want to do?</label></td>
<td>


<select name="volunteer_option">
	<option value="Turban Tying">Turban Tying</option>
    <option value="Line Management">Line Management</option>
    <option value="IT help">IT help</option>
    <option value="Turban Table">Turban Table</option>
    <option value="Volunteer check in table">Volunteer check in table</option>
    <option value="Interaction team in Langar">Interaction team in Langar</option>
    <option value="Others">Others</option>
  
  </select>
</td>
</tr>



<tr>
<td><input type="Submit" value="save" class="save"></td>
</tr>
</tbody>
</table>

</form>
<div style="clear:both;"> </div>
<p>

<a href="StudentControllerServlet">Back to List</a>
</p>
</div>
</body>
</html>