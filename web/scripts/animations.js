if( /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent) ) {
 document.getElementById("whoSubheader").classList.add("fadein");
 document.getElementById("whoText").classList.add("fadein");


}
    
  $(window).scroll(function() {
		$('.fadeinAnimation').each(function(){
		var imagePos = $(this).offset().top;

		var topOfWindow = $(window).scrollTop();
			if (imagePos < topOfWindow+900) {
				$(this).addClass("fadein");
			}
		});
	
});  
    


$(window).scroll(function() {
		$('.slideLeftAnimation').each(function(){
		var imagePos = $(this).offset().top;

		var topOfWindow = $(window).scrollTop();
			if (imagePos < topOfWindow+900) {
				$(this).addClass("slideLeft");
			}
		});
	
});


$(window).scroll(function() {
		$('.slideRightAnimation').each(function(){
		var imagePos = $(this).offset().top;

		var topOfWindow = $(window).scrollTop();
			if (imagePos < topOfWindow+900) {
				$(this).addClass("slideRight");
			}
		});
	
});







$(window).scroll(function() {
    
		$('.goalcolHover').each(function(){
		var imagePos = $(this).offset().top;

		var topOfWindow = $(window).scrollTop();
			if (imagePos < topOfWindow+900) {
				$(this).addClass("slideUp");
			}
		});
	
});



