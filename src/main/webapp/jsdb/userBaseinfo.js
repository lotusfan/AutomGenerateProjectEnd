$(document).ready(function () {

    $(".alb").click(function(){
        var $currentel = $(this).parent().parent();

        var oo = new Object();
        oo.userId=$currentel.find(".oouserId").val();
        oo.nickName=$currentel.find(".oonickName").val();
        oo.realName=$currentel.find(".oorealName").val();
        oo.sex=$currentel.find(".oosex").val();
        oo.birth=$currentel.find(".oobirth").val();
        oo.bloodType=$currentel.find(".oobloodType").val();
        oo.occupation=$currentel.find(".oooccupation").val();
        oo.company=$currentel.find(".oocompany").val();
        oo.invitationCode=$currentel.find(".ooinvitationCode").val();
        oo.dticketAmount=$currentel.find(".oodticketAmount").val();
        oo.coffersAmount=$currentel.find(".oocoffersAmount").val();
        oo.idcard=$currentel.find(".ooidcard").val();
        oo.loginName=$currentel.find(".oologinName").val();
        oo.password=$currentel.find(".oopassword").val();
        oo.registerTime=$currentel.find(".ooregisterTime").val();
        oo.mylabel=$currentel.find(".oomylabel").val();
        oo.bankAccount=$currentel.find(".oobankAccount").val();
        oo.age=$currentel.find(".ooage").val();
        oo.dreamid=$currentel.find(".oodreamid").val();
        oo.email=$currentel.find(".ooemail").val();
        oo.address=$currentel.find(".ooaddress").val();
        oo.createTime=$currentel.find(".oocreateTime").val();
        oo.updateTime=$currentel.find(".ooupdateTime").val();
        oo.recieveAddr=$currentel.find(".oorecieveAddr").val();
        oo.isFirstcompleteinfo=$currentel.find(".ooisFirstcompleteinfo").val();
        oo.isAdmin=$currentel.find(".ooisAdmin").val();
        $.ajax({
            url: "/db/userBaseinfo/update.do",
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