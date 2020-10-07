<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/9/24
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="doupdate">
    <table style="margin: auto;text-align: center">
        <tr>
            <td colspan="1"><span style="text-align: center; font-size: 40px">学员信息列表</span></td>
        </tr>
        <tr>
            <td>学员姓名</td>
            <td><input type="hidden" name="sid" value="${studentInfo.sid}">
                <input type="text" name="sname" value="${studentInfo.sname}"></td>
        </tr>
        <tr>
            <td>学员性别</td>
            <td><input type="text" name="sgender" value="${studentInfo.sgender}"></td>
        </tr>
        <tr>
            <td>学员年龄</td>
            <td><input type="text" name="sage" value="${studentInfo.sage}"></td>
        </tr>
        <tr>
            <td>家庭住址</td>
            <td><input type="text" name="saddress" value="${studentInfo.saddress}"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="semail" value="${studentInfo.semail}"></td>
        </tr>
        <tr>
            <td colspan="1">
                <button type="submit">提交</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
