<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>A株式会社</title>
</head>
<body>
<%@include file="header.jsp" %>

<h1>商品検索画面</h1>
アイコンを選択してください．
<div>
<form method="post" action="/simpleWebShopping/FrontCont">
	<input type="hidden" name="BUTTON_ID" value="">
	<input type="hidden" name="item_id" value="">

	<table style="width: 728px, height: 481px">
	<c:forEach var="item" items="${requestScope.ItemList}" varStatus="count">

		<c:if test="${count.first}"><tr></c:if>
	<td>
	<p>
		<a href="/simpleWebShopping/FrontCont?BUTTON_ID=DETAIL&item_id=<c:out value="${item.item_id}"></c:out>">
			<img src="/simpleWebShopping/img/<c:out value ="${item.picture}"></c:out>" width="100px" height="100px">
		</a>
	</p>
	<p>
		<c:out value="${item.item_name}"></c:out><br>
		<input type="submit" value="詳細を見る"
		onclick="this.form.BUTTON_ID.value='DETAIL';
		this.form.item_id.value='<c:out value="${item.item_id}"></c:out>';">
	</p>
		<c:if test="${(count.count%3) == 0}"></tr><tr></c:if>
		<c:if test="${count.end}"></tr></c:if>
	</c:forEach>
	</table>
</form>

</div>
</body>
</html>