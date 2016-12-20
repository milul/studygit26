<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="/usersystem26/"/>
<meta charset="utf-8">
<title>用户列表</title>
<link type="text/css" rel="stylesheet" href="easyui/themes/icon.css">
<link type="text/css" rel="stylesheet" href="easyui/themes/default/easyui.css">
<link type="text/css" rel="stylesheet" href="CSS/list.css">
</head>
<body>
	<table id="userList"></table>  
	<div id="modifyDiv">
		<form id="modifyForm" method="post" enctype="multipart/form-data">
			<p><input id="uid" name="id" readonly="readonly"/></p>
			<p><input id="uname" name="name"/></p>
			<p><input id="ubirthday" name="birthday"/></p>
			<p><input id="ugender" name="gender"/></p>
			<p><input id="ucareer" name="career" /></p>
			<p><input id="uaddress" name="address"/></p>
			<p><input id="umobile" name="mobile"/></p>
			<p><input type="file" name="picData" onchange="chgPic(this)"/><br>
				<img src="images/not_pic.jpg" id="pic"/>
			</p>
			<p><a class="updateBtn" href="javaScript:void(0)">修改</a>&nbsp;
			<a class="closeBtn" href="javaScript:void(0)">关闭</a></p>
		</form>
	</div>
	<div id="detailDiv">
		<form id="detailForm" method="post">
			<p>编号：<input id="did" name="id" readonly="readonly"/></p>
			<p>姓名：<input id="dname" name="name" readonly="readonly"/></p>
			<p>生日：<input id="dbirthday" name="birthday" readonly="readonly"/></p>
			<p>性别：<input id="dgender" name="gender" readonly="readonly"/></p>
			<p>职业：<input id="dcareer" name="career" readonly="readonly"/></p>
			<p>地址：<input id="daddress" name="address" readonly="readonly"/></p>
			<p>电话：<input id="dmobile" name="mobile" readonly="readonly"/></p>
			<p>
				<img src="images/not_pic.jpg" id="dpic" name="picPath"/>
			</p>
			<p>
			<a class="closeBtn" href="javaScript:void(0)">关闭</a></p>
		</form>
	</div>
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/list.js"></script>
</body>
</html>