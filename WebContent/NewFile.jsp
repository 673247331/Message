<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="scripts/jquery-1.8.3.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<button value="a">按钮1</button>
<button value="b">按钮2</button>
<button value="c">按钮3</button>
<button value="z">按钮4</button>
<script type="text/javascript">
$(function(){
	$("button").click(function(){
		if($(this).val()=="z"){
			alert("可以进入")
		}else
			{
			alert("不能进入")
			}
	});
})
</script>

</body>
</html>