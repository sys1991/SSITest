<%--
  Created by IntelliJ IDEA.
  User: sys
  Date: 2016/6/5
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>

<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>登陆页面</h1>
<form action="${ctx}/user/login" method="post">
    <input type="text" name="username" placeholder="username"><br>
    <input type="password" name="password" placeholder="password"><br>
    <input type="submit" value="登陆">
</form>
${requestScope.message}
</body>
</html>
