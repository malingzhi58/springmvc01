<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>" />
</head>
<body>
<table>
    <tr>
        <td>result.jsp 结果页面，注册结果： ${tips}</td>
    </tr>
    <tr>
        <td><a href="index.jsp"> return </a></td>
    </tr>

</table>


</body>
</html>
