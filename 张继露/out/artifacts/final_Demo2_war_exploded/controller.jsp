<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 2018/8/3
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql"
           uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="utf-8" />
    <title>后台</title>
    <link rel="stylesheet" href="css1/manage.css" />
</head>
<body>

<div class="mana-contant">
    <div id="mana-tit">
        <span style="float:left">&nbsp;&nbsp;新闻发布系统后台管理</span>
        <span style="float:right">恒之新闻 &nbsp;&nbsp;</span>
    </div>

    <table border="0px" width="1200px" height="408px">
        <tr  height="40px" style="background-color: #D3D3D3;">
            <td class="num ">
                序号
            </td>
            <td class="name ">
                标题
            </td>
            <td class="type">
                类型
            </td>
            <td class="type">
                作者
            </td>
            <td class="type">
                点击量
            </td>
            <td class="time">
                更新时间
            </td>
            <td class="time">
                操作
            </td>
        </tr>
        <c:forEach items="${perList1}" var="data" varStatus="loop">
            <tr height="60px">
                <td class="num">${perList6[loop.count-1]}</td>
                <td class="type">${data} </td>
                <td class="type">${perList2[loop.count-1]}</td>
                <td class="type">${perList3[loop.count-1]}</td>
                <td class="time">${perList4[loop.count-1]}</td>
                <td class="time">${perList5[loop.count-1]}</td>
                <td class="time">
                    <div class="manage-magin">
                        <a href="/update.jsp?id=${perList6[loop.count-1]}&newslist=${data}&type=${perList2[loop.count-1]}&author=${perList3[loop.count-1]}&click=${perList4[loop.count-1]}&updatetime=${perList5[loop.count-1]}" ><button type="button">编辑</button></a>
                        <a href="add.jsp"?id=${perList6[loop.count-1]}&newslist=${data}&type=${perList2[loop.count-1]}&author=${perList3[loop.count-1]}&click=${perList4[loop.count-1]}&updatetime=${perList5[loop.count-1]}"><button type="button">增加</button></a>
                        <a href="/Servlet.DeleteServlet?Id=${perList6[loop.count-1]}"><button type="button" class="red">删除</button></a>

                    </div>
                </td>
            </tr>
        </c:forEach>




        <tr height="80px">
            <td style="width:350px; border=0px; position: relative;"><c:if test="${pageCurrent>1}">
                <h3><a href="Servlet.PagingServlet?pageCurrent=${pageCurrent-1}"><button type="button"class="normal"><</button></a> </h3>
            </c:if><span style="border: 1px solid lightgrey;width: 30px;height: 30px;display:inline-block;position: absolute;top:45px">${pageCurrent}</span>

            <c:if test="${pageCurrent<pageNum}">
                    <a href="/Servlet.PagingServlet?pageCurrent=${pageCurrent+1}"><button type="button" class="normal" style="margin-left:35px;">></button></a>
                </c:if>






            </td>
        </tr>
    </table>
    <script type="text/javascript" src="js/aaaa.js" ></script>
</body>
</html>
