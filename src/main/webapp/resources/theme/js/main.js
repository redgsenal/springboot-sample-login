console.log("hello");
/*$("#validate").on("submit", function(event) {
	event.preventDefault();
	
	var username = $("input[name=username]").val();
	var password = $("input[name=password]").val();  

	$.ajax({
		url: "/validate",
		type: 'POST',
		data: {
			name: username,
			password: password
		},
		contentType: 'application/json',
		beforeSend: function(xhr) {
			var tok = username + ':' + password;
			var hash = btoa(tok);			
			xhr.setRequestHeader('Authorization', hash);
		},
		async: false
	}).done(function(data, status, xqhxr){
		console.log("done!");
	});
});*/