<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/10/1
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/toIndex2">
    <table style="margin: auto;">
        <tr>
            <td>资产名称</td>
            <td><input type="text" id="assetname" name="assetname"></td>
        </tr>
        <tr>
            <td> 资产类型</td>
            <td><select id="assettype" name="assettype">
                <option value="0">请选择</option>
                <option value="电子设备">电子设备</option>
                <option value="机械设备">机械设备</option>
                <option value="运输设备">运输设备</option>
            </select></td>
        </tr>
        <tr>
            <td colspan="1"><input type="submit" value="查询"></td>
        </tr>
    </table>

</form>
<table border="1px black solid" style="text-align: center; margin: auto;">
    <tr>
        <td colspan="7">人员列表</td>
    </tr>
    <tr>
        <th>资产编号</th>
        <th>资产名称</th>
        <th>资产类型</th>
        <th>入库日期</th>
    </tr>
    <c:forEach var="a" items="${assets}">
        <tr>
            <td>
                    ${a.assetid}
            </td>
            <td>
                    ${a.assetname}
            </td>
            <td>
                    ${a.assettype}
            </td>
            <td>
                    ${a.intodate}
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
