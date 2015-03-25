$(document)
  .ready(function() {

    $('.ui.dropdown').dropdown();

    $('.ui.button').click(function() {
    	
      // minion-ipsum
      $.ajax({
        url: "/api/ipsum/minion-ipsum",
        context: document.body
      
      }).done(function(data) {
    	  $("#ipsum").text(data.message)
      
      }).fail(function(){
        $("#ipsum").text("Ahhhhh! No banana")
      })
      
      // minion-character
      $.ajax({
         url: "/api/characters/minion-character",
         context: document.body
      
      }).done(function(data) {
    	  $("#minion-name").text(data.name);
    	  $("#minion-image").attr("src", data.image).attr("alt", data.name);
      
      }).fail(function() {
        $("#minion-name").text("Evil");
        $("#minion-image").attr("src", "img/minion-evil.png").attr("alt", "Evil");
      })


    });
    
  })
;