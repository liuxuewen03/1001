<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/10/5
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAdd">
    <table border="1px solid black" style="text-align: center;margin: auto">
        <tr>
            <td>会议室</td>
            <td><select name="meetingName">
                <option value="一号会议室">一号会议室</option>
                <option value="二号会议室">二号会议室</option>
                <option value="三号会议室">三号会议室</option>
            </select></td>
        </tr>
        <tr>
            <td>申请人</td>
            <td><input type="text" name="advanceName"></td>
        </tr>
        <tr>
            <td>申请人</td>
            <td><input type="date"name="meetingOrder"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
