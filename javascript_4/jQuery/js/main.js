$(function(){
  setTimeout('act()');   //アニメーションを実行
});

function act() {
  $("#target").animate({
    top: "350px"
  }, 3000).animate({
    top:"10px"
  }, 0)
  setTimeout("act()", 3000);
}
