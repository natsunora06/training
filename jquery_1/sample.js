
var name , setname ;
$(function(){
    $(".mini").css("opacity","0.5").hover(up,down).hover(changePhoto);
});
function up(){
    $(this).css("opacity","1.0")
        .css("cursor","pointer")
        .css("margin-top","10px").css("margin-bottom","30px");
}
function down(){
    $(this).css("opacity","0.5")
        .css("margin-top","20px").css("margin-bottom","20px");
}

function changePhoto() {
    fname = $(this).attr("src");
    // frame = img/pic2.jpg
    var array = fname.split('/');
    // ["img", "pic2.jpg"]
    setname = array[0] + "/b_" + array[1];
    // img + /b_ + pic2.jpg
    $("#bigPic").attr("src", setname);
    // setname = "img/b_pic2.jpg"
}
function changingPhoto() {
    $('#bigPic').fadeIn();
}
function changingPhoto(){
    $('#bigPic').fadeOut();
}