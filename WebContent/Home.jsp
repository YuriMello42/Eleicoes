<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bem vindo as Eleições</title>
<link rel="stylesheet" href="Bootstrap.css">
<link rel="Stylesheet" href="css/Home.css">

<style type="text/css" >

body{

background-image: url("fundoEleicoes.jpg");
background-repeat: no-repeat;
background-size: cover;

}

</style>

<script>
function HabiDsabi() {
	  if (document.getElementById('habi').checked == true) {
	    document.getElementById('envia').disabled = ""
	  }
	  if (document.getElementById('habi').checked == false) {
	    document.getElementById('envia').disabled = "disabled"
	  }
	}

function votar(){
	  window.location.href = "votacao.jsp"
	}
</script>

</head>
<body>

<div class="topoHome">
<center>Clique para comecar!</center>
</div>


<div >
<p>
    <input type="checkbox" name="habi" id="habi" onClick="HabiDsabi()"> Eu li e aceito os termos de uso 
    <a target="_blank" href="TDU.html">termos de uso</a>.
  </p>
 <input type="button" class="btn btn-terciary"  name="envia" id="envia" value="Votar" onclick="votar()" disabled>
 
</div>




<container class="Est">
	<a href="Contagem.jsp"> <img id="iEstatistica" alt="Estatistica de Votação" src="css/img/estImagem.png" style="width: 90px; height: 90px;position:absolute;top:500px;left:1250px;"/></a>
</container>

<%-- 
<button class="bVotar" name="bVotar">VOTAR</button>
--%>
</body>
</html>