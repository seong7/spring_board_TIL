<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="modify" method="post">
	<table width="500"  border="1">
			<tr>
				<td> 번호 </td>
				<td><input name="bid"  readonly 
				value="${contentView.bid}"></td>
			</tr>
			<tr>
				<td> 히트 </td>
				<td>${contentView.bhit}</td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input  name="bname" value="${contentView.bname}"></td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td><input name="btitle" value="${contentView.btitle}"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td><textarea rows="10" name="bcontent">${contentView.bcontent}</textarea></td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="수정"> &nbsp;&nbsp; 
				<a href="list">목록보기</a> &nbsp;&nbsp; 
				<a href="delete?bid=${contentView.bid}">삭제</a> &nbsp;&nbsp; </td>
			</tr>
	</table>
	</form>
</body>
</html>






