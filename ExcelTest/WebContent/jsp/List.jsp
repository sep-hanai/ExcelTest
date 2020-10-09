<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>技術者一覧画面</title>
</head>
<body>
<h1>スキルシート管理システム：技術者一覧</h1>
<!-- 新規登録 -->
	<form>
		<input formaction="http://localhost:8080/ExcelTest/Add.jsp"
			type="submit" name="send" value="新規登録"
			style="width: 100px; height: 25px">
	</form>
<!-- 技術者一覧 -->
<form>
<table>
<tr>
<th>社員No.</th>
<th>名前</th>
</tr>
<tr>
<td></td>
<td></td>
</tr>
</table>
</form>
</body>
</html>