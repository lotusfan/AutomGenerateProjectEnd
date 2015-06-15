<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>tuserDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/tuser.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>CID</td>
        <td>CCREATEDATETIME</td>
        <td>CEMAIL</td>
        <td>CMODIFYDATETIME</td>
        <td>CNAME</td>
        <td>CPWD</td>
        <td>CREALNAME</td>
        <td>CSN</td>
        <td>CSTATUS</td>
        <td>CDEPTID</td>
    </tr>
    <c:forEach var="oo" items="${tuser}">
        <tr>
        <td><input class="ooCID" value="${oo.CID}" readonly="true" /></td>
        <td><input class="ooCCREATEDATETIME" value="${oo.CCREATEDATETIME}" /></td>
        <td><input class="ooCEMAIL" value="${oo.CEMAIL}" /></td>
        <td><input class="ooCMODIFYDATETIME" value="${oo.CMODIFYDATETIME}" /></td>
        <td><input class="ooCNAME" value="${oo.CNAME}" /></td>
        <td><input class="ooCPWD" value="${oo.CPWD}" /></td>
        <td><input class="ooCREALNAME" value="${oo.CREALNAME}" /></td>
        <td><input class="ooCSN" value="${oo.CSN}" /></td>
        <td><input class="ooCSTATUS" value="${oo.CSTATUS}" /></td>
        <td><input class="ooCDEPTID" value="${oo.CDEPTID}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>