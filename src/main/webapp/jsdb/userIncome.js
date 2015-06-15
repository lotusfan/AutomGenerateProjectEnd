$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.incAmount=$currentel.find(".ooincAmount").val();
        oo.type=$currentel.find(".ootype").val();
        oo.transNo=$currentel.find(".ootransNo").val();
        oo.transResult=$currentel.find(".ootransResult").val();
        oo.userId=$currentel.find(".oouserId").val();
        oo.incTime=$currentel.find(".ooincTime").val();
        $.ajax({
            url: "/db/userIncome/update.do",
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