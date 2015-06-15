<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>userBaseinfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/userBaseinfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>userId</td>
        <td>nickName</td>
        <td>realName</td>
        <td>sex</td>
        <td>birth</td>
        <td>bloodType</td>
        <td>occupation</td>
        <td>company</td>
        <td>invitationCode</td>
        <td>dticketAmount</td>
        <td>coffersAmount</td>
        <td>idcard</td>
        <td>loginName</td>
        <td>password</td>
        <td>registerTime</td>
        <td>mylabel</td>
        <td>bankAccount</td>
        <td>age</td>
        <td>dreamid</td>
        <td>email</td>
        <td>address</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>recieveAddr</td>
        <td>isFirstcompleteinfo</td>
        <td>isAdmin</td>
    </tr>
    <c:forEach var="oo" items="${userBaseinfo}">
        <tr>
        <td><input class="oouserId" value="${oo.userId}" readonly="true" /></td>
        <td><input class="oonickName" value="${oo.nickName}" /></td>
        <td><input class="oorealName" value="${oo.realName}" /></td>
        <td><input class="oosex" value="${oo.sex}" /></td>
        <td><input class="oobirth" value="${oo.birth}" /></td>
        <td><input class="oobloodType" value="${oo.bloodType}" /></td>
        <td><input class="oooccupation" value="${oo.occupation}" /></td>
        <td><input class="oocompany" value="${oo.company}" /></td>
        <td><input class="ooinvitationCode" value="${oo.invitationCode}" /></td>
        <td><input class="oodticketAmount" value="${oo.dticketAmount}" /></td>
        <td><input class="oocoffersAmount" value="${oo.coffersAmount}" /></td>
        <td><input class="ooidcard" value="${oo.idcard}" /></td>
        <td><input class="oologinName" value="${oo.loginName}" /></td>
        <td><input class="oopassword" value="${oo.password}" /></td>
        <td><input class="ooregisterTime" value="${oo.registerTime}" /></td>
        <td><input class="oomylabel" value="${oo.mylabel}" /></td>
        <td><input class="oobankAccount" value="${oo.bankAccount}" /></td>
        <td><input class="ooage" value="${oo.age}" /></td>
        <td><input class="oodreamid" value="${oo.dreamid}" /></td>
        <td><input class="ooemail" value="${oo.email}" /></td>
        <td><input class="ooaddress" value="${oo.address}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="oorecieveAddr" value="${oo.recieveAddr}" /></td>
        <td><input class="ooisFirstcompleteinfo" value="${oo.isFirstcompleteinfo}" /></td>
        <td><input class="ooisAdmin" value="${oo.isAdmin}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>