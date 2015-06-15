<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>userConsumeDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/userConsume.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>conAmount</td>
        <td>type</td>
        <td>payDate</td>
        <td>status</td>
        <td>userId</td>
        <td>bizId</td>
    </tr>
    <c:forEach var="oo" items="${userConsume}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="ooconAmount" value="${oo.conAmount}" /></td>
        <td><input class="ootype" value="${oo.type}" /></td>
        <td><input class="oopayDate" value="${oo.payDate}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oobizId" value="${oo.bizId}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>