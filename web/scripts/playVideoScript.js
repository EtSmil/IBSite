/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


playBtn = document.getElementById("playBtn");
replayBtn = document.getElementById("replay-Btn");
  carImg  = document.getElementById("carImg"); 
  carVideo = document.getElementById("carVideo"); 

carImg.addEventListener("click",function(){
    carImg.style.display = "none";
    carVideo.style.display = "block";  
    carVideo.play();

 //carVideo.addEventListener('ended',showButton,false);
    setTimeout(showButton, 5000);
});
playBtn.addEventListener("click",function(){
    carImg.style.display = "none";
    playBtn.style.display = "none";
    carVideo.style.display = "block";  
    carVideo.play();

 //carVideo.addEventListener('ended',showButton,false);
    setTimeout(showButton, 2000);
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