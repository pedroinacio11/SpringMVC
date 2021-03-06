<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pedro.inacio
  Date: 13/03/2017
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head>
    <title>Livros de java, Android, Iphone, PHP, Ruby e muito mais - Casa do código</title>
</head>
<body>

<form action="/produtos" method="post">
  <div>
    <label>Título</label>
    <input type="text" name="titulo" />
  </div>
  <div>
    <label>Descrição</label>
    <textarea rows="10" cols="20"
              name="descricao"></textarea>
  </div>
    <div>
        <label>Páginas</label>
        <input type="text" name="paginas" />
    </div>

    <c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
        <div>
            <label>${tipoPreco}</label>
            <input type="text" name="precos[${status.index}].valor" />
            <input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}">
        </div>
    </c:forEach>

  <button type="submit">Cadastrar</button>
</form>

</body>
</html>
