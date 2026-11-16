<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
</head>

<body>

    <h2>Employee Details</h2>

    <table border="1" cellpadding="10">

        <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>Employee Salary</th>
        </tr>

        <c:forEach var="emp" items="${employees}">

            <tr>
                <td>${emp.eid}</td>
                <td>${emp.ename}</td>
                <td>${emp.salary}</td>
            </tr>

        </c:forEach>

    </table>

</body>
</html>
