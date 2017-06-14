
		function addComment(id) {

			var inputComment = $('#input-comment').val();
			  
			$.get("/addcomment", {
				comment : inputComment,
				bookId : id
			}, function(data) {
				window.location.reload();
//				var comment = "<div class=\"bookComments\">" + "<p><span>"
//						+ data.user.name + "</span></p>" + "<p><span>"
//						+ data.releaseDate + "</span></p>" + "<p><span>"
//						+ data.content + "</span></p>" + "<p><span>"
//						+ data.upvote + "</span></p>" + "</div>";
//				$('#appendComment').html("评论成功");
			});
		}
