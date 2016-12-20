<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="/usersystem26/">
<meta charset="utf-8">
<title>用户登录</title>
<link type="text/css" rel="stylesheet" href="easyui/themes/icon.css">
<link type="text/css" rel="stylesheet" href="easyui/themes/default/easyui.css">
<link type="text/css" rel="stylesheet" href="CSS/login.css">
</head>
<body>
	<div id="loginDiv">
		<form id="loginForm" method="post"> 
			<p>编号：<input name="id" required="required" value="10088"></p>
			<p>姓名：<input name="name" required="required" value="vczft"></p>
			<a id="btnLogin" href="javascript:void(0)">登录</a>    
		</form>
	</div>
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/login.js"></script>
</body>
</html>