$(function() {
	$("#gugudanOut").click(function() {
		var help = document.getElementById('help');
		var dan = parseInt($("#dan").val());

		if (2> dan || 9 < dan) {
			alert("2단부터 9단까지만 출력할 수 있어!");
		}else if(isNaN(dan)){
			alert("단을 입력해줘.");
		}else{
			$(".addDan").remove();
			
			var str ="";
			for(var i=1; i<10; i++){
				str += "<pre class='addDan'>";
				for(var j=1; j<dan; j++){
					str += ((j+1) + 'x' + i +'=' + i*(j+1) + "	");
				}
				str += "</pre>";
				help.insertAdjacentHTML('beforeend', str);
				str = "";
			}
		}
	});
	
	$("#userList").click(function(){
		$(location).attr('href', "/userList");
	});
});