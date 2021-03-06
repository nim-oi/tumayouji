<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>

<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>yuje channel</title>
    <%--<link rel="stylesheet" type="text/css" href="css/index.css">--%>
    <link rel="stylesheet" type="text/css" href="css/newindex.css">
    <%--<link rel="stylesheet" type="text/css" href="css/style.css">--%>

</head>
<body>
<div class="header">
    <div class="headerr">
    <h1><a href="ThreadServlet">YUJE CHANNEL</a></h1>
    <form method="post" action="SearchSevlet" class="search">
        <input type="text" name="ss" placeholder="スレッド検索">
        <input type="submit" value="検索">
    </form>
       <% if(session.getAttribute("user_name")==null){ %>
            <a href="loginPage.jsp" class="log1">ログイン<br>新規登録</a>
        <% }else{ %>

        <a href="MyPageServlet?user_id=<%= session.getAttribute("user_id") %>" class="log">マイページ</a>
        <% }%>
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

<div class="table">
    <p class="new"><a href="ThreadServlet">新着順</a>  <a href="ThreadServletAsc">投稿順</a></p>
    <c:forEach var="t" items="${tb}">
            <li class="aaa">
                <a href="ResServlet?threadid=${t.threadid}">
            <div class="threadname">${t.threadname}</div>
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
                <span class="username">作成者:${t.username}</span>
                <time class="threaddate">日付:${t.threaddate}</time>
            </div>

                </a>
            </li>
    </c:forEach>
</div>
<a href="CreateThread.jsp" class="btn-circle-flat">スレッドを作成</a>
</body>
</html>