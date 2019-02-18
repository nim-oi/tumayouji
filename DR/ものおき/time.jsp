<%@ page import="java.util.Calendar,
        java.util.Date,
        java.text.SimpleDateFormat"
        pageEncoding="Windows-31J"
         contentType="text/html; charset=windows-31j" %>
<!--jsp準備、javaでimport必要ならimport-->


<%! String today=null; %>
<!--変数の宣言-->

<html>
<head><title>JSPのテスト</title></head>
<body>
    <h1>現在の日時</h1>

    <%
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd H:m:s");
        today = formatter.format(date);
    %>
<!--java記述-->

    <p><%= today %></p>
<!--変数の表示-->
    <p>name=${profile.name}</p>
    <p>pass=${profile.pass}</p>
<!--式言語-->
</body>
</html>