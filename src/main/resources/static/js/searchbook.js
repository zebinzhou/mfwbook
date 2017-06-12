$('#search').on('click', function() {
	      var input = $('#search-input').val();
	      var options = $('#sel option:selected').val();
	    	  $.post("/s", {className:"书名",s:input}, function(data) {
		          $('#showBook').html(data[0].bookName);
		      });
	      return true;
	  });