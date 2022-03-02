<%@ include file="/header_footer/header.jsp" %>

<c:url value="/accueil" var="monLien"/>

<table class="table" id="tableMatch">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Joueur</th>
      <th scope="col">Email</th>
      <th scope="col">Match n°</th>
    </tr>
  </thead>
  <tbody>
	  <c:forEach items="${ListeMatch}" var="element">
	  	<tr>
	      <th scope="row">${element.getId()}</th>
	      <td>${element.getPlayerIdMatch().getNickname() }</td>
	      <td>${element.getPlayerIdMatch().getEmail() }</td>
	      <td>${element.getContest_id() }</td>
	    </tr>
	  </c:forEach>
  </tbody>
</table>
<!--  FORMULAIRE ADD PLAYER OF THE MATCH. -->
<form class="row g-3" method="post" action="<%= request.getContextPath() %>/ajouter_player_match">
	  <div class="col-md-4">
	    <label for="add_player_match" class="form-label">Ajouter un joueur à ce match</label>
	    <select name="add_player_match" id="add_player_match" required>
	    
		    	<c:forEach items="${listePlayer }" var="element">
		    	<option value="${element.getId() }">${element.getNickname()}</option>
		    	</c:forEach> 
		    
	    </select>
	  </div>
	  
	  <div class="col-12">
	    <button class="btn btn-primary" type="submit">AJOUTER JOUEUR</button>
	  </div>
	</form>
 
<%@ include file="/header_footer/footer.jsp" %>