<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>all-employees-view</title>
</head>
<body>
<h2>all-employees-view</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">
<%--        updateButton - это ссылка в контроллере на страницу update-info--%>
        <c:url var="updateButton" value="update-info">
<%--            param со значением emp.id будет добавлен в ссылку update-info и будет ловится в контроллере--%>
            <c:param name="empId" value="${emp.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/delete-employee">
            <%--            param со значением emp.id будет добавлен в ссылку update-info и будет ловится в контроллере--%>
            <c:param name="empId" value="${emp.id}"/>
        </c:url>
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>

            <td>
<%--                Здесь при нажатии на кнопку использовано выше ссылка updateBbutton--%>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'"/>
                    <%--Здесь при нажатии на кнопку использовано выше ссылка deleteButton--%>
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add Employee" onclick="window.location.href='add-new-employee'"/>
</body>
</html>