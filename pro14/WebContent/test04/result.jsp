<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<%
  request.setCharacterEncoding("utf-8");
%>    


<html>
<head>
<meta charset="UTF-8">
<title>결과창</title>
</head>
<body>

	<c:if test="${empty param.userID}">
	아이디를 입력하세요 <br>
	<a href="login.jsp">로그인창가기</a>	
	</c:if>
	<c:if test="${not empty param.userID}">
	<h1> 환영합니다. <c:out value="${param.userID}"/>님!!! </h1> <br>
	</c:if>

</body>
</html>