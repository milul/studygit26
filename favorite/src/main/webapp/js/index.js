		$("#listFavorites").panel({
			fit : true,
			title : " ",
			border : false,
		});
		
		$("#addFav").dialog({
			width:380,
			title:'',
			border:false,
			modal:true
		});
		
		$("#addFav").dialog("close", true);
		$("#labels_table td").hover(selectLabel);
		loadTagInfo();
	
	function loadTagInfo(){
		//以异步的方式取到所有书签的信息
		$.post("/favorite/tag/all", function(data){
			var tagTagetStr = "";
			
			for (var i = 0; i < data.length; i++) {
				tagTagetStr+='<tr><td><a href="fav/list?ftags=' + data[i].tname + '">'+ 
					data[i].tname + '('+  data[i].tcount +')' + '</a></td></tr>';
			}
			
			$("#labelContent")[0].innerHTML = tagTagetStr;
			
			$("#labels_table td").hover(selectLabel);
			
			$("#labels_table a").click(function(){
				listFav(this.href);
				return false;
			});
		}, "json");
	}

	function add(){
		$("#addFav").dialog("open", true);
	}
	
	function addWinClose(){
		$("#addFav").dialog("close", true);
		return false;
	}
	
	function  selectLabel(){
		$("#labels_table td").removeClass("selected_label");
		$(this).addClass("selected_label");
	}
	
	function addFavorite(){
		$.post("fav/add", $("#addFavForm").serialize(), function(data){
			addWinClose();  //关闭添加书签窗口
			var resultStr;
			if(data){
				//重新加载书签信息
				loadTagInfo();
				resultStr="成功...";
			}else{
				resultStr="失败!!!";
			}
			//添加书签结果信息
			$.messager.show({
				title:'添加书签信息',
				msg:'添加书签'+resultStr,
				showType:'show',
				style:{
					top:document.body.scrollTop+document.documentElement.scrollTop,
				}
			});
			

		}, "json");
		
		return false;
	}
	
function listFav(url){
	$.post(url, function(data){
		$("#listFavorites").empty();
		var listStr ="";
		for (var i = 0; i < data.length; i++) {
			listStr +='<div style="padding: 6px 10px;">'
			+'<div>'
			+'<a href="' +data[i].furl+ '"'
			+'style="color: blue; font-size: 18px;" target="_blank">'+ data[i].flabel+'</a>'
			+'</div>'
			+'<div style="color: black; font-size: 16px;">' +data[i].fdesc+ '</div>'
			+'<div style="color: green; font-size: 14px;">'+data[i].furl+'</div>'
			+'</div>'
			}
		$("#listFavorites").html(listStr)
	}, "json");
	
}
listFav("fav/list?ftags=");//加载全部的书签