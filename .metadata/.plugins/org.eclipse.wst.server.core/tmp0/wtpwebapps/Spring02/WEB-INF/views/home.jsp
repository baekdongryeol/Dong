<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="resources/myLib/myStyle.css">
	<script src="resources/myLib/jquery-3.2.1.min.js"></script>
	<script src="resources/myLib/axTest01.js"></script>
</head>
<body>
<h1> Hello Spring !!! </h1>
<P> Start time : ${serverTime}</P>
<c:if test="${not empty loginID}">
=> ${loginName} 님 안녕하세요 ~~<br> 
</c:if>
<c:if test="${not empty message}">
	<hr>
	=> ${message}<br>
</c:if>
<hr>
<img src="resources/image/tulips.png" width="400" height="300">
<div id="resultArea"></div>
<hr>
<c:if test="${empty loginID}">
	<a href="loginf">Login</a>&nbsp;&nbsp;
	<span id="axloginf" class="textLink">axLoginf</span>&nbsp;&nbsp;
	<a href="joinf">회원가입</a><br>
</c:if>
<c:if test="${not empty loginID}">
	<a href="mdetail">MyInfo</a>&nbsp;&nbsp;
	<a href="logout">Logout</a>&nbsp;&nbsp;
	<a href="mdelete">회원탈퇴</a><br>
</c:if>
<hr>
<a href="mlist">MList</a>&nbsp;&nbsp;
<a href="mpagelist">MPList</a>&nbsp;&nbsp;
<a href="mcplist">MCriPL</a>&nbsp;&nbsp;
<a href="blist">BList</a>&nbsp;&nbsp;
<a href="bpagelist">BPList</a>&nbsp;&nbsp;
<a href="bcplist">BCriPL</a><br>
<a href="axtestf">AxTest</a>&nbsp;
<a href="mchecklist">mCheck</a>&nbsp;
<a href="bchecklist">bCheck</a>&nbsp;
<a href="bcrypt">BCrypt</a>&nbsp;
<a href="etest">Exception</a><br>
<a href="logj">Log4J</a>&nbsp;
<a href="member/list">Member2</a>&nbsp;
	<!-- 요청명 : green/member/list -->
<a href="member/memberList2">vName생략1</a>&nbsp;
<a href="member/loginFormTest">vName생략2</a><br>
<a href="greensn">GreenSN</a>&nbsp;
<a href="greenall">GreenAll</a>&nbsp;
<a href="jeju">JeJu</a>&nbsp;
<hr>

</body>
</html>
