<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>userBankcardDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/userBankcard.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>userId</td>
        <td>bankName</td>
        <td>bankCode</td>
        <td>cardType</td>
        <td>cardNo</td>
        <td>activeFlag</td>
        <td>activeDate</td>
        <td>bankBranchName</td>
    </tr>
    <c:forEach var="oo" items="${userBankcard}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oobankName" value="${oo.bankName}" /></td>
        <td><input class="oobankCode" value="${oo.bankCode}" /></td>
        <td><input class="oocardType" value="${oo.cardType}" /></td>
        <td><input class="oocardNo" value="${oo.cardNo}" /></td>
        <td><input class="ooactiveFlag" value="${oo.activeFlag}" /></td>
        <td><input class="ooactiveDate" value="${oo.activeDate}" /></td>
        <td><input class="oobankBranchName" value="${oo.bankBranchName}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>