<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <form action="/load" method="post" enctype="multipart/form-data">
        <input type="file" name="fileName">
        <input type="submit" value="提交">
    </form>

    <a href="/download?fileName=js第五章课外练习-2.txt"> 下载(文件名有中文)</a><br/>
    <a href="/download?fileName=张靓颖 - 新不了情.mp3"> 下载(文件名有中文)</a><br/>
    <a href="/download?fileName=3.jpg"> 下载</a>

<%--    <img src="/download?fileName=3.jpg"/>--%>
<audio src="/download?fileName=张靓颖 - 新不了情.mp3" autoplay controls/>
</body>
</html>
