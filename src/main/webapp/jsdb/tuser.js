$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.CID=$currentel.find(".ooCID").val();
        oo.CCREATEDATETIME=$currentel.find(".ooCCREATEDATETIME").val();
        oo.CEMAIL=$currentel.find(".ooCEMAIL").val();
        oo.CMODIFYDATETIME=$currentel.find(".ooCMODIFYDATETIME").val();
        oo.CNAME=$currentel.find(".ooCNAME").val();
        oo.CPWD=$currentel.find(".ooCPWD").val();
        oo.CREALNAME=$currentel.find(".ooCREALNAME").val();
        oo.CSN=$currentel.find(".ooCSN").val();
        oo.CSTATUS=$currentel.find(".ooCSTATUS").val();
        oo.CDEPTID=$currentel.find(".ooCDEPTID").val();
        $.ajax({
            url: "/db/tuser/update.do",
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