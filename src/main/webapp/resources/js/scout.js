/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function enlaceActivo(){
       url = $(location).attr('pathname');
       indice = url.lastIndexOf("/");
       cadena = url.substring(indice+1,url.length-6);
       $("#"+cadena).toggleClass("active");
}

$( document ).ready(function() {
  // Handler for .ready() called.
    enlaceActivo();
});
