<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
   
    <c:url value="/accueil" var="monLien"/>
    <c:url value="/ajouter_jeu" var="monLien2"/>
    <c:url value="/ajouter_joueur" var="monLien3"/> 
    <c:url value="/ajouter_match" var="monLien4"/> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scoreboard</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<%-- Coucou je suis le commentaire --%>
<!-- Salut moi aussi je suis un commentaire -->
<body>
	<div class="container">
    <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
      <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
        <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
      </a>

      <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
        <li><a href="${monLien }" class="nav-link px-2 link-dark">Accueil</a></li>
        
        <li><a href="${monLien2 }" class="nav-link px-2 link-dark">Ajouter un jeu</a></li>
        
        <li><a href="${monLien3 }" class="nav-link px-2 link-dark">Ajouteur un joueur</a></li>
        
        <li><a href="${monLien4 }" class="nav-link px-2 link-dark">Ajouter un match</a></li>
      </ul>

    </header>
  </div>
