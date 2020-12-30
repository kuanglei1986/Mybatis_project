<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/5/22
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload=function () {
            document.getElementById("img").onclick=function () {
                document.getElementById("img").src="/CheckCodeServlet?now="+new Date().getTime();
            }
        }
    </script>
</head>
<body>
<form action="/loginServlet" method="post">
    用户名:<input type="text" name="userName"><br/>
    密码:<input type="password" name="password"><br/>
    验证码:<input type="text" name="checkCode"><img id="img" src="/CheckCodeServlet"><br/>
    <input type="submit" value="登录">
</form>
<%=request.getAttribute("error_message")!=null?request.getAttribute("error_message"):""%>
</body>
</html>
