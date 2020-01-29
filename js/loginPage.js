function validatePassword(){
    console.log("validate PAssword called");
    var passwd = document.forms["studentLogin"]["password"].value;
    if( !/[A-Z]/.test(passwd) || !/[a-z]/.test(passwd) || passwd.length<6){
        alert("Password should be of minimum 6 characters and should contain atleast one uppercase and one lowercase letter");
        window.onbeforeunload = function() {
            return "";
          }
        //debugger;
    }
    //debugger;
}