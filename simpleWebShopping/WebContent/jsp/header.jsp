<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<meta charset="UTF-8">

<link rel="stylesheet" href="/simpleWebShopping/css/common.css"
	type="text/css" />

<div id="wrapper">

	<div>
		<a href="/simpleWebShopping/FrontCont?BUTTON_ID=TOP">A株式会社</a><br>
	</div>

	<div id="header">
		<c:if test="${empty CommonLoginMember}">
			<div id="nav">
				<ul>
					<li>こんにちは ゲスト様</li>
				</ul>
			</div>
			<div id="nav">
				<ul>
					<li><a
						href="/simpleWebShopping/FrontCont?BUTTON_ID=NEWACCOUNT">新規会員登録</a></li>
					<li><a
						href="/simpleWebShopping/FrontCont?BUTTON_ID=SHOPPING_CART">ショッピングカート</a></li>
					<li><a href="/simpleWebShopping/FrontCont?BUTTON_ID=LOGIN">ログイン</a></li>
				</ul>
			</div>
		</c:if>

		<c:if test="${not empty CommonLoginMember}">
			<div id="nav">
				<ul>
					<li>ようこそ <c:out value="${CommonLoginMember.member.memberName}"></c:out>さん</li>
				</ul>
			</div>
			<div id="nav">
				<ul>
					<li><a
						href="/simpleWebShopping/FrontCont?BUTTON_ID=NEWACCOUNT">会員情報照会</a></li>
					<li><a
						href="/simpleWebShopping/FrontCont?BUTTON_ID=SHOPPING_CART">ショッピングカート</a></li>
					<li><a href="/simpleWebShopping/FrontCont?BUTTON_ID=LOGIN">ログアウト</a></li>
				</ul>
			</div>
		</c:if>

	</div>


</div>