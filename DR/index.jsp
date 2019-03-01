<%@ page pageEncoding="windows-31j"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>yuje channel</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class="header">
    <div class="headerr">
    <h1><a href="ThreadServlet">YUJE CHANNEL</a></h1>
    <form method="post" action="SearchSevlet" class="search">
        <input type="text" name="ss" placeholder="�X���b�h����">
        <input type="submit" value="����">
    </form>
    </div>
<ul class="li">
    <li><a href="ThreadServlet?category=1">����</a></li>
    <li><a href="ThreadServlet?category=2">�v���O���~���O</a></li>
    <li><a href="ThreadServlet?category=3">�X�|�[�c</a></li>
    <li><a href="ThreadServlet?category=4">�Q�[��</a></li>
    <li><a href="ThreadServlet?category=5">�w�Z</a></li>
    <li><a href="ThreadServlet?category=6">�A�j��</a></li>
    <li><a href="ThreadServlet?category=7">�j���[�X</a></li>
    <li><a href="ThreadServlet?category=8">���̑�</a></li>
</ul>
<hr>
</div>

<div class="table">
    <c:forEach var="t" items="${tb}">
            <li class="aaa">
                <a href="ResServlet?threadid=${t.threadid}">
            <div class="threadname">${t.threadname}</div>
            <p class="threadtext">${t.threadtext}</p>
            <div class="card_detail">
            <span class="category"><script>
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
                </script></span>
                <span class="username">�쐬��:${t.username}</span>
                <!--             <span class="res_num res_balloon" title="���X��"></span> -->
                <!-- <span class="hit_num" title="HIT��">371HIT</span> -->
                <time class="threaddate">���t:${t.threaddate}</time>
            </div>

                </a>
            </li>
    </c:forEach>
</div>
<a href="CreateThread.html" class="btn-circle-flat">�X���b�h���쐬</a>
</body>
</html>