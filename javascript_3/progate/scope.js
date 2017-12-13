// スコープ　2/5
var item = "手裏剣";
// 上記のitemは下のローカルスコープの下のitemに反映される

function attack(){
  var item = "忍者刀";
  // 上記のitemはローカルスコープ内のitemに反映される
  console.log("にんじゃわんこは" + item + "を使って攻撃した！");
}

attack();
console.log(item);
