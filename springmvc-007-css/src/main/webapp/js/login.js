function formSubmit() {
	var params = $('#fm1').serialize()
	$.post("admin/login", params, function(data) {
		if (data != false ) {
			if(data.root < 10){
				location.href = 'page/admin.jsp'
			}else{
				location.href = 'page/superAdmin.jsp'
			}
		} else {
			$("#username").val("")
			$("#password").val("")
			alert("账号或者密码有误...")
		}
	}, "json")
	return false
}

$(function() {
		/*$.get("admin/isLogin", function(data) {
			if (data != false ) {
				if(data.root < 10){
					location.href = 'page/admin.jsp'
				}else{
					location.href = 'page/superAdmin.jsp'
				}
			} 
			flag = false
		}, "json")*/
});