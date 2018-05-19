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
		<td> Employee ID:<input type="text" name="id" value="${ employee.id}"/> </td>
      <td>  First Name: <input type="text" name="userId" value="${employee.firsName }"/> </td>
      <td>  Last Name: <input type="text" name="userId" value="${ employee.lastName}"/> </td>
          		<td>Social Security Number:<input type="text" name="userId" value="${employee.socialSecurityNumber }"/> </td>
          		<td> Salary:<input type="text" name="userId" value="${employee.salary }"/> </td>
          		<td>Hire Day:<input type="text" name="userId" value="${employee.hireDay }"/> </td>
          		<td> Address:<input type="text" name="userId" value="${employee.address.city }"/> </td>
          		<td> Address:<input type="text" name="userId" value="${employee.address.street }"/> </td>
          		<td> Address:<c:out value="${employee.address.zip }"/> </td>
          		<td> Address:<c:out value="${employee.address.state }"/> </td>

		</tr>




</c:forEach>


</table>
</form>
</body>
</html>