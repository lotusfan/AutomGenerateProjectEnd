<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>cfProductDiaryDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/cfProductDiary.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>crowdfundId</td>
        <td>content</td>
        <td>address</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>title</td>
    </tr>
    <c:forEach var="oo" items="${cfProductDiary}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oocrowdfundId" value="${oo.crowdfundId}" /></td>
        <td><input class="oocontent" value="${oo.content}" /></td>
        <td><input class="ooaddress" value="${oo.address}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="ootitle" value="${oo.title}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>