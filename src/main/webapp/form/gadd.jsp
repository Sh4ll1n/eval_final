<%@ include file="/header_footer/header.jsp" %>

	<form class="row g-3" method="post" action="<%= request.getContextPath() %>/ajouter_jeu">
	  <div class="col-md-4">
	    <label for="title_game" class="form-label">Titre du jeu</label>
	    <input type="text" class="form-control" id="title_game" name="title_game" placeholder="Titre du jeu..." required>
	  </div>
	  <div class="col-md-4">
	    <label for="min_players" class="form-label">Nombre minimum de joueurs</label>
	    <input type="text" class="form-control" id="min_players" name="min_players" placeholder="minimum 1..." required>
	  </div>
	  <div class="col-md-4">
	    <label for="max_players" class="form-label">Nombre maximum de joueurs</label>
	    <input type="text" class="form-control" id="max_players" name="max_players" placeholder="...jusqu'a 99" required>
	  </div>
	  
	  <div class="col-12">
	    <button class="btn btn-primary" type="submit">Submit form</button>
	  </div>
	</form>
	
<%@ include file="/header_footer/footer.jsp" %>