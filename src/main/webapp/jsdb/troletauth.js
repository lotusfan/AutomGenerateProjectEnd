$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.CID=$currentel.find(".ooCID").val();
        oo.CAUTHID=$currentel.find(".ooCAUTHID").val();
        oo.CROLEID=$currentel.find(".ooCROLEID").val();
        $.ajax({
            url: "/db/troletauth/update.do",
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