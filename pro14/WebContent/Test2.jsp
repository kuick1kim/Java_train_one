<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어에서 사용되는 데이터들</title>
</head>
<body>
	<h1> 표현언어에서 사용되는 데이터들 </h1>

	<h1> 
		\${10+10}:${10+10}<br>
		\${20-10}:${20-10}<br>
		\${10*10}:${10*10}<br>
		\${100/9}:${100/9}<br>
	<%-- 	\${100 div 9}:${100 div 9}<br> --%>
   \${100%9} : ${100%9}<br>
   \${100 mod 9} : ${100 mod 9}<br>
		
</h1>
</body>
</html>