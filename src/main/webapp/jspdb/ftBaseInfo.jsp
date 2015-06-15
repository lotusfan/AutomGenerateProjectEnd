<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>ftBaseInfoDB</title>
    <script src="<c:url value="/jsdb/jquery-1.11.1.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/jquery.json-2.4.js"/> " language="JavaScript"></script>
    <script src="<c:url value="/jsdb/ftBaseInfo.js"/> " language="JavaScript"></script></head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>title</td>
        <td>label</td>
        <td>amount</td>
        <td>address</td>
        <td>period</td>
        <td>yearProfit</td>
        <td>planProd</td>
        <td>profitDealMd</td>
        <td>subscPeriod</td>
        <td>subscCondi</td>
        <td>returnDate</td>
        <td>valueDate</td>
        <td>isEarlyRedeem</td>
        <td>profitCalcMd</td>
        <td>buyChannel</td>
        <td>fee</td>
        <td>investFee</td>
        <td>createTime</td>
        <td>updateTime</td>
        <td>tripDoc</td>
        <td>feeDoc</td>
        <td>signDoc</td>
        <td>noticeDoc</td>
        <td>backDoc</td>
        <td>kindlyReminder</td>
        <td>operator</td>
        <td>status</td>
        <td>operatorTime</td>
    </tr>
    <c:forEach var="oo" items="${ftBaseInfo}">
        <tr>
        <td><input class="ooid" value="${oo.id}" readonly="true" /></td>
        <td><input class="ootitle" value="${oo.title}" /></td>
        <td><input class="oolabel" value="${oo.label}" /></td>
        <td><input class="ooamount" value="${oo.amount}" /></td>
        <td><input class="ooaddress" value="${oo.address}" /></td>
        <td><input class="ooperiod" value="${oo.period}" /></td>
        <td><input class="ooyearProfit" value="${oo.yearProfit}" /></td>
        <td><input class="ooplanProd" value="${oo.planProd}" /></td>
        <td><input class="ooprofitDealMd" value="${oo.profitDealMd}" /></td>
        <td><input class="oosubscPeriod" value="${oo.subscPeriod}" /></td>
        <td><input class="oosubscCondi" value="${oo.subscCondi}" /></td>
        <td><input class="ooreturnDate" value="${oo.returnDate}" /></td>
        <td><input class="oovalueDate" value="${oo.valueDate}" /></td>
        <td><input class="ooisEarlyRedeem" value="${oo.isEarlyRedeem}" /></td>
        <td><input class="ooprofitCalcMd" value="${oo.profitCalcMd}" /></td>
        <td><input class="oobuyChannel" value="${oo.buyChannel}" /></td>
        <td><input class="oofee" value="${oo.fee}" /></td>
        <td><input class="ooinvestFee" value="${oo.investFee}" /></td>
        <td><input class="oocreateTime" value="${oo.createTime}" /></td>
        <td><input class="ooupdateTime" value="${oo.updateTime}" /></td>
        <td><input class="ootripDoc" value="${oo.tripDoc}" /></td>
        <td><input class="oofeeDoc" value="${oo.feeDoc}" /></td>
        <td><input class="oosignDoc" value="${oo.signDoc}" /></td>
        <td><input class="oonoticeDoc" value="${oo.noticeDoc}" /></td>
        <td><input class="oobackDoc" value="${oo.backDoc}" /></td>
        <td><input class="ookindlyReminder" value="${oo.kindlyReminder}" /></td>
        <td><input class="oooperator" value="${oo.operator}" /></td>
        <td><input class="oostatus" value="${oo.status}" /></td>
        <td><input class="oooperatorTime" value="${oo.operatorTime}" /></td>
        <td><button class="alb">修改</button></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>