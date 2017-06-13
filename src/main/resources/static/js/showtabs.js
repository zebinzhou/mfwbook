$(document).ready(function() {

	// 默认显示用户书单列表 "在读的书"
	$('.bookList').hide();
	$('.bookList:first').show();
	$('.test li: first').addClass('active');

});

$('ul.test li a').on('click', function() {
	var linkIndex = $('ul.test li a').index(this);
	$('.test li').removeClass('active');
	$(".bookList:visible").hide();
	$(".bookList:eq(" + linkIndex + ")").show();
	$(this).parent().addClass('active');
	return false;
})
