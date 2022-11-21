$(function(){
    $("login-input").blur(checkId);
    $("login-input").blur(checkPassword);
    $("#password-check").blur(checkPasswordRe);

    function checkId(){
        var regex = /^[a-z][a-z0-9]{5,20}$/;
        $(this).removeClass("success fail");
        if(regex.test($(this).val())){
            $(this).addClass("success");
            return true;
        }else{
            $(this).addClass("fail");
            return false;
        }
    }
    function checkPassword(){
        var regex = /^(?=.*[!@#$])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9!@#$]{8,16}$/;
        $(this).removeClass("success fail");
        if(regex.test($(this).val())){
            $(this).addClass("success");
            return true;
        }else{
            $(this).addClass("fail");
            return false;
        }
    }
    function checkPasswordRe(){
        $(this).removeClass("success fail");
        if($(this).val() == $("input[name=userPw]").val()){
            $(this).addClass("success");
            return true;
        }else{
            $(this).addClass("fail");
            return false;
        }
    }
    $(".form-check").submit(function(){
        return checkId() && checkPassword() && checkPasswordRe();
    });

});