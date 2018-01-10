JavaScript
$.ajax({
    url: 'data.json',
    dataType: 'json',
    data: {name: 'chara'},
    success: function(data){
        var dataArray = data.charas;

        $.each(dataArray, function(i){
            $(".nameData").append("<p>id: " + dataArray[i].id + "　Character: " + dataArray[i].chara + "　　(CV: " + dataArray[i].cv + ")</p>");
        });
    }
});