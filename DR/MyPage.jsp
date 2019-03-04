<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
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
        <p><a href="LogoutServlet">���O�A�E�g</a></p>
    </div>
</div>

<h1 class="Registration">�o�^���F<%= session.getAttribute("user_name")%></h1>
<div class="table">
    <c:forEach var="t" items="${mt}">
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
                <time class="threaddate">���t:${t.threaddate}</time>
                <a href="DeleteServlet?thread_id=${t.threadid}" class="delete">�폜</a>
            </div>
        </a>
    </li>
    </c:forEach>
</div>
</body>
</html>