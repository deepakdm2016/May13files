<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>


<head>
<title>Add Volunteer</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.class">

</head>
<body>



<jsp:useBean id="volunteer" class="com.jdbc.connection.Student" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="volunteer"/>

<%

if(volunteer.validate())
{
	request.getRequestDispatcher("/StudentControllerServlet").forward(request, response);
}

%>

<h2> <jsp:getProperty property="message" name="volunteer"/></h2>


<div id="wrapper">
<div id="header">
<h2>Admin Page</h2>
</div>
</div>

<div id="container">



<h3>Add Volunteer</h3>
 <form name="myForm"  action="/web-volunteer-tracker/license.jsp" method="POST">
<input type="hidden" name="command" value="ADD">
<table>
<tbody>
<tr>
<td><label>Name:</label></td>
<td><input type="text" name="name" value="<jsp:getProperty name="volunteer" property="name" />"></td>
</tr>

<tr>
<td><label>Email</label></td>
<td><input type="text" name="email" value="<jsp:getProperty name="volunteer" property="email" />" required></td>
</tr>

<tr>
<td><label>Gender</label></td>
<td><input type="radio" name="gender" value="male" required>Male</td>
<td><input type="radio" name="gender" value="female" required>Female</td>
</tr>

<tr>
<td><label>Phone Number</label></td>
<td><input type="text" name="phonenum" value="<jsp:getProperty name="volunteer" property="phonenum" />"></td>
</tr>

<tr>
<td><label>Which Volunteering you want to do?</label></td>
<td>

<select name="Volunteer_option">
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

<tr>
<td><label></label></td>



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