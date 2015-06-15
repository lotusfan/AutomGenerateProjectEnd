<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>cfSupportOptionDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/cfSupportOption.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>productId</td>
        <td>supportName</td>
        <td>supportDescription</td>
        <td>supportAmount</td>
        <td>seqencing</td>
        <td>serviceMoney</td>
        <td>limitNum</td>
        <td>requiteTime</td>
        <td>createTime</td>
        <td>updateTime</td>
    </tr>
    <c:forEach var="oo" items="${cfSupportOption}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="ooproductId" value="${oo.productId}" /></td>
        <td><input class="oosupportName" value="${oo.supportName}" /></td>
        <td><input class="oosupportDescription" value="${oo.supportDescription}" /></td>
        <td><input class="oosupportAmount" value="${oo.supportAmount}" /></td>
        <td><input class="ooseqencing" value="${oo.seqencing}" /></td>
        <td><input class="ooserviceMoney" value="${oo.serviceMoney}" /></td>
        <td><input class="oolimitNum" value="${oo.limitNum}" /></td>
        <td><input class="oorequiteTime" value="${oo.requiteTime}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>