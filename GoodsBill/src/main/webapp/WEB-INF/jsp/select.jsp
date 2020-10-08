<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/7/28
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input id="goodsdistrict" hidden value="${sessionScope.goodsdistrict}">
<table border="1px solid black" style="margin: auto; text-align: center;">
    <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>库存数量</th>
        <th>订单状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${goodsPageInfo.list}" var="goods">
        <tr>
            <td>${goods.id}</td>
            <td>${goods.goodsname}</td>
            <td>${goods.goodsprice}</td>
            <td>${goods.goodscount}</td>
            <c:if test="${goods.billstatus==0}">
                <td>待处理</td>
                <td><a href="/toUpdate/${goods.id}" >修改</a>
                </td>
            </c:if>
            <c:if test="${goods.billstatus==1}">
                <td>处理中</td>
                <td><a href="/toUpdate/${goods.id}" >修改</a>
                </td>
            </c:if>
            <c:if test="${goods.billstatus==2}">
                <td>已处理</td>
            </c:if>
        </tr>
    </c:forEach>
</table>
<div style="margin: auto; text-align: center;">
    <a href="${goodsPageInfo.firstPage}">首页</a>
    <a href="${goodsPageInfo.prePage}">上一页</a>
    <a>${goodsPageInfo.pageNum}/${goodsPageInfo.pages}</a>
    <a href="${goodsPageInfo.nextPage}">下一页</a>
    <a href="${goodsPageInfo.lastPage}">末页</a>
</div>
</body>
<script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
</html>
