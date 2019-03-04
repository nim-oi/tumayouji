<%@ page pageEncoding="windows-31j"
    contentType="text/html; charset=windows-31j" %>
<html>
<head lang="ja">
    <%--<link rel="stylesheet" type="text/css" href="css/style.css">--%>
    <link rel="stylesheet" type="text/css" href="css/CreateThread.css">
    <title>スレッド作成</title>
</head>
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
    <hr class="line">
</div>

<div class="create">
<h1>スレッド作成</h1>
<form method='post' action='ThreadServlet' name="cft" class="createthread">
    スレッドタイトル<br>
    <input type='text' name='thread_name' class="threadtitle" required><hr><br>
    カテゴリー<select name="category" class="threadcategory" required>
        <option value="1">恋愛</option>
        <option value="2">プログラミング</option>
        <option value="3">スポーツ</option>
        <option value="4">ゲーム</option>
        <option value="5">学校</option>
        <option value="6">アニメ</option>
        <option value="7">ニュース</option>
        <option value="8">その他</option>
        </select>
    <% if(session.getAttribute("user_id")==null){%>
    <input type="hidden" name="user_id" value="1" >
    <%}else{%>
    <input type="hidden" name="user_id" value= <%= session.getAttribute("user_id")%>>
    <%}%>
    投稿者名<input type='text' name='user_name' placeholder='匿名' required><hr><br>
    投稿内容<br>
    <textarea name='thread_text' cols='70' rows='20' placeholder='ここに入力' class="text" required></textarea><br>
    <input type='submit' value="作成したスレッドを投稿する" class="Transmission">
</form>
</div>
<br><br><br><br>


</html>