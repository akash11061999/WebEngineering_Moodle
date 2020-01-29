function showDiv1() {
   console.log("Show DIV1");
   document.getElementById("DIV1").style.display = "block";
   document.getElementById("DIV2").style.display = "none";
}
function showDiv2() {
   console.log("Show DIV2");
   document.getElementById("DIV2").style.display = "block";
   document.getElementById("DIV1").style.display = "none";
}

function test(){
   console.log("Rendering Quiz Page 2");
}