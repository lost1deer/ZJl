<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 2018/8/5
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>
</head>

<link rel="stylesheet" href="css4/login.css" type="text/css"/>

<body>
<div id="mask"></div>
<div class="pic">
    <img src="img4/bg1.jpg" width="100%"/>
</div>
<div id="container">
    <div class="sign">欢迎注册News新闻网</div>
    <div class="search bar">
        <font color="red">
            <%=session.getAttribute("message")==null ? "":session.getAttribute("message") %>
        </font>
        <form action="<%=request.getContextPath() %>/checkCodeservlet" method="post">
            <input type="text" placeholder="请输入昵称" id="uname" name="uname" autocomplete="off">
            <label id="lname"></label>
            <input type="password" placeholder="请设置密码" id="pwd" name="pwd" autocomplete="off">
            <label id="lpass"></label><br/>
            <input type="text" placeholder="请输入手机号码" id="telphone" autocomplete="off">
            <label id="ltelphone"></label><br/>
            <input type="text" name="CHECK_CODE_PARAM_NAME" placeholder="验证码" id="icd"/>
            <img alt="" src="<%=request.getContextPath() %>/ValidateColorServlet">
            <input type="image" value="" src="img4/2.png" id="button" onmousedown="btnClick()" onmouseup="btnUp()">

        </form>
    </div>
</div>
<div id="bottom">
    <ul>
        <li class="clearfix">
            <div class="bottom-1">
                <div class="lia">
                    <div class="logo"></div>
                    <p class="btm-tab"><a href="#">News简介</a></p>
                    <p class="btm-tab"><a href="#">联系我们</a></p>
                    <p class="btm-tab"><a href="#">广告服务</a></p>
                </div>
                <div class="lia">
                    <div class="logo"></div>
                    <p class="btm-tab"><a href="#">网站律师</a></p>
                    <p class="btm-tab"><a href="#">招聘人才</a></p>
                </div>
            </div>
        </li>
        <li>
            <div class="lic">
                <p class="btm-tab2">违法信息及不良信息举报电话：<br>11111111</p>
                <p class="btm-tab2">不良内容举报邮箱:<br>1111111@nenu.cn</p>
            </div>
        </li>
        <li>
            <div class="lib">
                <p>关注我们</p>
                <div id="blog">
                    <img src="img4/blog(2).png" width="400px"/>
                    <span id="close_blog">×</span>
                </div>
                <div id="blogbtn">
                    <img src="img4/blog.gif" width="50px">
                </div>

                <div id="qq">
                    <img src="img4/qq(2).png" width="400px"/>
                    <span id="close_qq">×</span>
                </div>
                <div id="qqbtn">
                    <img src="img4/qq.png" width="50px">
                </div>

                <div id="wechat">
                    <img src="img4/wechat(2).png" width="400px"/>
                    <span id="close_wechat">×</span>
                </div>
                <div id="webtn" class="smallbtn"><img src="img4/wechat.png" width="50px">
                </div>

            </div>
        </li>
    </ul>
    <div class="bottom-copy">&copy;News出品</div>
</div>

</body>
<script type="text/javascript" src="js4/signup.js" ></script>
<script src="js4/NEW.js"></script>
<script src="js4/sign.js"></script>
</html>
