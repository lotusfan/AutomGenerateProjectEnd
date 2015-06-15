$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.type=$currentel.find(".ootype").val();
        oo.dataCode=$currentel.find(".oodataCode").val();
        oo.dataName=$currentel.find(".oodataName").val();
        oo.status=$currentel.find(".oostatus").val();
        $.ajax({
            url: "/db/commDataInfo/update.do",
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