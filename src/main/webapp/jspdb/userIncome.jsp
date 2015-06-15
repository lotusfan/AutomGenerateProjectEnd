<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>userIncomeDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/userIncome.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>incAmount</td>
        <td>type</td>
        <td>transNo</td>
        <td>transResult</td>
        <td>userId</td>
        <td>incTime</td>
    </tr>
    <c:forEach var="oo" items="${userIncome}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="ooincAmount" value="${oo.incAmount}" /></td>
        <td><input class="ootype" value="${oo.type}" /></td>
        <td><input class="ootransNo" value="${oo.transNo}" /></td>
        <td><input class="ootransResult" value="${oo.transResult}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="ooincTime" value="${oo.incTime}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>