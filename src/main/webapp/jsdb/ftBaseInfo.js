$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.title=$currentel.find(".ootitle").val();
        oo.label=$currentel.find(".oolabel").val();
        oo.amount=$currentel.find(".ooamount").val();
        oo.address=$currentel.find(".ooaddress").val();
        oo.period=$currentel.find(".ooperiod").val();
        oo.yearProfit=$currentel.find(".ooyearProfit").val();
        oo.planProd=$currentel.find(".ooplanProd").val();
        oo.profitDealMd=$currentel.find(".ooprofitDealMd").val();
        oo.subscPeriod=$currentel.find(".oosubscPeriod").val();
        oo.subscCondi=$currentel.find(".oosubscCondi").val();
        oo.returnDate=$currentel.find(".ooreturnDate").val();
        oo.valueDate=$currentel.find(".oovalueDate").val();
        oo.isEarlyRedeem=$currentel.find(".ooisEarlyRedeem").val();
        oo.profitCalcMd=$currentel.find(".ooprofitCalcMd").val();
        oo.buyChannel=$currentel.find(".oobuyChannel").val();
        oo.fee=$currentel.find(".oofee").val();
        oo.investFee=$currentel.find(".ooinvestFee").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.tripDoc=$currentel.find(".ootripDoc").val();
        oo.feeDoc=$currentel.find(".oofeeDoc").val();
        oo.signDoc=$currentel.find(".oosignDoc").val();
        oo.noticeDoc=$currentel.find(".oonoticeDoc").val();
        oo.backDoc=$currentel.find(".oobackDoc").val();
        oo.kindlyReminder=$currentel.find(".ookindlyReminder").val();
        oo.operator=$currentel.find(".oooperator").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.operatorTime=$currentel.find(".oooperatorTime").val();
        $.ajax({
            url: "/db/ftBaseInfo/update.do",
            type: "POST",
            data: $.toJSON(oo),
            dataType: "json",
            contentType:"application/json",
            success: function (data) {
                alert(data.msg);
            },
            error: function () {
                alert("请求失败");
            }
        });
    });
});