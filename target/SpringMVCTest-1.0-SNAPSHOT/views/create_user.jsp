<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/14/2018
  Time: 11:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="addUser" modelAttribute="user">
    Name : <form:input path="name" placeholder="Insert your name"/>
    Surname : <form:input path="surname" placeholder="Insert your surname"/>
    Age : <form:input path="age" placeholder="Insert your age"/>
    <button type="submit">Add User</button>
</form:form>
</body>
</html>
