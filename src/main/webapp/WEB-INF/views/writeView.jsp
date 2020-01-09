<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Spring Board</h3>
<form action="write" method="post">
	<table width="500" border="1">
			<tr>
				<td> 이름 </td>
				<td> <input name="bname" size = "50"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input name="btitle" size = "50"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea name="bcontent" rows="10" ></textarea> </td>
			</tr>
			<tr >
				<td colspan="2"> 
				<input type="submit" value="입력"> &nbsp;&nbsp; <a href="list">목록보기</a></td>
			</tr>
	</table>
	</form>
</body>
</html>