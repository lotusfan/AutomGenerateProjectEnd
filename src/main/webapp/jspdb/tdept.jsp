<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>tdeptDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/tdept.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>CID</td>
        <td>CDESC</td>
        <td>CICONCLS</td>
        <td>CNAME</td>
        <td>CSEQ</td>
        <td>CPID</td>
        <td>comCoed</td>
        <td>ctArea</td>
    </tr>
    <c:forEach var="oo" items="${tdept}">
        <tr>
        <td><input class="ooCID" value="${oo.CID}" readonly="true" /></td>
        <td><input class="ooCDESC" value="${oo.CDESC}" /></td>
        <td><input class="ooCICONCLS" value="${oo.CICONCLS}" /></td>
        <td><input class="ooCNAME" value="${oo.CNAME}" /></td>
        <td><input class="ooCSEQ" value="${oo.CSEQ}" /></td>
        <td><input class="ooCPID" value="${oo.CPID}" /></td>
        <td><input class="oocomCoed" value="${oo.comCoed}" /></td>
        <td><input class="ooctArea" value="${oo.ctArea}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>