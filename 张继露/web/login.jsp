<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 2018/8/5
  Time: 7:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<form action="/Servlet.LoginServlet" method="post"><!-- action写要请求Servlet的名 -->
    用户名：<input type="text" id="Nname" name="Nname"><br><br>
    密码：<input type="password" id="Npwd" name="Npwd"><br><br>
    <input type="submit" value="注册">
    <input type="reset" value="重置">
</form>
</body>
</html>
