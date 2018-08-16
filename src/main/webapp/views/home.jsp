<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/14/2018
  Time: 11:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="layouts/header.jsp"%>
<div class="container">
    <div class="row">
        <div class="col-md-12" style="margin-top: 5%;margin-bottom: 2%;">
            <div class="row">
                <div class="col-md-6">
                    <h3>User Managment System</h3>
                </div>
                <div class="col-md-6 text-right">
                    <a href="<c:url value="/create_user" />" class="btn btn-danger">Add User</a>
                </div>
            </div>
        </div>

        <table class="table table-hover">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Age</th>
                <th>Operations</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.surname}</td>
                    <td>${user.age}</td>
                    <td>
                        <div class="btn-group-sm">
                            <a href="" class="btn btn-info btn-sm">Edit</a>
                            <a href="${pageContext.request.contextPath}/delete/${user.id}" class="btn btn-danger btn-sm">Delete</a>
                        </div>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<%@include file="layouts/footer.jsp"%>