<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="/springmvc-007-css/"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>找回密码</title>
</head>
<body>
	<form action="">
		<input id="userName" name="userName" type="text" placeholder="用户名"/><br>
		<input id="email" name="email" type="text" placeholder="email"/><br>
		<input type="button" value="找回密码" onclick="forget(this)"/>
	</form>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript"  >
		function forget(obj){
			$.get("user/forget?username="+$("#userName").val()+"&email="+$("#email").val(), function(data) {
				
			},"json")
		}
	</script>
</body>
</html>