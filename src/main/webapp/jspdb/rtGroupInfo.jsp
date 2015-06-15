<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>rtGroupInfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/rtGroupInfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>rtId</td>
        <td>activeTime</td>
        <td>attendNum</td>
        <td>userId</td>
        <td>groupDesc</td>
        <td>status</td>
        <td>createTime</td>
    </tr>
    <c:forEach var="oo" items="${rtGroupInfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oortId" value="${oo.rtId}" /></td>
        <td><input class="ooactiveTime" value="${oo.activeTime}" /></td>
        <td><input class="ooattendNum" value="${oo.attendNum}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oogroupDesc" value="${oo.groupDesc}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>