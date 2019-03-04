<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core タグライブラリ--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/ResPage.css">
        <title>Threadres</title>
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
    <div class="threaddeisplay">
        <div class="threadname">${tb.threadname}
            <span class="username">作成者:${tb.username}</span>
            <time class="threaddate">日付:${tb.threaddate}</time>
        </div>
        <p class="threadtext">${tb.threadtext}</p>
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
        }else if(${tb.category} == 2){
        document.write(b);
        }
        else if(${tb.category} == 3){
        document.write(c);
        }
        else if(${tb.category} == 4){
        document.write(d);
        }
        else if(${tb.category} == 5){
        document.write(e);
        }
        else if(${tb.category} == 6){
        document.write(f);
        }
        else if(${tb.category} == 7){
        document.write(g);
        }
        else if(${tb.category} == 8){
        document.write(h);
        }
        </script></span>
        </div>
    </div>

        <div class="table">
                <c:forEach var="r" items="${rb}">
                    <li class="bbb">
                        <div class="username">  作成者:${r.resname}    日付:${r.resdate}</div>
                        <p class="restext">${r.restext}</p>
                    </li>
                </c:forEach>
        </div>
    <br>
    <br>
    <br>  <br>
    <br>  <br>
    <br>
    <br>
    <br>
        <div class="resbox">
            <form method="post" action="ResServlet" class="res">
                <input type="hidden" name="threadid" value="${tb.threadid}">
                投稿者名<input type="text" name = "resname" placeholder="匿名" class="resnamebox" required>
                投稿内容
                    <textarea class="restexbox" name='restext' cols='50' rows='1' placeholder='ここに入力' required></textarea>
                <input type='submit' value="送信" >
            </form>
        </div>
    </body>
</html>