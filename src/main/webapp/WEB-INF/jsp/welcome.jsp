<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

</head>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
</style>
<body>
<form>

<table border="1" style="width:100%" >

<caption> Employee Details</caption>
<c:forEach items="${employee}" var="employee">
	<tr>
		<td> Employee ID: <c:out value="${ employee.id}"/> </td>
      <td>  First Name: <c:out value="${employee.firsName }"/> </td>
      <td>  Last Name: <c:out value="${ employee.lastName}"/> </td>
          		<td>Social Security Number:<c:out value="${employee.socialSecurityNumber }"/> </td>
          		<td> Salary:<c:out value="${employee.salary }"/> </td>
          		<td>Hire Day:<c:out value="${employee.hireDay }"/> </td>
          		<td> Address:<c:out value="${employee.address.city }"/> </td>
          		<td> Address:<c:out value="${employee.address.street }"/> </td>
          		<td> Address:<c:out value="${employee.address.zip }"/> </td>
          		<td> Address:<c:out value="${employee.address.state }"/> </td>
          		<td width="30"> <a href="deleteEmployee?userId=${employee.id } ">Delete</a>
                 <td width="20"> <a href="UpdateEmployee?userId=${employee.id }">Update</a>
		</tr>




</c:forEach>


</table>
</form>
</body>
</html>