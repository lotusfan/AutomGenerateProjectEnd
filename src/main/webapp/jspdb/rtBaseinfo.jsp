<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>rtBaseinfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/rtBaseinfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>content</td>
        <td>title</td>
        <td>suitableNum</td>
        <td>originalPrice</td>
        <td>perConsum</td>
        <td>label</td>
        <td>areaCode</td>
        <td>userId</td>
        <td>status</td>
        <td>operator</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>operatorTime</td>
        <td>sequence</td>
        <td>detailUrl</td>
    </tr>
    <c:forEach var="oo" items="${rtBaseinfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="oocontent" value="${oo.content}" /></td>
        <td><input class="ootitle" value="${oo.title}" /></td>
        <td><input class="oosuitableNum" value="${oo.suitableNum}" /></td>
        <td><input class="oooriginalPrice" value="${oo.originalPrice}" /></td>
        <td><input class="ooperConsum" value="${oo.perConsum}" /></td>
        <td><input class="oolabel" value="${oo.label}" /></td>
        <td><input class="ooareaCode" value="${oo.areaCode}" /></td>
        <td><input class="oouserId" value="${oo.userId}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oooperator" value="${oo.operator}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="oooperatorTime" value="${oo.operatorTime}" /></td>
        <td><input class="oosequence" value="${oo.sequence}" /></td>
        <td><input class="oodetailUrl" value="${oo.detailUrl}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>