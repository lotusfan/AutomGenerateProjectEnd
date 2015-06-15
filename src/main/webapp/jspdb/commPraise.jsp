<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>commPraiseDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/commPraise.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>userId</td>
        <td>bizId</td>
        <td>bizType</td>
        <td>createTime</td>
        <td>praiseType</td>
    </tr>
    <c:forEach var="oo" items="${commPraise}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oobizId" value="${oo.bizId}" /></td>
        <td><input class="oobizType" value="${oo.bizType}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="oopraiseType" value="${oo.praiseType}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>