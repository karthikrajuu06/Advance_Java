<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>

    <h2>Update Employee Details</h2>

    <form action="${pageContext.request.contextPath}/employees/updateEmp"
          method="post">

        Employee ID:
        <input type="text" name="eid"
               value="${employee.eid}" readonly />

        <br><br>

        Employee Name:
        <input type="text" name="ename"
               value="${employee.ename}" required />

        <br><br>

        Employee Salary:
        <input type="number" step="0.01" name="salary"
               value="${employee.salary}" required />

        <br><br>

        <input type="submit" value="Update Employee" />

    </form>

    <br>

    <a href="${pageContext.request.contextPath}/employees/getEmp">
        Back to Employee List
    </a>

</body>
</html>
