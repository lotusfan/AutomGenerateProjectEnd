$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.id=$currentel.find(".ooid").val();
        oo.crowdfundId=$currentel.find(".oocrowdfundId").val();
        oo.content=$currentel.find(".oocontent").val();
        oo.address=$currentel.find(".ooaddress").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.title=$currentel.find(".ootitle").val();
        $.ajax({
            url: "/db/cfProductDiary/update.do",
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