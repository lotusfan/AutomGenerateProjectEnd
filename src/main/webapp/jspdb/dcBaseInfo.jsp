<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>dcBaseInfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/dcBaseInfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>content</td>
        <td>title</td>
        <td>consumAmount</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>userId</td>
        <td>status</td>
        <td>label</td>
        <td>areaCode</td>
    </tr>
    <c:forEach var="oo" items="${dcBaseInfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oocontent" value="${oo.content}" /></td>
        <td><input class="ootitle" value="${oo.title}" /></td>
        <td><input class="ooconsumAmount" value="${oo.consumAmount}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oolabel" value="${oo.label}" /></td>
        <td><input class="ooareaCode" value="${oo.areaCode}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>