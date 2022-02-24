<%@ include file="/header_footer/header.jsp" %>
    Je dois mettre ici la liste des jeux de société, des joueurs et des matchs (avec leur résultat ?)
<table class="table" id="tablePlayer">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Email</th>
      <th scope="col">Pseudonyme</th>
    </tr>
  </thead>
  <tbody>
	  <c:forEach items="${ListePlayer }" var="element">
	  	<tr>
	      <th scope="row">${element.getId()}</th>
	      <td>${element.getEmail() }</td>
	      <td>${element.getNickname() }</td>
	     </tr>
	  </c:forEach>
  </tbody>
</table>
<table class="table" id="tableGame">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Titre</th>
      <th scope="col">Mininum de joueurs</th>
      <th scope="col">Maximum de joueurs</th>
    </tr>
  </thead>
  <tbody>
	  <c:forEach items="${ListeGame }" var="element">
	  	<tr>
	      <th scope="row">${element.getId()}</th>
	      <td>${element.getTitle() }</td>
	      <td>${element.getMinPlayers() }</td>
	      <td>${element.getMaxPlayers() }</td>
	     </tr>
	  </c:forEach>
  </tbody>
</table>
    
<%@ include file="/header_footer/footer.jsp" %>