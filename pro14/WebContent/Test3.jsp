<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.*"
    isELIgnored="false" %>
    
    <jsp:useBean id="m1" class="sec01.ex01.MemberBean" scope="page" />
    <jsp:setProperty property="name" name="m1" value="이순신"/>
    <jsp:useBean id="m2" class="java.util.ArrayList" scope="page" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어의 여러 연산자들</title>
</head>
<body>
	<h1> 여러가지 논리 연산자 </h1>

	<h3> 
	\${empty m1}:${empty m1}<br>
	\${not empty m1}:${not empty m1}<p>
	
	
	\${empty m2}:${empty m2}<br>
	\${not empty m2}:${not empty m2}<p>
	
	
	\${empty "hellow"}:${empty "hello"}<br>
	
	\${empty null}:${empty null}<br>
		
		
	\${empty ""}:${empty ""}<br>
</h3>
</body>
</html>