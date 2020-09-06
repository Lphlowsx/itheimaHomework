<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="get">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"><br>
    <input type="submit" ><br>
    <a href="https://www.baidu.com">百度</a>
</form>
</body>
</html>
