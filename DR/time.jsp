<%@ page import="java.util.Calendar,
        java.util.Date,
        java.text.SimpleDateFormat"
        pageEncoding="Windows-31J"
         contentType="text/html; charset=windows-31j" %>
<%! String today=null; %>
<html>
<head><title>JSP�̃e�X�g</title></head>
<body>
    <h1>���݂̓���</h1>
    <%
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd H:m:s");
        today = formatter.format(date);
    %>
    <p><%= today %></p>
    <p>name=${profile.name}</p>
    <p>pass=${profile.pass}</p>
</body>
</html>