<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh" content="1" url="http://localhost:8080/Eleicao/votacao.jsp">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/votacao.css">
<link rel="stylesheet" href="css/bootstrap.css">

<title>Votação - DataInfo</title>


</head>
<body>
	<div class="topo">
		<center>Vote no seu Candidato!</center>
	</div>

	<container class="mae"> 
	
	<table class="tg position-absolute top-50 start-50 translate-middle"></table>
	 
	 <tr>
	  <th class="tg-0lax">
	  <label name="PrimeiroNumero">1</label>
	  </th>
	  
	  <th class="tg-0lax">
	  <label name="SegundoNumero">2</label>
	  </th>
	  
	 </tr> 
	 	
	<%-- 
	<input type="text" class="InserirNumero" id="n1" name="n1" maxlength="1">
	<input type="text" class="InserirNumero" id="n2" name="n2" maxlength="1">
	<input type="text" class="InserirNumero" id="n3" name="n3" maxlength="1">
	<input type="text" class="InserirNumero" id="n4" name="n4" maxlength="1">
	<input type="text" class="InserirNumero" id="n5" name="n5" maxlength="1">
	--%>
	
	</container>
	
	
	
	<container class="filha">
	
	<div class="123">
	<button class="BotaoUrna">1</button>
	<button class="BotaoUrna">2</button>
	<button class="BotaoUrna">3</button>
	</div>
	
	<div class="456">
	<button class="BotaoUrna">4</button>
	<button class="BotaoUrna">5</button>
	<button class="BotaoUrna">6</button>
	</div>
	
	<div class="789">
	<button class="BotaoUrna">7</button>
	<button class="BotaoUrna">8</button>
	<button class="BotaoUrna">9</button>
	</div>
	
	<div class="b0">
	<button class="BotaoUrna">0</button>
	</div>
	
	<div class="botoes">
	<button class="bBranco">Branco</button>
	<button class="bCorrige">Corrige</button>
	<button class="bEntrar">Confirma</button>
	</div>
	
	
	</container>
	


<container class="Est">
	<a href="Contagem.jsp"> <img id="iEstatistica" alt="Estatistica de Votação" src="css/img/estImagem.png" style="width: 90px; height: 90px;position:absolute;top:500px;left:1250px;"/></a>
</container>
</body>
</html>