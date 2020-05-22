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
</head>
<body>
	<form action="queryAll" method="post">
		宿舍号：<input type="text" name="id" value="${info.id }" readonly="readonly"><br>
		负责老师：<select name="tid">
					<option value="">--请选择负责老师--</option>
					<c:forEach items="${tlist }" var="t">
						<option value="${t.tid}" <c:if test="${info.tid==t.tid }">selected="selected"</c:if>>${t.tname }</option>
					</c:forEach>
				</select><br>
		晾被时间：<input type="text" name="id" value="${info.uptime }" readonly="readonly"><br>
		状态：<select name="status">
					<option value="">--请选择收被状态--</option>
					<option value="0" <c:if test="${info.status==0 }">selected="selected"</c:if>>晾被中</option>
					<option value="1" <c:if test="${info.status==1 }">selected="selected"</c:if>>已收被</option>
				</select><br>
				<input type="submit" value="返回"> 
	</form>
</body>
</html>