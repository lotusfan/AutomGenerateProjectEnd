<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>dcRegInfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/dcRegInfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>peopleNum</td>
        <td>roomNum</td>
        <td>userId</td>
        <td>regTime</td>
        <td>status</td>
        <td>dcId</td>
    </tr>
    <c:forEach var="oo" items="${dcRegInfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oopeopleNum" value="${oo.peopleNum}" /></td>
        <td><input class="ooroomNum" value="${oo.roomNum}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="ooregTime" value="${oo.regTime}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oodcId" value="${oo.dcId}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>