<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>cfSupportOptionRecordDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/cfSupportOptionRecord.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>productId</td>
        <td>noOrder</td>
        <td>supOptionId</td>
        <td>supportAmount</td>
        <td>userId</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>recieveAddr</td>
    </tr>
    <c:forEach var="oo" items="${cfSupportOptionRecord}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="ooproductId" value="${oo.productId}" /></td>
        <td><input class="oonoOrder" value="${oo.noOrder}" /></td>
        <td><input class="oosupOptionId" value="${oo.supOptionId}" /></td>
        <td><input class="oosupportAmount" value="${oo.supportAmount}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="oorecieveAddr" value="${oo.recieveAddr}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>