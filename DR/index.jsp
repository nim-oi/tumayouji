<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>top画面</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class="header">
<h1>YUJE CHANNEL</h1>
<ul class="li">
    <li><a href="ThreadServlet?category=1">恋愛</a></li>
    <li><a href="ThreadServlet?category=2">プログラミング</a></li>
    <li><a href="ThreadServlet?category=3">スポーツ</a></li>
    <li><a href="ThreadServlet?category=4">ゲーム</a></li>
    <li><a href="ThreadServlet?category=5">学校</a></li>
    <li><a href="ThreadServlet?category=6">アニメ</a></li>
    <li><a href="ThreadServlet?category=7">ニュース</a></li>
    <li><a href="ThreadServlet?category=8">その他</a></li>
</ul>
<hr>
</div>

<div class="table">
<table>
    <c:forEach var="t" items="${tb}">
        <tr><td>${t.threadid}</td><td>日付：${t.threaddate}</td><td>カテゴリ
                <script>
                    var a ="恋愛";
                    var b ="プログラミング";
                    var c ="スポーツ";
                    var d ="ゲーム";
                    var e ="学校";
                    var f ="アニメ";
                    var g ="ニュース";
                    var h ="その他";
                    if(${t.category} == 1){
                        document.write(a);
                    }else if(${t.category} == 2){
                        document.write(b);
                    }
                    else if(${t.category} == 3){
                        document.write(c);
                    }
                    else if(${t.category} == 4){
                        document.write(d);
                    }
                    else if(${t.category} == 5){
                        document.write(e);
                    }
                    else if(${t.category} == 6){
                        document.write(f);
                    }
                    else if(${t.category} == 7){
                        document.write(g);
                    }
                    els	e if(${t.category} == 8){
                        document.write(h);
                    }
                </script></td><td>${t.username}</td></tr>
                <tr><td  colspan="4" class="title">タイトル：<a href="ResServlet?threadid=${t.threadid}">${t.threadname}</a></td></tr>
                <tr><td colspan="4" class="text">${t.threadtext}</td></tr>
    </c:forEach>

</table>
</div>
<p><a href="CreateThread.html">yuje</a></p>
</body>
</html>