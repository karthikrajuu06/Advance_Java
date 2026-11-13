<br%@ page contentType="text/html;charset=UTF-8" %>

<html>
	<head> Adding Employee Data</head>
	<brbbody>
		
		<br action="${pageContext.request.contextPath}/employees/saveEmp"
		      method="post">

		    Employee Name: <input type="text" name="ename" required /></br>

		    Employee Salary: <input type="number" name="salary" required /></brbbody>
		</bbody>

		    <input type="submit" value="Register" />

		</form>

	</body>
</html>