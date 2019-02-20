<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>

<%--JSTL 1.1.2 core タグライブラリ--%>
<html>
<head><title>登録されたユーザー</title></head>
<body>
	<ul>
	<li><a href="/ServletThread?category=1">恋愛</a></li>
	<li><a href="/ServletThread?category=2">プログラミング</a></li>
	<li><a href="/ServletThread?category=3">スポーツ</a></li>
	<li><a href="/ServletThread?category=4">ゲーム</a></li>
	<li><a href="/ServletThread?category=5">学校</a></li>
	<li><a href="/ServletThread?category=6">アニメ</a></li>
	<li><a href="/ServletThread?category=7">ニュース</a></li>
	<li><a href="/ServletThread?category=8">その他</a></li>
		
	
	</ul>
	<h1>登録されたユーザー</h1>
	<table border="1">
		<tr><th>ユーザー名</th><th>パスワード</th><th>パスワード</th><th>パスワード</th><th>パスワード</th></tr>
		<c:forEach var="tb" items="${tb}">
			<tr><td>${tb.thread_name}</td><td>${tb.thread_date}</td><td>${ublist.user_pass}</td><td>${ublist.user_age}</td><td>${ublist.user_sex}</td></tr>
		</c:forEach>
	</table>
	
</body>
</html>
