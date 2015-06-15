$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.bizId=$currentel.find(".oobizId").val();
        oo.bizType=$currentel.find(".oobizType").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.praiseType=$currentel.find(".oopraiseType").val();
        $.ajax({
            url: "/db/commPraise/update.do",
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