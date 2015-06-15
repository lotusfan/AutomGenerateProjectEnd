<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>payLogInfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/payLogInfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>logName</td>
        <td>cashAmount</td>
        <td>userId</td>
        <td>status</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>transType</td>
        <td>noOrder</td>
    </tr>
    <c:forEach var="oo" items="${payLogInfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oologName" value="${oo.logName}" /></td>
        <td><input class="oocashAmount" value="${oo.cashAmount}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="ootransType" value="${oo.transType}" /></td>
        <td><input class="oonoOrder" value="${oo.noOrder}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>