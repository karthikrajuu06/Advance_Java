<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>
</head>

<body>

    <h3>Adding Employee Data</h3>

    <form action="${pageContext.request.contextPath}/employees/saveEmp"
          method="post">

        Employee Name:
        <input type="text" name="ename" required />

        <br><br>
 
        Employee Salary:
        <input type="number" name="salary" required />

        <br><br>

        <input type="submit" value="Register" />

    </form>

</body>
</html>
