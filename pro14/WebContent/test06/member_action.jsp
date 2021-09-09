<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*, sec02.ex01.*"
    isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<%
  request.setCharacterEncoding("UTF-8");
%>   

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<jsp:useBean id="m" class="sec02.ex01.MemberBean" />
<jsp:setProperty property="*" name="m"/>

<%
	MemberDAO memDao = new MemberDAO();
	memDao.addMember(m);
	List membersList = memDao.listMembers();
	request.setAttribute("membersList", membersList);
%>
<title>포워딩 되는</title>
</head>
<body>
	<jsp:forward page="membersList.jsp" />
</body>
</html>