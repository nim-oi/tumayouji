<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>top画面</title>
</head>
<body>
<%! String category; %>
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


<table border="1">
    <tr><th>番号</th><th>スレッドタイトル</th><th>日付</th><th>カテゴリー</th><th>ユーザー名</th><th>スレッド内容</th></tr>
    <c:forEach var="t" items="${tb}">
        <tr><td>${t.threadid}</td><td><a href="/ResServlet?threadid=1">${t.threadname}</a></td><td>${t.threaddate}</td><td>${t.category}</td><td>${t.username}</td><td>${t.threadtext}</td></tr>
    </c:forEach>

</table>
<p><a href="CreateThread.html">yuje</a></p>
</body>
</html>