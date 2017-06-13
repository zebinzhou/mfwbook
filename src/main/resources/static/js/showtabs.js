$('ul.test li a').on('click', function() {
	var linkIndex = $('ul.test li a').index(this);
	$('.test li').removeClass('active');
	$(".test li:eq(" + linkIndex + ")").show();
	$(this).parent().addClass('active');
	return false;
})