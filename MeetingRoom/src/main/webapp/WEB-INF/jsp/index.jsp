<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/10/5
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px solid black" style="text-align: center;margin: auto">
    <tr>
        <td>预定编号</td>
        <td>会议室</td>
        <td>预订人</td>
        <td>日期</td>
    </tr>
    <c:forEach items="${meetingRooms}" var="m">
        <tr>
            <td>
                    ${m.id}
            </td>
            <td>
                    ${m.meetingName}
            </td>
            <td>
                    ${m.advanceName}
            </td>
            <td>
                <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${m.meetingOrder}"/>

            </td>
        </tr>
    </c:forEach>
</table>
<p style="margin: auto"><a href="/toAdd">预定会议室</a></p>
</body>
</html>
