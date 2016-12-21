<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <h1 style="color:red;">${sessionScope.errorMSg }  ===== ${param.errorMSg }</h1> --%>
	<h1>session errorMsg ===> ${sessionScope.errorMsg }</h1>
	<h1>session errorMsg02 ===> ${sessionScope.errorMsg02 }</h1>
	<h1>session errorMsgCode ===> ${sessionScope.errorMsgCode }</h1>
	<h1>request errorMsgCode ===> ${requestScope.errorMsgCode }</h1>
	<h1>request errorMsg ===> ${requestScope.errorMsg }</h1>
	<h1>request errorMsg02 ===> ${requestScope.errorMsg02 }</h1>
	<h1>
		你好<span style="color: green; font-size: 200%">${user.uname }</span>， 我是springmvc框架， 欢迎你使用我，
		我是不是很帅！！！！！
	</h1>
</body>
</html>