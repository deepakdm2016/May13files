<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
<title>
Student Tracker App
</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>


<body>
<div id="wrapper">
<div id="header">
<h2>Admin Portal</h2>
</div>
</div>

<div id="container">
<div id="content">
<!--  put button -->
<input type="button" value="Add Volunteer"
onclick="window.location.href='Registration.jsp';return false;"
class="add-student-button"
/>

<input type="button" value="Volunteer Stats"
onclick="window.location.href='statistics.jsp';return false;"
class="add-student-button"
/>

<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Contact</th>
<th>Selected Task</th>
<th>Attendance</th>
<th>Update</th>
</tr>

<c:forEach var="tempStudent" items="${student_list}" >

<c:url var="tempLink" value="StudentControllerServlet">
<c:param name="command" value="LOAD"/>
<c:param name="studentId" value="${tempStudent.id}"/>

</c:url>

<!--  setup link to delete -->

<c:url var="deletelink" value="StudentControllerServlet">
<c:param name="command" value="DELETE"/>
<c:param name="studentId" value="${tempStudent.id}"/>
</c:url>


<c:url var="Attendencelink" value="StudentControllerServlet">
<c:param name="command" value="UPDATE_ATTENDENCE"/>
<c:param name="studentId" value="${tempStudent.id}"/>
<c:param name="attendence" value="${tempStudent.attendence}"/>

</c:url>


<tr><td>${tempStudent.name}</td>
<td>${tempStudent.email}</td>
<td>${tempStudent.phonenum}</td>
<td>${tempStudent.volunteer_option}</td>




<td><input type="checkbox"  class="mycheckbox" name="selected" value="${tempStudent.attendence}" <c:if test="${tempStudent.attendence=='checked'}">checked</c:if> DISABLED></td> 

<c:if test="${tempStudent.attendence=='checked'}">
<style type="text/css">

tr {
	border-top:1px solid gray;
	text-align:center;	
}
</style>
</c:if>

<td><a href="${tempLink}">Modify</a>
<a href="${Attendencelink}">Update Attendence</a>
<a href="${deletelink}" onclick=" if(!(confirm('Are you sure you want to delete'))) return false"> Delete</a>
</td>

</tr>

</c:forEach>

</table>
</div>
</div>

</body>
</html>