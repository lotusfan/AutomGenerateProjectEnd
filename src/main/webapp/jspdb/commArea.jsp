<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>commAreaDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/commArea.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>description</td>
        <td>status</td>
        <td>parentId</td>
    </tr>
    <c:forEach var="oo" items="${commArea}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="ooname" value="${oo.name}" /></td>
        <td><input class="oodescription" value="${oo.description}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="ooparentId" value="${oo.parentId}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>