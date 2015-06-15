$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.dticketAmount=$currentel.find(".oodticketAmount").val();
        oo.cashAmount=$currentel.find(".oocashAmount").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.statusValid=$currentel.find(".oostatusValid").val();
        oo.statusUse=$currentel.find(".oostatusUse").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.bizId=$currentel.find(".oobizId").val();
        oo.bizType=$currentel.find(".oobizType").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        $.ajax({
            url: "/db/transLog/update.do",
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