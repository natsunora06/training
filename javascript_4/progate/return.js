// 戻り値　5/5
function attack(item){
  if(item === "晴れ"){
    return "洗濯物は外に干しましょう";
  }
  return "洗濯物は部屋干ししましょう";
}

console.log(attack ("曇り"));

// 関数attackの引数には例外を入力すると2番目のreturnが表示される
