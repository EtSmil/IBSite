/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



    
var myIndex = 0;
//showhide();
carousel();
function showhide() {

    
//    var divs = document.getElementsByClassName("mySlides");
   var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
   
       $(x[i]).fadeIn("slow");
    }
    
     myIndex++;
    if (myIndex > x.length) {myIndex = 1;}    
   $(x[myIndex-1]).fadeIn("slow");
    setTimeout(showhide, 2000); // Change image every 2 seconds
      
   

}

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 7000); // Change image every 2 seconds
}


