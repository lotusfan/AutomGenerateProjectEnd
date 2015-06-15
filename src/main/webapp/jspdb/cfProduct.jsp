<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>cfProductDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/cfProduct.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>userId</td>
        <td>startTime</td>
        <td>endTime</td>
        <td>moneyTotal</td>
        <td>operator</td>
        <td>operateTime</td>
        <td>foundStatus</td>
        <td>status</td>
        <td>description</td>
        <td>address</td>
        <td>label</td>
        <td>title</td>
        <td>sequence</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>supUrl</td>
    </tr>
    <c:forEach var="oo" items="${cfProduct}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oostartTime" value="${oo.startTime}" /></td>
        <td><input class="ooendTime" value="${oo.endTime}" /></td>
        <td><input class="oomoneyTotal" value="${oo.moneyTotal}" /></td>
        <td><input class="oooperator" value="${oo.operator}" /></td>
        <td><input class="oooperateTime" value="${oo.operateTime}" /></td>
        <td><input class="oofoundStatus" value="${oo.foundStatus}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oodescription" value="${oo.description}" /></td>
        <td><input class="ooaddress" value="${oo.address}" /></td>
        <td><input class="oolabel" value="${oo.label}" /></td>
        <td><input class="ootitle" value="${oo.title}" /></td>
        <td><input class="oosequence" value="${oo.sequence}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="oosupUrl" value="${oo.supUrl}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>