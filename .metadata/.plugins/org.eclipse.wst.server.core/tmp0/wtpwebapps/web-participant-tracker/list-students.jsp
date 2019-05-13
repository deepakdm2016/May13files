<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
<title>
Participant Tracker App
</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>


<body>
<div id="wrapper">
<div id="header">
<h2>Participant Portal</h2>
</div>
</div>

<div id="container">
<div id="content">
<!--  put button -->
<input type="button" value="Add Participant"
onclick="window.location.href='add-participant.jsp';return false;"
class="add-student-button"
/>

<%int i=0; %>

<table>
<tr>
<th>Si.No</th>
<th>Name</th>
<th>Gender</th>
<th>Delete</th>
</tr>

<c:forEach var="tempStudent" items="${student_list}" >
<% i++; %>
<c:url var="tempLink" value="StudentControllerServlet">
<c:param name="command" value="LOAD"/>
<c:param name="studentId" value="${tempStudent.id}"/>

</c:url>

<!--  setup link to delete -->

<c:url var="deletelink" value="StudentControllerServlet">
<c:param name="command" value="DELETE"/>
<c:param name="studentId" value="${tempStudent.id}"/>
</c:url>


<tr>
<td><%=i%></td>
<td>${tempStudent.name}</td>
<td>${tempStudent.gender}</td>
<td>
<a href="${deletelink}" onclick=" if(!(confirm('Are you sure you want to delete'))) return false"> Delete</a>
</td>
</tr>

</c:forEach>

</table>
</div>
</div>

</body>
</html>