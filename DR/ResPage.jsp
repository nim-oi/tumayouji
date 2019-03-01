<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <title>threadres</title>
    </head>
    <body>
    <div class="header">
        <div class="headerr">
            <h1><a href="ThreadServlet">YUJE CHANNEL</a></h1>

        </div>
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
    <%--<div class="table">--%>
        <%--<c:forEach var="t" items="${tb}">--%>
            <%--<li class="aaa">--%>
                <%--<a href="ResServlet?threadid=${t.threadid}">--%>
                    <%--<div class="threadname">${t.threadname}</div>--%>
                    <%--<p class="threadtext">${t.threadtext}</p>--%>
                    <%--<div class="card_detail">--%>
            <%--<span class="category"><script>--%>
                    <%--var a ="恋愛";--%>
                    <%--var b ="プログラミング";--%>
                    <%--var c ="スポーツ";--%>
                    <%--var d ="ゲーム";--%>
                    <%--var e ="学校";--%>
                    <%--var f ="アニメ";--%>
                    <%--var g ="ニュース";--%>
                    <%--var h ="その他";--%>
                    <%--if(${t.category} == 1){--%>
                        <%--document.write(a);--%>
                    <%--}else if(${t.category} == 2){--%>
                        <%--document.write(b);--%>
                    <%--}--%>
                    <%--else if(${t.category} == 3){--%>
                        <%--document.write(c);--%>
                    <%--}--%>
                    <%--else if(${t.category} == 4){--%>
                        <%--document.write(d);--%>
                    <%--}--%>
                    <%--else if(${t.category} == 5){--%>
                        <%--document.write(e);--%>
                    <%--}--%>
                    <%--else if(${t.category} == 6){--%>
                        <%--document.write(f);--%>
                    <%--}--%>
                    <%--else if(${t.category} == 7){--%>
                        <%--document.write(g);--%>
                    <%--}--%>
                    <%--else if(${t.category} == 8){--%>
                        <%--document.write(h);--%>
                    <%--}--%>
                <%--</script></span>--%>
                        <%--<span class="username">作成者:${t.username}</span>--%>
                        <%--<!--             <span class="res_num res_balloon" title="レス数"></span> -->--%>
                        <%--<!-- <span class="hit_num" title="HIT数">371HIT</span> -->--%>
                        <%--<time class="threaddate">日付:${t.threaddate}</time>--%>
                    <%--</div>--%>

                <%--</a>--%>
            <%--</li>--%>
        <%--</c:forEach>--%>
    <%--</div>--%>
            <div class="table">
                <c:forEach var="r" items="${rb}">
                    <li class="bbb">
                        <div class="username">作成者:${r.resname}</div>
                        <p class="restext">${r.restext}</p>
                    </li>
                </c:forEach>
            </div>
    <div class="resbox">
    <form method="post" action="ResServlet" class="res">
        <input type="hidden" name="threadid" value="${thread_id}">
        投稿者名<input type="text" name = "resname" placeholder="匿名" class="resnamebox"><br>
        投稿内容<br>
        <textarea class="restexbox" name='restext' cols='50' rows='10' placeholder='ここに入力' required></textarea><br>
        <input type='submit' value="送信" >
    </form>
    </div>
    </body>
</html>