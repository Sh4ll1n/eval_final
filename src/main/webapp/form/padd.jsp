<%@ include file="/header_footer/header.jsp" %>

	<form class="row g-3" method="post" action="<%= request.getContextPath() %>/ajouter_joueur">
	  <div class="col-md-4">
	    <label for="email" class="form-label">Email</label>
	    <input type="email" class="form-control" id="email" name="email" placeholder="Entrez votre e-mail..." required>
	  </div>
	  <div class="col-md-4">
	    <label for="nickname" class="form-label">Pseudonyme</label>
	    <input type="text" class="form-control" id="nickname" name="nickname" placeholder="Entrez votre pseudonyme..." required>
	  </div>
	  
	  <div class="col-12">
	    <button class="btn btn-primary" type="submit">Submit form</button>
	  </div>
	</form>
	
<%@ include file="/header_footer/footer.jsp" %>