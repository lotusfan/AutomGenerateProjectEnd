$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.type=$currentel.find(".ootype").val();
        oo.cashAmount=$currentel.find(".oocashAmount").val();
        oo.dticketAmount=$currentel.find(".oodticketAmount").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.sourceType=$currentel.find(".oosourceType").val();
        oo.statusValid=$currentel.find(".oostatusValid").val();
        oo.statusUse=$currentel.find(".oostatusUse").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.bizId=$currentel.find(".oobizId").val();
        oo.bizTitle=$currentel.find(".oobizTitle").val();
        oo.bizType=$currentel.find(".oobizType").val();
        oo.noOrder=$currentel.find(".oonoOrder").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.checkCode=$currentel.find(".oocheckCode").val();
        $.ajax({
            url: "/db/transInfo/update.do",
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