<%--
  Created by IntelliJ IDEA.
  User: looki
  Date: 2019/11/18
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
    <h1>JACKSON</h1>
    <input type="button" id="list" value="list">
    <input type="button" id="insert" value="insert">
<script>
    $(function () {
        $("#list").click(function () {
            $.ajax({
                url: "/list",
                type: "GET",
                success: function (data) {
                    console.log(data);
                    alert(data.name);
                }
            })
        });

        $("#insert").click(function () {
            var data1 = {id:2,name:"李四"};
            $.ajax(function () {
                $.ajax({
                    url: "/insert",
                    data: JSON.stringify(data),
                    type: "POST",
                    contentType: "application/json",
                    dataType: "json",
                    success: function (data) {
                        alert(data.name);
                    }
                });
            });
        });
    });
</script>
</body>
</html>
