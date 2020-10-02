<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/10/2
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<form action="doAdd" id="form1">
    <table style="margin: auto;">
        <tr>
            <td>资产编号</td>
            <td><input type="text" id="assetid" name="assetid"></td>
        </tr>
        <tr>
            <td>资产名称</td>
            <td><input type="text" id="assetname" name="assetname"></td>
        </tr>
        <tr>
            <td>资产类型</td>
            <td><select id="assettype" name="assettype">
                <option value="电子设备">电子设备</option>
                <option value="机械设备">机械设备</option>
                <option value="运输设备">运输设备</option>
            </select></td>
        </tr>

        <tr>
            <td>入库日期</td>
            <td><input type="text" id="intodate" name="intodate" value=""></td>
        </tr>
        <tr>
            <td colspan="1">
                <button onclick="subAdd()">提交</button>
            </td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript">
    function subAdd() {
        var assetid = $("#assetid").val();
        var assetname = $("#assetname").val();
        var assettype = $("#assettype").val();
        var intodate = $("#intodate").val();
        if (assetid == "" || assetid == null) {
            alert("资产id不能为空");
            return;
        }
        if (assetname == "" || assetname == null) {
            alert("资产名称不能为空");
            return;
        }
        if (assettype == "0") {
            alert("请选择类型");
            return;
        }
        if (intodate == "" || intodate == null) {
            alert("入库日期不能为空");
            return;
        }

        var form = $("#form1");
        form.submit();
    }
</script>
</html>
