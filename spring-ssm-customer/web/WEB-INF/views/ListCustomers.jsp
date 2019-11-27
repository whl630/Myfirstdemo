<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" scope="page" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: looki
  Date: 2019/11/25
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>

    <link href="/static/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="/static/css/font.css" type="text/css" rel="stylesheet"/>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
    <table class="table table-hover table-bordered table-striped">
        <thead>
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>入职时间</th>
                <th>部门编号</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${customer.list}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.age}</td>
                <td>${customer.times}</td>
                <td>${customer.deptid}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <a href="${root}/list?pageNum=1&pageSize=${customer.pageSize}">首页</a>
        <a href="${root}/list?pageNum=${customer.prePage}&pageSize=${customer.pageSize}">上一页</a>
        <c:forEach items="${customer.navigatepageNums}" var="num">
            <a href="${root}/list?pageNum=${num}&pageSize=${customer.pageSize}">${num}</a>
        </c:forEach>
        <a href="${root}/list?pageNum=${customer.nextPage}&pageSize=${customer.pageSize}">下一页</a>
        <a href="${root}/list?pageNum=${customer.pages}&pageSize=${customer.pageSize}">尾页</a>
    </div>
</body>
</html>
