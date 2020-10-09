<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<h1>スキルシート管理システム：ログイン</h1>
	<form method="POST">
		<table style="border-collapse: collapse;">
			<tr>
				<th class="id">ID：</th>
				<td><input style="border =1: width:40px;" type="text" name="id"></td>
			</tr>
			<tr>
				<th class="password">パスワード：</th>
				<td><input style="border =1: width:40px;" type="text"
					name="password"></td>
			</tr>
		</table>
		<div class="btn">
			<input type="hidden" value="login" name="flg"> <input
				type="submit" value="ログイン" class="btn">
		</div>
	</form>
	<!-- エラー文受け取り -->
	<%
		String errmsg = (String) request.getAttribute("errmsg");
	%>
	<%
		if (errmsg != null) {
	%>
	<p>エラーメッセージ</p>
	<div
		style="padding: 10px; margin-bottom: 10px; border: 5px double #333333;">
		<%
			{
					out.println(errmsg);
				}
		%><br>
	</div>
	<%
		}
	%>
</body>
</html>