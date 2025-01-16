<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Info</title>
</head>
<body>
<h2>Employee Information</h2>
<br>
<form:form action="save-employee" modelAttribute="employee">
    Name: <form:input path="name"/>
    <%--    <form:errors path="name" cssClass="error"/>--%>
    <br><br>
    Surname: <form:input path="surname"/>
    <%--    <form:errors path="surname" cssClass="error"/>--%>
    <br><br>
    Department: <form:input path="department"/>
    <%--    <form:errors path="department" cssClass="error"/>--%>
    <br><br>
    Salary: <form:input path="salary"/>
    <%--    <form:errors path="salary" cssClass="error"/>--%>
    <br><br>
    <input type="submit" value="OK"/>
</form:form>
</body>
</html>
