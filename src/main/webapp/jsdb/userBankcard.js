$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.bankName=$currentel.find(".oobankName").val();
        oo.bankCode=$currentel.find(".oobankCode").val();
        oo.cardType=$currentel.find(".oocardType").val();
        oo.cardNo=$currentel.find(".oocardNo").val();
        oo.activeFlag=$currentel.find(".ooactiveFlag").val();
        oo.activeDate=$currentel.find(".ooactiveDate").val();
        oo.bankBranchName=$currentel.find(".oobankBranchName").val();
        $.ajax({
            url: "/db/userBankcard/update.do",
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