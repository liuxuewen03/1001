<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/10/1
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px black solid" style="text-align: center; margin: auto;">
    <tr>
        <td colspan="7">人员列表</td>
    </tr>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>等级</th>
        <th>部门</th>
        <th>操作</th>
    </tr>
    <c:forEach var="person" items="${persons}">
        <tr>
            <td>
                    ${person.id}
            </td>
            <td>
                    ${person.name}
            </td>
            <td>
                    ${person.sex}
            </td>
            <td>
                    ${person.age}
            </td>
            <td>
                    ${person.rank}
            </td>
            <td>
                    ${person.department}
            </td>
            <td>
                 <a href="/del/${person.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<p style="margin: auto;"><form action="/toAdd"><button>添加人员</button></form></p>
</body>
</html>
