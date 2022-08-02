<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/1
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        用户名<input type="text" name="name"/>
        密码<input type="password" name="pwd"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
