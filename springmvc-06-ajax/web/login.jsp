<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/1
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        function a1() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{'name':$("#txtName").val()},
                success:function (data) {
                    if (data.toString()=='OK'){
                        $("#userInfo").css("color","green");
                    }else{
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            });
        }
        function a2() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{'pwd':$("#pwd").val()},
                success:function (data) {
                    if (data.toString()=='OK'){
                        $("#pwdInfo").css("color","green");
                    }else{
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                }
            });
        }
    </script>
    
</head>
<body>
    用户名:<input type="text" id="txtName" onblur="a1()"/>
            <span id="userInfo"></span>
    密码:<input type="text" id="pwd" onblur="a2()"/>
            <span id="pwdInfo"></span>
</body>
</html>
