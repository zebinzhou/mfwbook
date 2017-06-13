	$('#add').bind('click', function() {
		var nameVal = $('#add-input').val();
		$.get("/addbook", { bookName :nameVal}, function(data){
	       $('tbody').append('<tr><td class="text-center">'+ data.bookName + '</td><td class="text-center">'+ data.bookTypes +'</td><td class="text-center">'+ data.author + 
	    		   '</td><td class="text-center"><button class="btn btn-danger btn-sm">删除</button></td></tr>');
	    });
	  });