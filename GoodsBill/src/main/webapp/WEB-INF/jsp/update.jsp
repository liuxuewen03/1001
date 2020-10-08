<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/7/28
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" align="center" width="800">
    <form action="/doUpdate">
        <tr>
            <td width="120">商品编号</td>
            <th width="160"><input type="text" readonly name="id" value="${goods.id}"></th>
        </tr>
        <tr>
            <td width="120">商品名称</td>
            <th width="160"><input type="text" name="goodsname" value="${goods.goodsname}"></th>
        </tr>
        <tr>
            <td width="120">商品价格</td>
            <th width="160"><input type="text" name="goodsprice" value="${goods.goodsprice}"></th>
        </tr>
        <tr>
            <td width="120">库存数量</td>
            <th width="160"><input type="text" name="goodscount" value="${goods.goodscount}"></th>
        </tr>
        <tr>
            <td width="120">订单状态</td>
            <th width="160">
                <select name="billstatus" id="select">
                    <option value="0">待处理</option>
                    <option value="1">处理中</option>
                    <option value="2">已处理</option>
                </select>
            </th>
        </tr>
        <tr>
            <th width="120" colspan="2">
                <<input type="submit" value="提交">
                &nbsp;&nbsp;&nbsp;<button>返回
            </button>
            </th>
        </tr>
    </form>
</table>
</body>
<script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
</html>
