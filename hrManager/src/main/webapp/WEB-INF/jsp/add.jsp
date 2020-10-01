<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 2020/10/1
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<form action="doAdd" id="form1">
    <table style="margin: auto;">
        <tr>
            <td>姓名</td>
            <td><input type="text" id="name" name="name"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><select id="sex" name="sex">
                <option value="0">请选择</option>
                <option value="男">男</option>
                <option value="女">女</option>
            </select></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" id="age" name="age"></td>
        </tr>
        <tr>
            <td>等级</td>
            <td><select id="rank" name="rank">
                <option value="0">请选择</option>
                <option value="1级">1级</option>
                <option value="2级">2级</option>
                <option value="3级">3级</option>
                <option value="4级">4级</option>
                <option value="5级">5级</option>
            </select></td>
        </tr>
        <tr>
            <td>部门</td>
            <td><select id="department" name="department">
                <option value="0">请选择</option>
                <option value="开发部">开发部</option>
                <option value="支持部">支持部</option>
                <option value="工程质量部">工程质量部</option>
            </select></td>
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
        var name = $("#name").val();
        var sex = $("#sex").val();
        var age = $("#age").val();
        var rank = $("#rank").val();
        var department = $("#department").val();
        if (sex == "0") {
            alert("请选择性别");
            return;
        }
        if (rank == "0") {
            alert("请选择等级");
            return;
        }
        if (department == "0") {
            alert("请选择部门");
            return;
        }
        if (name == "" || name == null) {
            alert("姓名不能为空");
            return;
        }
        if (age == "" || age == null) {
            alert("年龄不能为空")
            return;
        }
        var form = $("#form1");
        form.submit();
    }
</script>
</html>
