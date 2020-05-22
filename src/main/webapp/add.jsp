<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		$.post("queryTeacherAll",function(data){
			for(var i in data){
				$("#teacher").append("<option value='"+data[i].tid+"'>"+data[i].tname+"</option>");
			}
		},"json");
	});
</script>
</head>
<body>
	<form action="addInfo" method="post">
		宿舍号：<input type="text" name="name" placeholder="请输入宿舍号"><br>
		负责老师：<select name="tid" id="teacher">
			<option value="">--请选择负责老师--</option>
		</select><br>
		<input type="submit" value="添加" onclick="add()">		
	</form>
</body>
</html>