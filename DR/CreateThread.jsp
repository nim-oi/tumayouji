<%@ page pageEncoding="windows-31j"
    contentType="text/html; charset=windows-31j" %>
<html>
<head lang="ja">
    <%--<link rel="stylesheet" type="text/css" href="css/style.css">--%>
    <link rel="stylesheet" type="text/css" href="css/CreateThread.css">
    <title>�X���b�h�쐬</title>
</head>
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
    <hr class="line">
</div>

<div class="create">
<h1>�X���b�h�쐬</h1>
<form method='post' action='ThreadServlet' name="cft" class="createthread">
    �X���b�h�^�C�g��<br>
    <input type='text' name='thread_name' class="threadtitle" required><hr><br>
    �J�e�S���[<select name="category" class="threadcategory" required>
        <option value="1">����</option>
        <option value="2">�v���O���~���O</option>
        <option value="3">�X�|�[�c</option>
        <option value="4">�Q�[��</option>
        <option value="5">�w�Z</option>
        <option value="6">�A�j��</option>
        <option value="7">�j���[�X</option>
        <option value="8">���̑�</option>
        </select>
    <% if(session.getAttribute("user_id")==null){%>
    <input type="hidden" name="user_id" value="1" >
    <%}else{%>
    <input type="hidden" name="user_id" value= <%= session.getAttribute("user_id")%>>
    <%}%>
    ���e�Җ�<input type='text' name='user_name' placeholder='����' required><hr><br>
    ���e���e<br>
    <textarea name='thread_text' cols='70' rows='20' placeholder='�����ɓ���' class="text" required></textarea><br>
    <input type='submit' value="�쐬�����X���b�h�𓊍e����" class="Transmission">
</form>
</div>
<br><br><br><br>


</html>