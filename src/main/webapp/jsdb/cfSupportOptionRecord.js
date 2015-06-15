$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.productId=$currentel.find(".ooproductId").val();
        oo.noOrder=$currentel.find(".oonoOrder").val();
        oo.supOptionId=$currentel.find(".oosupOptionId").val();
        oo.supportAmount=$currentel.find(".oosupportAmount").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.recieveAddr=$currentel.find(".oorecieveAddr").val();
        $.ajax({
            url: "/db/cfSupportOptionRecord/update.do",
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