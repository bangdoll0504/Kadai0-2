<%@page contentType="text/html; charset=UTF-8"%>

<html>
<body>
<jsp:useBean id="Admin"  class="beansdomain.Admin" scope="session" />

検索結果
<table border="1">
<tr><th>商品ID</th><th>定価</th><th>価格</th><th>商品名</th></tr>
<tr>
<td><jsp:getProperty name="Admin" property="adminid" /></td>
<td><jsp:getProperty name="Admin" property="passwd" /></td>
<td><jsp:getProperty name="Admin" property="lastname" /></td>
<td><jsp:getProperty name="Admin" property="firstname" /></td>
</tr>
</table>



</body>
</html>