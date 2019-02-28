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
    <h1><a href="index.jsp">YUJE CHANNEL</a></h1>
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
    <c:forEach var="t" items="${tb}">
        <li class="aaa">
            <div class="threadname"><a href="ResServlet?threadid=${t.threadid}">${t.threadname}</a></div>
            <p class="threadtext">${t.threadtext}</p>
            <div class="card_detail">
            <span class="category"><script>
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
                    else if(${t.category} == 8){
                        document.write(h);
                    }
                </script></span>
                <span class="username">${t.username}</span>
                <!--             <span class="res_num res_balloon" title="レス数"></span> -->
                <!-- <span class="hit_num" title="HIT数">371HIT</span> -->
                <time class="threaddate">${t.threaddate}</time>
            </div>
        </li>
    </c:forEach>
</div>
<a href="CreateThread.html" class="btn-circle-flat">スレッドを作成</a>
<p><a href="CreateThread.html">yuje</a></p>
</body>
</html>