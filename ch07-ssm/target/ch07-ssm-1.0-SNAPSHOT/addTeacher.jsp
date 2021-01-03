<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <title>注册学生</title>
    <base href="<%=basePath%>" />
</head>
<body>
    <div align="center">
        <form action="teacher/addTeacher.do" method="post">
            <table>
                <tr>
                    <td>name：</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>age：</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="submit" value="register"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
