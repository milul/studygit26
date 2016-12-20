$("#loginDiv").dialog({
	title:"",
	width:240,
	height:140,
	closable:false,
	border:false,
	top:120
});

$('#btnLogin').linkbutton({    
    iconCls: 'icon-man'  ,
    onClick:function(){
    	$("#loginForm").submit();
    }
});  

$("#loginForm").form({
	 url:"user/login",   
	    success:function(data){   
	    	alert(data);
	       if(data.trim()=="true"){
	    	   location.replace("page/list.jsp");
	       }else{
	    	   $.messager.show({
	    			title:'登录失败',
	    			msg:'登录失败，编号与密码不匹配！！！',
	    			showType:'show',
	    			style:{
	    				right:'',
	    				top:document.body.scrollTop+document.documentElement.scrollTop,
	    				bottom:''
	    			}
	    		});

	       }    
	    }    

});
