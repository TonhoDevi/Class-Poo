package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import estoques.ProdutoEstoque;
import menus.Inicial;
import models.Produto;
import services.ProdutoService;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Produto> armazem = new ArrayList<>();	
		ProdutoService funcProd = new ProdutoService();
		ProdutoEstoque bancoDados = new ProdutoEstoque();
		armazem = bancoDados.uploadEstoque();
		Inicial menuInicial = new Inicial();
		menuInicial.showMenu(armazem);
		
	}

}
