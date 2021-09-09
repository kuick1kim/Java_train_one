<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 

    isELIgnored="false"  %>
    
<%
   request.setCharacterEncoding("UTF-8");
  
%>   
<jsp:useBean id="m" class="sec01.ex01.MemberBean" />
<jsp:setProperty property="*" name="m"/>
<html>
<head>
<meta charset=”UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<table border="1"  align="center" >
    <tr align="center" bgcolor="#99ccff">
      <td width="100px"><b>아이디</b></td>
      <td width="100px"><b>비밀번호</b></td>
      <td width="100px" ><b>이름</b></td>
      <td width="150px"><b>이메일</b></td>
      
   </tr>
    <tr align=center>
      <td><%=m.getId() %></td>
      <td><%=m.getPwd() %></td>
      <td><%=m.getName() %></td>
      <td><%=m.getEmail() %></td>
   </tr>
   
   <tr align=center>
      <td>${param.id} </td>
      <td>${param.pwd} </td>
      <td>${param.name} </td>
      <td>${param.email} </td>
   </tr>
</table>
<a href="memberForm.jsp"> 뒤로가기</a> <!-- 김민상스스로 작성 -->
</body>
</html>
