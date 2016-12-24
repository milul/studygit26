<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/springmvc-007-css/" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录</title>
<meta name="Keywords" content="登录" />
<link href="css/passport.css" rel="stylesheet" type="text/css" />
<link href="css/login.css" rel="stylesheet" type="text/css" />
</head>
<style type='text/css'>
.logon_centerBg {
	background: #c8e7be url(img/tu2.png) repeat-x 0 0;
}

.logon_centerBg .logon_center {
	background: url(img/tu1.jpg) no-repeat 0 0;
	width: 960px;
	margin: 0 auto;
}
</style>
<body>
	<div class='login_header'>
		<div class='container_48 clearfix'>
			<div class="grid_15 clearfix">
				<div class='top_right pub_top_right'>
					<a href="" target="_blank">CCS</a>
					&nbsp;&nbsp;|&nbsp;&nbsp;
					<a href=""	target="_blank">帮助中心</a>
				</div>
			</div>
		</div>
	</div>
	<div class='logon_centerBg'>
		<div class='logon_center pub_wap_bg'>
			<div class='container_48 clearfix'>
				<div class="grid_32 clearfix">&nbsp;</div>
				<div class="grid_1">&nbsp;</div>
				<div class="grid_15 clearfix">
					<div class='content_right'>
						<div class='cr_top'>
							<form id="fm1" method="post" onsubmit="return formSubmit();" autocomplete="off">
								<div class='ct_input'>
									<input id="username" name="a_name" class="input_text" 
									placeholder="用户名" type="text"/> 
								</div>

								<div class='ct_input'>
									<input id="password" name="a_pwd" class="input_text input_text_focus" 
										 placeholder="密码" type="password"/>
								</div>
								
								<div class='.ct_input'>
									<img alt="" src="vcode.jpg" id="img_check" >
									<input id="input_check" name="vcode" class="input_text input_text_check" 
										 placeholder="验证码" type="text"/>
								</div>
								
								<div class='ct_input'>
									<a href="forgetPwd.jsp" target="_blank"><h3>&nbsp;&nbsp;忘记密码</h3></a>
								</div>
								
								 <input	class="btn_login" name="submit" accesskey="l"
									value="登&nbsp;&nbsp;录" type="submit" />
							</form>
						</div>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<div class='login_footer'>
	<style>
		.bottom {
			text-align: center;
		}
		
		.bottom a {
			margin: 0 15px;
			color: #666;
		}
		
		.bottom a:hover {
			color: #666;
		}
	</style>
	</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/login.js"></script>
</body>
</html>