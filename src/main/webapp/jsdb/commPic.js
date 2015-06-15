$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.bizType=$currentel.find(".oobizType").val();
        oo.bizId=$currentel.find(".oobizId").val();
        oo.flag=$currentel.find(".ooflag").val();
        oo.suffix=$currentel.find(".oosuffix").val();
        oo.url=$currentel.find(".oourl").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        $.ajax({
            url: "/db/commPic/update.do",
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