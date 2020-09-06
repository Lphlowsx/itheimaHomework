<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspTest</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/ServletRes" method="get">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"><br>
    <input type="submit" >
</form>
</body>
</html>
