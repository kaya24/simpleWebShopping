<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品詳細</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>商品詳細</h1>

<table style="width: 931px, height: 677px" border="1">
	<tr>
		<th>商品ID</th>
        <th>商品名</th>
        <th>価格</th>
        <th>在庫数</th>
 	</tr>
	<tr>
	<td><c:out value="${item.item_id}"></c:out></td>
	<td><c:out value="${item.item_name}"></c:out></td>
	<td><c:out value="${item.price}"></c:out></td>
	<td><c:out value="${item.quantity}"></c:out></td>
	</tr>
</table>
</body>
</html>