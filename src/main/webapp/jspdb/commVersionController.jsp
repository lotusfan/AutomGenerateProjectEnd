<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>commVersionControllerDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/commVersionController.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>mtType</td>
        <td>versionCodeOld</td>
        <td>versionCodeNew</td>
        <td>upContent</td>
        <td>upTime</td>
        <td>path</td>
        <td>createTime</td>
        <td>updateTime</td>
    </tr>
    <c:forEach var="oo" items="${commVersionController}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oomtType" value="${oo.mtType}" /></td>
        <td><input class="ooversionCodeOld" value="${oo.versionCodeOld}" /></td>
        <td><input class="ooversionCodeNew" value="${oo.versionCodeNew}" /></td>
        <td><input class="ooupContent" value="${oo.upContent}" /></td>
        <td><input class="ooupTime" value="${oo.upTime}" /></td>
        <td><input class="oopath" value="${oo.path}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>