<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
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
    <%--<div class="table">--%>
        <%--<c:forEach var="t" items="${tb}">--%>
            <%--<li class="aaa">--%>
                <%--<a href="ResServlet?threadid=${t.threadid}">--%>
                    <%--<div class="threadname">${t.threadname}</div>--%>
                    <%--<p class="threadtext">${t.threadtext}</p>--%>
                    <%--<div class="card_detail">--%>
            <%--<span class="category"><script>--%>
                    <%--var a ="����";--%>
                    <%--var b ="�v���O���~���O";--%>
                    <%--var c ="�X�|�[�c";--%>
                    <%--var d ="�Q�[��";--%>
                    <%--var e ="�w�Z";--%>
                    <%--var f ="�A�j��";--%>
                    <%--var g ="�j���[�X";--%>
                    <%--var h ="���̑�";--%>
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
                        <%--<span class="username">�쐬��:${t.username}</span>--%>
                        <%--<!--             <span class="res_num res_balloon" title="���X��"></span> -->--%>
                        <%--<!-- <span class="hit_num" title="HIT��">371HIT</span> -->--%>
                        <%--<time class="threaddate">���t:${t.threaddate}</time>--%>
                    <%--</div>--%>

                <%--</a>--%>
            <%--</li>--%>
        <%--</c:forEach>--%>
    <%--</div>--%>
            <div class="table">
                <c:forEach var="r" items="${rb}">
                    <li class="bbb">
                        <div class="username">�쐬��:${r.resname}</div>
                        <p class="restext">${r.restext}</p>
                    </li>
                </c:forEach>
            </div>
    <div class="resbox">
    <form method="post" action="ResServlet" class="res">
        <input type="hidden" name="threadid" value="${thread_id}">
        ���e�Җ�<input type="text" name = "resname" placeholder="����" class="resnamebox"><br>
        ���e���e<br>
        <textarea class="restexbox" name='restext' cols='50' rows='10' placeholder='�����ɓ���' required></textarea><br>
        <input type='submit' value="���M" >
    </form>
    </div>
    </body>
</html>