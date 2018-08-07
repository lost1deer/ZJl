<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 2018/8/4
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>编辑信息</title>
    <link rel="stylesheet" href="css5/edit.css" />
</head>
<body>

<table border="1" class="edit">
    <form action="<%=request.getContextPath() %>/Servlet.AddServlet" method="post">
        <tr>
            <td width="98px" height="53px">序号</td>
            <td width="598px" height="53px">

                <input type="text" id="id" name="id"   value="请输入" />

            </td>
        </tr>
        <tr>
            <td width="98px" height="53px">标题</td>
            <td width="598px" height="53px">

                <input type="text" id="newslist" name="newslist" value="请输入"/>

            </td>
        </tr>
        <tr>
            <td width="98px" height="53px">类型</td>
            <td width="598px" height="53px">

                <input type="text" id="type" name="type" value="请输入" />

            </td>
        </tr>
        <tr>
            <td width="98px" height="53px">作者</td>
            <td width="598px" height="53px">

                <input type="text" id="author" name="author" value="请输入" />

            </td>
        </tr>
        <tr>
            <td width="98px" height="53px">点击量</td>
            <td width="598px" height="53px">

                <input type="text" id="click" name="click" value="${0}" />

            </td>
        </tr>
        <tr>
            <td width="98px" height="53px">更新时间</td>
            <td width="598px" height="53px">

                <input type="text" id="updatetime" name="updatetime"value="请输入" />

            </td>
        </tr>
        <div class="edit-button">
            <button type="submit">提交</button>
        </div>
    </form>


</table>
</body>
</html>
