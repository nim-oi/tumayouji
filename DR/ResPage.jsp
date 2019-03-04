<%@ page pageEncoding="windows-31J"
         contentType="text/html;charset=windows-31j" %>
<%--JSTL 1.1.2 core �^�O���C�u����--%>
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
    <div class="threaddeisplay">
        <div class="threadname">${tb.threadname}
            <span class="username">�쐬��:${tb.username}</span>
            <time class="threaddate">���t:${tb.threaddate}</time>
        </div>
        <p class="threadtext">${tb.threadtext}</p>
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
                        <div class="username">  �쐬��:${r.resname}    ���t:${r.resdate}</div>
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
                ���e�Җ�<input type="text" name = "resname" placeholder="����" class="resnamebox" required>
                ���e���e
                    <textarea class="restexbox" name='restext' cols='50' rows='1' placeholder='�����ɓ���' required></textarea>
                <input type='submit' value="���M" >
            </form>
        </div>
    </body>
</html>