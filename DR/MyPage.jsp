<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/MyPage.css">
    <title>login</title>
</head>
<body>
<div class="header">
    <div class="headerr">
        <h1><a href="ThreadServlet">YUJE CHANNEL</a></h1>
        <p><a href="LogoutServlet">ログアウト</a></p>
    </div>
</div>

<h1 class="Registration">登録名：<%= session.getAttribute("user_name")%></h1>
<div class="table">
    <c:forEach var="t" items="${mt}">
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
                <a href="DeleteServlet?thread_id=${t.threadid}" class="delete">削除</a>
            </div>
        </a>
    </li>
    </c:forEach>
</div>
</body>
</html>