<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新規会員登録</title>
</head>

<body>
	<%@ include file="header.jsp"%>
	<div>
	<form action="/simpleWebShopping/FrontCont" method="post">
	<table style="border-style: none;">
		<tr>
			<td>ログインID：</td>
			<td><input type="text" name="memberId" value="${CommonLoginMember.member.memberId}"></td>
		</tr>
		<tr>
			<td>パスワード：</td>
			<td><input type="password" name="password"></td>
		</tr>
	</table>
		<input type="submit" value="確認">
	</form>
	</div>
</body>
</html>