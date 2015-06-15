<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>commDataInfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/commDataInfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>type</td>
        <td>dataCode</td>
        <td>dataName</td>
        <td>status</td>
    </tr>
    <c:forEach var="oo" items="${commDataInfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="ootype" value="${oo.type}" /></td>
        <td><input class="oodataCode" value="${oo.dataCode}" /></td>
        <td><input class="oodataName" value="${oo.dataName}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>