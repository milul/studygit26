$('#userList').datagrid({    
    url:'user/list',    
    fitColumns:true,
	singleSelect:true,
	pageList:[5,10,15,20,25,30],
	pagination:true,
    columns:[[    
        {field:'id',title:'编号',width:50,align:'center'},    
        {field:'name',title:'姓名',width:50,align:'center'},    
        {field:'birthday',title:'生日',width:80,align:'center'}, 
        {field:'gender',title:'性别',width:50,align:'center'}, 
        {field:'career',title:'职位',width:50,align:'center'}, 
        {field:'address',title:'地址',width:100,align:'center'}, 
        {field:'mobile',title:'电话',width:100,align:'center'}, 
        {field:'picPath',
         title:'图像',
         width:100,
         align:'center',
         formatter: function(value,row,index){
     		if(value==null){
     			return "<img width='100' src='images/not_pic.jpg'/>"
     		}else{
     			return "<img width='100' src='"+value+"'/>"
     		}
     		}
         }, 
        {	
        	field:'operator',
        	title:'操作',
        	width:120,
        	align:'center',
        	formatter: function(value,row,index){
        		var oprStr='<a class="detailBtn" href="javaScript:void(0)" onClick="openDetail('+index+')">详情</a>'+
        		'&nbsp;<a class="modifyBtn" href="javaScript:void(0)" onClick="openUpdate('+index+')">修改</a>&nbsp;'+
        		'<script>$(".detailBtn").linkbutton({iconCls: "icon-search"});'+
        		'$(".modifyBtn").linkbutton({iconCls:"icon-edit"});</script>';
				return oprStr;
			}
        },   
    ]]    
});  

$("#modifyDiv").dialog({
	title:"用户修改",
	closable:false
});

$("#modifyForm").form({
	 url:"user/modify",    
	 success:function(data){  
		 if(data==""){
			 $.messager.alert('用户修改','当前用户没有修改用户信息的权限','warning');
			 $("#modifyDiv").dialog("close");//关闭修改框
			 return;
		 }
		 if(data.trim()=="true"){
			
			 $('#userList').datagrid("reload");//刷新修改数据
		 }else{
			 $.messager.show({
					title:'修改信息',
					msg:'修改失败!!!',
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
$("#modifyDiv").dialog("close");
$(".closeBtn").linkbutton({
	iconCls: "icon-cancel",
	onClick:function(){
		$("#modifyDiv").dialog("close");
	}
});
$(".updateBtn").linkbutton({
	iconCls: "icon-ok",
	onClick:function(){
		$("#modifyForm").submit();
	}	
});

 function openUpdate(index){
	 $("#modifyDiv").dialog("open");
	 var row= $("#userList").datagrid("getRows")[index];
	 $("#uid").val(row.id);
	 $("#uname").val(row.name);
	 $("#ubirthday").val(row.birthday);
	 $("#ugender").val(row.gender);
	 $("#ucareer").val(row.career);
	 $("#uaddress").val(row.address);
	 $("#umobile").val(row.mobile);
	 if(row.picPath){
		 $("#pic").attr("src",row.picPath);
	 }
 }
 function chgPic(obj){
	 $("#pic").attr("src",window.URL.createObjectURL(obj.files[0]));
 }
 
 $("#detailDiv").dialog({
		title:"用户详情",
		closable:false
	});
 $("#detailForm").form({
		 url:"user/modify"
	});
 $("#detailDiv").dialog("close");
 function openDetail(index){
	
	 $("#detailDiv").dialog("open");
	 var row= $("#userList").datagrid("getRows")[index];
	 $("#did").val(row.id);
	 $("#dname").val(row.name);
	 $("#dbirthday").val(row.birthday);
	 $("#dgender").val(row.gender);
	 $("#dcareer").val(row.career);
	 $("#daddress").val(row.address);
	 $("#dmobile").val(row.mobile);
	 if(row.picPath){
		 $("#dpic").attr("src",row.picPath);
	 }
 }
 $(".closeBtn").linkbutton({
		iconCls: "icon-cancel",
		onClick:function(){
			$("#detailDiv").dialog("close");
		}
	});