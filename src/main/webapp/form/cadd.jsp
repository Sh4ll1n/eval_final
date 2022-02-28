<%@ include file="/header_footer/header.jsp" %>
	<form class="row g-3" method="post" action="<%= request.getContextPath() %>/ajouter_match">
	  <div class="col-md-4">
	    <label for="select_game" class="form-label">Sélectionner un jeu</label>
	    <select name="select_game" id="select_game" required>
	    		<!--  items pour parcourir ma liste que j'ai mis dans le doGet
	    		var=element OSEF
	    		value = ce que j'envois 
	    		 -->
		    	<c:forEach items="${listeGame }" var="element">
		    	<option value="${element.getId() }">${element.getTitle()}</option>
		    	</c:forEach> 
		    
	    </select>
	  </div>
	  
	  <div class="col-12">
	    <button class="btn btn-primary" type="submit">Submit form</button>
	  </div>
	</form>
<%@ include file="/header_footer/footer.jsp" %>