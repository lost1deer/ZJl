<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 2018/8/3
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<div >
    <table>

        <c:forEach items="${perList1}" var="data" varStatus="loop">
            <tr>
                <td>${data} </td>
                <td>${perList2[loop.count-1]}</td>
                <td>${perList3[loop.count-1]}</td>
                <td>${perList4[loop.count-1]}</td>
                <td>${perList5[loop.count-1]}</td>
                <td>${perList6[loop.count-1]}<a href="/Servlet.DeleteServlet?Id=${loop.count}">删除</a></td>

            </tr>
        </c:forEach>
    </table>
</div>--%>

<div >
    <text-align>
        <c:if test="${pageCurrent>1}">

            <h3><a href="/Servlet.PagingServlet?pageCurrent=1">首页</a> </h3>
            <h3><a href="Servlet.PagingServlet?pageCurrent=${pageCurrent-1}">上一页</a></h3>
        </c:if>
        <c:if test="${pageCurrent<pageNum}">

            <h3><a href="/Servlet.PagingServlet?pageCurrent=${pageCurrent+1}">下一页</a></h3>
            <h3><a href="/Servlet.PagingServlet?pageCurrent=${pageNum}">末页</a></h3>

        </c:if>
    </text-align>
</div>
</body>
</html>
