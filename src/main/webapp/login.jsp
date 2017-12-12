<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#btn').click(function(){
		$("#bla_orm").submit();
		  $.ajax({
			url : "${pageContext.request.contextPath}/user/login.action",
			type : "POST",
			dataType : "JSON",
			contentType : "application/json;charset=UTF-8",
			data : {
				username:$("#username").val(),
				password:$("#password").val()
				},
			success : function(data){
				 if(data==0){
					alert(data);
					window.location.href="${pageContext.request.contextPath}/user/toHome.action";
				}else{
					alert(data);
				}
			},
			error : function(data){
				$("#msg").text(JSON.stringify(data.responseText));
			}
		});
	}); 
	
});
</script>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/login.action" id="loginForm">
	<input type="text" name="username" id="username" placeholder="用户名"/>
	<input type="password" name="password" id="password" placeholder="密码"/>
	<input type="button" id="btn" value="提交"/>
</form>
<div id="msg"></div>
</body>
</html>