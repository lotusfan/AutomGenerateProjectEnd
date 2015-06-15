<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>tdicDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/tdic.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>CID</td>
        <td>CKEY</td>
        <td>CSTATUS</td>
        <td>CTYPE</td>
        <td>CVALUE</td>
    </tr>
    <c:forEach var="oo" items="${tdic}">
        <tr>
        <td><input class="ooCID" value="${oo.CID}" readonly="true" /></td>
        <td><input class="ooCKEY" value="${oo.CKEY}" /></td>
        <td><input class="ooCSTATUS" value="${oo.CSTATUS}" /></td>
        <td><input class="ooCTYPE" value="${oo.CTYPE}" /></td>
        <td><input class="ooCVALUE" value="${oo.CVALUE}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>