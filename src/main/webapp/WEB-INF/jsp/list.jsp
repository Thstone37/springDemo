<%--
  Created by IntelliJ IDEA.
  User: zhangshulei
  Date: 2017/8/23
  Time: 上午3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<div>图书列表</div>
<ul><c:forEach items="${list}" var="book">
    <li>图书id---${book.bookId}----图书名字------${book.name}</li>
</c:forEach></ul>
</body>
</html>
