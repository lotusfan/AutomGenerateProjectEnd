$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.productId=$currentel.find(".ooproductId").val();
        oo.supportName=$currentel.find(".oosupportName").val();
        oo.supportDescription=$currentel.find(".oosupportDescription").val();
        oo.supportAmount=$currentel.find(".oosupportAmount").val();
        oo.seqencing=$currentel.find(".ooseqencing").val();
        oo.serviceMoney=$currentel.find(".ooserviceMoney").val();
        oo.limitNum=$currentel.find(".oolimitNum").val();
        oo.requiteTime=$currentel.find(".oorequiteTime").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        $.ajax({
            url: "/db/cfSupportOption/update.do",
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