$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.name=$currentel.find(".ooname").val();
        oo.description=$currentel.find(".oodescription").val();
        oo.status=$currentel.find(".oostatus").val();
        oo.parentId=$currentel.find(".ooparentId").val();
        $.ajax({
            url: "/db/commArea/update.do",
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