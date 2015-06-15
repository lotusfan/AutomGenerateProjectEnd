<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>rtAttendInfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/rtAttendInfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>groupId</td>
        <td>attendTime</td>
        <td>userId</td>
        <td>rtId</td>
    </tr>
    <c:forEach var="oo" items="${rtAttendInfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oogroupId" value="${oo.groupId}" /></td>
        <td><input class="ooattendTime" value="${oo.attendTime}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oortId" value="${oo.rtId}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>