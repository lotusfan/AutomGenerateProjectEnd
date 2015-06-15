$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.startTime=$currentel.find(".oostartTime").val();
        oo.endTime=$currentel.find(".ooendTime").val();
        oo.moneyTotal=$currentel.find(".oomoneyTotal").val();
        oo.description=$currentel.find(".oodescription").val();
        oo.address=$currentel.find(".ooaddress").val();
        oo.dwType=$currentel.find(".oodwType").val();
        oo.title=$currentel.find(".ootitle").val();
        oo.sequence=$currentel.find(".oosequence").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        $.ajax({
            url: "/db/cfDwProduct/update.do",
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