$("input[name=userId]").blur(function(){
    var inputStatus = {
        userIdValid:false,
    };

    if(!userId) return;

    $.ajax({
        url:"http://localhost:8888/rest/member/id?memberId="+userId,
        method:"get",
        success:function(resp){
            if(resp == "NNNNY"){
                inputStatus.memberIdValid = true;
            }
            else if(resp == "NNNNN"){
                $("input[name=userId]").next("span").text("이미 사용중인 아이디입니다");
                inputStatus.memberIdValid = false;
            }
        }
    });

});