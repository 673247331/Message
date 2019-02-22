<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<form action="addMessage.do" method="post">
添加留言：<br/>
标题:<input type="text" name="title"/><br/>
内容:<input type="text" name="content"><br/>
心情:<label><input type="radio" name="happly" value="0"/>开心</label>
<label><input type="radio" name="happly" value="1"/>一般</label>
<label><input type="radio" name="happly" value="2"/>不开心</label>
<input type="submit" value="提交"/>
</form>

<body>
<form action="delMessage.do">
<table border="1">
<tr>
<td>留言编号</td>
<td>留言标题</td>
<td>留言内容</td>
<td>留言时间</td>
<td>心情</td>



</tr>

<c:forEach items="${list}" var="s"><tr>
 <td>${s.id}</td>
 <td>${s.title}</td>
 <td>${s.content}</td>
 <td>${s.time}</td>
 <td>${s.happly}</td>
 <td>
<input type="button" name="delete" value="删除" onclick="location.href='delMessage.do?tid=${s.id}'"/>
 </td>
 </tr>
</c:forEach>
</table>
<a href="index.jsp">返回主界面</a> 
</form>
</body>
</html>