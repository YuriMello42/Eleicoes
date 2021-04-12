package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet("/sEleicao")
public class sEleicao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StringBuffer bufferNumeroVereador = new StringBuffer();
	private StringBuffer bufferDadosVereador = new StringBuffer();
	private List<Vereador> lVereadores = new ArrayList<>();

	public void init() {
		lVereadores.addAll(bdVereador.carregarVereador());

	}

	public sEleicao() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Gestao gestao = new Gestao();

		HashMap<String, Vereador> vVereador = new HashMap<>();
		HashMap<String, cBranco> vBrancoVereador = new HashMap<>();

		String fDestino = "/Home.jsp";
		String bVotacao = request.getParameter("bVotacao");
		
		
		if (request.getSession().getAttribute("vVereador") != null) {
			vVereador = (HashMap<String,Vereador>) request.getSession().getAttribute("vVereador");
		}
		if(bVotacao != null) {
			
		}

	}

}
