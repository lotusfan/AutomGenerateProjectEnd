$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.inviteCode=$currentel.find(".ooinviteCode").val();
        oo.id=$currentel.find(".ooid").val();
        $.ajax({
            url: "/db/userInvite/update.do",
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