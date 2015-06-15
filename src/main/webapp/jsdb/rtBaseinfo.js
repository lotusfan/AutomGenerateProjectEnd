$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.content=$currentel.find(".oocontent").val();
        oo.title=$currentel.find(".ootitle").val();
        oo.suitableNum=$currentel.find(".oosuitableNum").val();
        oo.originalPrice=$currentel.find(".oooriginalPrice").val();
        oo.perConsum=$currentel.find(".ooperConsum").val();
        oo.label=$currentel.find(".oolabel").val();
        oo.areaCode=$currentel.find(".ooareaCode").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.operator=$currentel.find(".oooperator").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.operatorTime=$currentel.find(".oooperatorTime").val();
        oo.sequence=$currentel.find(".oosequence").val();
        oo.detailUrl=$currentel.find(".oodetailUrl").val();
        $.ajax({
            url: "/db/rtBaseinfo/update.do",
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