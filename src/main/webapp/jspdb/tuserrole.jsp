<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>tuserroleDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/tuserrole.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>CID</td>
        <td>CROLEID</td>
        <td>CUSERID</td>
    </tr>
    <c:forEach var="oo" items="${tuserrole}">
        <tr>
        <td><input class="ooCID" value="${oo.CID}" readonly="true" /></td>
        <td><input class="ooCROLEID" value="${oo.CROLEID}" /></td>
        <td><input class="ooCUSERID" value="${oo.CUSERID}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>