<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: looki
  Date: 2019/11/11
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
    <h1>HELLO MVC</h1>
<%--    <c:forEach items="${requestScope}" var="s">--%>
<%--        <h>${s.key}</h> -----------<h>${s.value}</h>--%>
<%--    </c:forEach>--%>

<form method="get" action="/mvc/string">
    <input type="text" name="var"><br/>
    <input type="text" name="var"><br/>
    <input type="text" name="var"><br/>
    <input type="text" name="var"><br/>
    <input type="text" name="var"><br/>
    <input type="text" name="var"><br/>
    <input type="text" name="var">

    <input type="submit" value="提交">
</form>
</body>
</html>
