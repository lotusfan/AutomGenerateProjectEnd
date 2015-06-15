<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>transLogDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/transLog.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>dticketAmount</td>
        <td>cashAmount</td>
        <td>userId</td>
        <td>statusValid</td>
        <td>statusUse</td>
        <td>status</td>
        <td>bizId</td>
        <td>bizType</td>
        <td>createTime</td>
        <td>updateTime</td>
    </tr>
    <c:forEach var="oo" items="${transLog}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oodticketAmount" value="${oo.dticketAmount}" /></td>
        <td><input class="oocashAmount" value="${oo.cashAmount}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oostatusValid" value="${oo.statusValid}" /></td>
        <td><input class="oostatusUse" value="${oo.statusUse}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oobizId" value="${oo.bizId}" /></td>
        <td><input class="oobizType" value="${oo.bizType}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>