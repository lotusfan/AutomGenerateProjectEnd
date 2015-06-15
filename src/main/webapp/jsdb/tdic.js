$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.CID=$currentel.find(".ooCID").val();
        oo.CKEY=$currentel.find(".ooCKEY").val();
        oo.CSTATUS=$currentel.find(".ooCSTATUS").val();
        oo.CTYPE=$currentel.find(".ooCTYPE").val();
        oo.CVALUE=$currentel.find(".ooCVALUE").val();
        $.ajax({
            url: "/db/tdic/update.do",
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