/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/* pop up video*/
/*
$(document).foundation();

var tag = document.createElement('script');

tag.src = "https://www.youtube.com/iframe_api";
var firstScriptTag = document.getElementsByTagName('script')[0];
firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

// 3. This function creates an <iframe> (and YouTube player)
//    after the API code downloads.
var player;

function onYouTubeIframeAPIReady() {
    player = new YT.Player('player', {
        height: '315',
        width: '560',
        videoId: 'l-gQLqv9f4o',
        events: {
            'onStateChange': onPlayerStateChange
        }
    });
}


function onPlayerStateChange(event) {
    if (event.data == YT.PlayerState.PLAYING) {
      //player is playing
    } else {
      //player is paused
    }
}

function stopVideo() {
    player.stopVideo();
}

function playVideo() {
  player.playVideo();
}

function pauseVideo() {
  player.pauseVideo();
}


$(document).on('opened.fndtn.reveal', '[data-reveal]', function () {
    playVideo();
});

$(document).on('closed.fndtn.reveal', '[data-reveal]', function () {
  pauseVideo();
});


/* pop up video*/


/*



playBtn = document.getElementById("playBtn");
playBtn1 = document.getElementById("playBtn1");
replayBtn = document.getElementById("replay-Btn");
  carImg  = document.getElementById("carImg"); 
  carVideo = document.getElementById("carVideo"); 







playBtn1.addEventListener("click",function(){



    
});










carImg.addEventListener("click",function(){
    carImg.style.display = "none";
    carVideo.style.display = "block";  
    carVideo.play();

 carVideo.addEventListener('ended',showButton,false);
    
});
playBtn.addEventListener("click",function(){
    carImg.style.display = "none";
    playBtn.style.display = "none";
    carVideo.style.display = "block";  
    carVideo.play();

 carVideo.addEventListener('ended',showButton,false);
    
});


carVideo.addEventListener("click",function(){
 if(carVideo.paused){
     carVideo.play();
playBtn.style.display ="none";
     
 }else{
     carVideo.pause();
playBtn.style.display ="block";
 }
 

});

var showButton = function(){
   
    carVideo.load();
    carImg.style.display = "block";
    playBtn.style.display = "block";
     carVideo.style.display = "none";  
   
};



*/
