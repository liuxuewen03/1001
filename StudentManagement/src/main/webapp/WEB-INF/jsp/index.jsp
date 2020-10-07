<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/9/24
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px solid black" style="text-align: center; margin: auto;">
    <tr>
        <td colspan="6">
            <span style="text-align: center; font-size: 40px">学员信息列表</span>
        </td>
    </tr>
    <tr>
        <th>学员编号</th>
        <th>学员姓名</th>
        <th>学员性别</th>
        <th>学员年龄</th>
        <th>家庭住址</th>
        <th>Email</th>
    </tr>
    <c:forEach var="student" items="${studentInfoList}">
        <tr>
            <td><a href="/update/${student.sid}">${student.sid}</a></td>

            <td>${student.sname}</td>

            <td>${student.sgender}</td>

            <td>${student.sage}</td>

            <td>${student.saddress}</td>

            <td>${student.semail}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
