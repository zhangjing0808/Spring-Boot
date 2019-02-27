<%--
  Created by IntelliJ IDEA.
  User: zhangjing
  Date: 2019/2/27
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>sno</td>
        <td>sname</td>
        <td>ssex</td>
    </tr>
    <c:forEach items="${students}" var="s" varStatus="st">
        <tr>
            <td>${s.sno}</td>
            <td>${s.sname}</td>
            <td>${s.ssex}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
