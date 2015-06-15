$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.logName=$currentel.find(".oologName").val();
        oo.cashAmount=$currentel.find(".oocashAmount").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.transType=$currentel.find(".ootransType").val();
        oo.noOrder=$currentel.find(".oonoOrder").val();
        $.ajax({
            url: "/db/payLogInfo/update.do",
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