$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.conAmount=$currentel.find(".ooconAmount").val();
        oo.type=$currentel.find(".ootype").val();
        oo.payDate=$currentel.find(".oopayDate").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.bizId=$currentel.find(".oobizId").val();
        $.ajax({
            url: "/db/userConsume/update.do",
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