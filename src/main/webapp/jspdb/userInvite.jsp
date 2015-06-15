<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>userInviteDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/userInvite.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>createTime</td>
        <td>userId</td>
        <td>inviteCode</td>
        <td>id</td>
    </tr>
    <c:forEach var="oo" items="${userInvite}">
        <tr>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="ooinviteCode" value="${oo.inviteCode}" /></td>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>