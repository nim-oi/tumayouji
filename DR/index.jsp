<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>top���</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class="header">
<h1>YUJE CHANNEL</h1>
<ul class="li">
    <li><a href="/ServletThread?category=1">����</a></li>
    <li><a href="/ServletThread?category=2">�v���O���~���O</a></li>
    <li><a href="/ServletThread?category=3">�X�|�[�c</a></li>
    <li><a href="/ServletThread?category=4">�Q�[��</a></li>
    <li><a href="/ServletThread?category=5">�w�Z</a></li>
    <li><a href="/ServletThread?category=6">�A�j��</a></li>
    <li><a href="/ServletThread?category=7">�j���[�X</a></li>
    <li><a href="/ServletThread?category=8">���̑�</a></li>
</ul>
<hr>
</div>

<div class="table">
<table border="1">
    <tr><th>�ԍ�</th><th>�X���b�h�^�C�g��</th><th>���t</th><th>�J�e�S���[</th><th>���[�U�[��</th></tr>
    <c:forEach var="t" items="${tb}">
        <tr><td>${t.threadid}</td><td><a href="/ResServlet?threadid=${t.threadid}">${t.threadname}</a></td><td>${t.threaddate}</td><td>
                <script>
                    var a ="����";
                    var b ="�v���O���~���O";
                    var c ="�X�|�[�c";
                    var d ="�Q�[��";
                    var e ="�w�Z";
                    var f ="�A�j��";
                    var g ="�j���[�X";
                    var h ="���̑�";
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
                </script></td><td>${t.username}</td></tr>
                <tr><td colspan="5">${t.threadtext}</td></tr>
    </c:forEach>

</table>
</div>
<p><a href="CreateThread.html">yuje</a></p>
</body>
</html>