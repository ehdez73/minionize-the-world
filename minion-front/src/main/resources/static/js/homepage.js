$(document)
  .ready(function() {

    $('.ui.button').click(function() {
    	
      // minion-ipsum
      $.ajax({
        url: "/api/ipsum/minion-ipsum",
        context: document.body
      }).done(function(data) {
    	  $("#ipsum").text(data)
      })
      
      // minion-character
      $.ajax({
         url: "/api/characters/minion-character",
         context: document.body
      }).done(function(data) {
    	  $("#minion-name").text(data.name);
    	  $("#minion-image").attr("src", data.image).attr("alt", data.name);
      })


    });
    
  })
;