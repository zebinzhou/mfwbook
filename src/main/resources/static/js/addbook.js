	$('#add').bind('click', function() {
		var nameVal = $('#add-input').val();
		$.post("/addbook", { bookName :nameVal}, function(data){
	       $('tbody').append('<tr><td class="text-center">'+ data.bookName + '</td><td class="text-center">'+ data.bookTypes +'</td><td class="text-center">'+ data.author + '</td></tr>');
	    });
	  });