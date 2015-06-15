$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.CID=$currentel.find(".ooCID").val();
        oo.CDESC=$currentel.find(".ooCDESC").val();
        oo.CNAME=$currentel.find(".ooCNAME").val();
        oo.CSEQ=$currentel.find(".ooCSEQ").val();
        oo.CURL=$currentel.find(".ooCURL").val();
        oo.CPID=$currentel.find(".ooCPID").val();
        $.ajax({
            url: "/db/tauth/update.do",
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