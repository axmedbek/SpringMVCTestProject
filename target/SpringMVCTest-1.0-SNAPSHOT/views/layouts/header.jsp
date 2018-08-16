<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/15/2018
  Time: 12:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <style>
        .footer{
            background-color: #4e555b;
            position: fixed;
            bottom: 0;
            width: 100%;
            height: 10%;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/">Swotline</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
            <a class="nav-item nav-link active" href="${pageContext.request.contextPath}/">Home <span class="sr-only">(current)</span></a>
            <a class="nav-item nav-link" href="javascript:void(0)">About</a>
            <a class="nav-item nav-link" href="javascript:void(0)">Contact</a>
        </div>
    </div>
</nav>
