<%@page contentType="text/html; charset=UTF-8"%>

<html>
<body>
<jsp:useBean id="CUser"  class="beansdomain.Cuser" scope="session" />

検索結果
<table border="1">
<tr><th>商品ID</th><th>定価</th><th>価格</th><th>商品名</th></tr>
<tr>
<td><jsp:getProperty name="CUser" property="cuserid" /></td>
<td><jsp:getProperty name="CUser" property="cuserpasswd" /></td>
<td><jsp:getProperty name="CUser" property="cuserlname" /></td>
<td><jsp:getProperty name="CUser" property="cuserfname" /></td>
</tr>
</table>



</body>
</html>