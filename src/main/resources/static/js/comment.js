$('#comment').on('click', function() {
    $.post("/comment", function() {
    	var comment="<div class=\"bookComments\" th:each=\"bookcomment: ${books.comments}\">" +
    			"<p><span th:text=\"${bookcomment.userName}\"></span></p>" + 
    			"<p><span th:text=\"${bookcomment.releaseDate}\"></span></p>" +
    			"<p><span th:text=\"${bookcomment.comment}\"</p>" +
    			"<p><span th:text=\"${bookcomment.upvoke}\"></span>" + 
    			"</div>";
    	$('#appendComment').append(comment);
    });
});