$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.startTime=$currentel.find(".oostartTime").val();
        oo.endTime=$currentel.find(".ooendTime").val();
        oo.moneyTotal=$currentel.find(".oomoneyTotal").val();
        oo.operator=$currentel.find(".oooperator").val();
        oo.operateTime=$currentel.find(".oooperateTime").val();
        oo.foundStatus=$currentel.find(".oofoundStatus").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.description=$currentel.find(".oodescription").val();
        oo.address=$currentel.find(".ooaddress").val();
        oo.label=$currentel.find(".oolabel").val();
        oo.title=$currentel.find(".ootitle").val();
        oo.sequence=$currentel.find(".oosequence").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.supUrl=$currentel.find(".oosupUrl").val();
        $.ajax({
            url: "/db/cfProduct/update.do",
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