$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.groupId=$currentel.find(".oogroupId").val();
        oo.attendTime=$currentel.find(".ooattendTime").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.rtId=$currentel.find(".oortId").val();
        $.ajax({
            url: "/db/rtAttendInfo/update.do",
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