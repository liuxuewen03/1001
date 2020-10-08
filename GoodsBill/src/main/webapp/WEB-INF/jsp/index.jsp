<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/7/28
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center; margin: auto;">
    <form action="/toSelect/" id="form">
        请选择区域:
        <select  id="select">
            <option value="1">朝阳区订单</option>
            <option value="2">海淀区订单</option>
            <option value="3">丰台区订单</option>
            <option value="4">西城区订单</option>
            <option value="5">昌平区订单</option>
        </select>
       <button onclick="a()">查询</button>
    </form>
</div>
</body>
<script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    function a(){
        var form1=$("#form");
        var goodsDistrict=$("#select").val();
        form1.attr("action","/toSelect/"+goodsDistrict);
        form1.submit();
    }
</script>
</html>
