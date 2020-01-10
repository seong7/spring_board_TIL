<!-- list.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Spring Board</h3>
<table width="500" border="1">
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>제목</td>
		<td>날짜</td>
		<td>히트</td>
	</tr>
	<c:forEach var="dto" items="${list}" >
	<tr>
		<td>${dto.bid}</td>
		<td>${dto.bname}</td>
		<td><a href="contentView?bid=${dto.bid}">${dto.btitle}</a></td>
		<td>${dto.bdate}</td>
		<td>${dto.bhit}</td>
	</tr>	
	</c:forEach>
	<tr>
		<td colspan="5"><a href="writeView">글작성</a></td>
	</tr>
</table>
</body>
</html>





