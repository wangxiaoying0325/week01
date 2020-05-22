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
	<form action="queryAll">
		<input type="text" name="name" placeholder="请输入宿舍号">
		<select name="status">
			<option value="">--请选择收被状态--</option>
			<option value="0">晾被中</option>
			<option value="1">已收被</option>
		</select>
		<select name="tname">
			<option value="">--请选择负责老师--</option>
			<c:forEach items="${tlist }" var="t">
				<option value="${t.tname}">${t.tname }</option>
			</c:forEach>
		</select>
		<input type="submit" value="查询">
		<a href="add.jsp"><input type="button" value="添加"></a>
	</form>
	<table>
		<tr>
			<td>id</td>
			<td>宿舍号</td>
			<td>负责老师</td>
			<td>晾被时间</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="i">
			<tr>
				<td>${i.id }</td>
				<td>${i.name }</td>
				<td>${i.tname }</td>
				<td>${i.uptime }</td>
				<td>${i.status==1?"已收被":"晾被中"}</td>
				<td>
					<c:if test="${i.status==1 }">
						<a href="queryById?id=${i.id }">查看</a>
					</c:if>
					<c:if test="${i.status==0 }">
						<a href="updateInfo?id=${i.id }">收被</a>
					</c:if>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6">
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${page.pageNum-1 < 1 ? page.pageNum : page.pageNum-1 }">上一页</a>
				<a href="?pageNum=${page.pageNum+1 > page.pages ? page.pageNum : page.pageNum+1 }">下一页</a>
				<a href="?pageNum=${page.pages }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>