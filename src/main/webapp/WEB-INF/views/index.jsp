<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/bootstrap.css">
    <title>首页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-3.2.1.min.js"></script>
</head>
<body>

<div class="container text-center">
    <div class="col-md-12 text-center">
        <sec:authentication property="name"/>,你好
        <a href="/logout">注销</a>

    </div>
    <div class="starter-template">
        <h1>${msg.title}</h1>
        <p class="bg-primary" >${msg.content}</p>

        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <p class="bg-info" >${msg.extraInfo}</p>
        </sec:authorize>
        <sec:authorize access="hasRole('ROLE_USER')">
            <p class="bg-info">无更多显示信息</p>
        </sec:authorize>
    </div>
</div>
</body>
</html>