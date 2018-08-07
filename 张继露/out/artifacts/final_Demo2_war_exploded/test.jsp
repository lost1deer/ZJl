<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 2018/7/31
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录页面</title>
</head>
<body>
<form action="/Servlet.checkCodeservlet" method="post"><!-- action写要请求Servlet的名 -->
    用户名：<input type="text" id="uname" name="uname"><br><br>
    密码：<input type="password" id="pwd" name="pwd"><br><br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
<a href="/login.jsp"> 注册 </a>
</body>
</html>


