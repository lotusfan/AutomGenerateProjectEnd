$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.rtId=$currentel.find(".oortId").val();
        oo.activeTime=$currentel.find(".ooactiveTime").val();
        oo.attendNum=$currentel.find(".ooattendNum").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.groupDesc=$currentel.find(".oogroupDesc").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        $.ajax({
            url: "/db/rtGroupInfo/update.do",
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