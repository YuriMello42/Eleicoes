<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/votacao.css" type="text/css">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css">

<title>Votação - DataInfo</title>



<script type="text/javascript">
	function Reset() {
		document.getElementById("NumeroCandidato").value = "";

	}

	function inserir(valor) {
		document.getElementById("NumeroCandidato").value += valor;
	}
</script>
</head>
<body>

	<div class="topo">
		<center>Vote no seu Candidato!</center>
	</div>

	<div class="foto">

		<img class="fotoV" name="Default" alt="Default"
			src="css/img/default.jpg"
			style="position: absolute; top: 240px; left: 420px; width: 50px; height: 90px; display: none;" />


	</div>

	<container class="mae"> 
	
	<label name="lteste" value="2"> </label>
	
	<input type="text"
		name="NumeroCandidato" maxlength="5" id="NumeroCandidato"
		style="width: 200px; height: 60px; background: none; border: none; color: white;">
	</container>



	<container class="filha">
	
		<div class="123">
			<input type="submit" name="bNumero" class="BotaoUrna" value="1" onclick="inserir(1)" > 
			<input type="submit" name="bNumero" class="BotaoUrna" value="2" onclick="inserir(2)">
			<input type="submit" name="bNumero" class="BotaoUrna" value="3" onclick="inserir(3)">
		</div>

		<div class="456">
			<input type="submit" name="bNumero" class="BotaoUrna" value="4" onclick="inserir(4)"> 
			<input type="submit" name="bNumero" class="BotaoUrna" value="5" onclick="inserir(5)">
			<input type="submit" name="bNumero" class="BotaoUrna" value="6" onclick="inserir(6)">
		</div>

		<div class="789">
			<input type="submit" name="bNumero" class="BotaoUrna" value="7" onclick="inserir(7)"> 
			<input type="submit" name="bNumero" class="BotaoUrna" value="8" onclick="inserir(8)">
			<input type="submit" name="bNumero" class="BotaoUrna" value="9" onclick="inserir(9)">		
			</div>
		<div class="b0">
			<input type="submit" name="bNumero" class="BotaoUrna" value="0" onclick="inserir(0)">
		</div>
	
	
<form action="" method="post">
		<div class="botoes">
			<input type="submit" name="bVotacao" class="bBranco" value="Branco">
			<input type="submit" name="bVotacao" class="bCorrige" value="Corrige" onclick="Reset()"> 
			<input type="submit" name="bVotacao" class="bEntrar" value="Confirma">
		</div>
	</form>


	</container>

</body>
</html>