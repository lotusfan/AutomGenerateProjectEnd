$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.peopleNum=$currentel.find(".oopeopleNum").val();
        oo.roomNum=$currentel.find(".ooroomNum").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.regTime=$currentel.find(".ooregTime").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.dcId=$currentel.find(".oodcId").val();
        $.ajax({
            url: "/db/dcRegInfo/update.do",
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